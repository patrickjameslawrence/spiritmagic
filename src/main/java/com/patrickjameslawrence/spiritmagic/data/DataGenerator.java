package com.patrickjameslawrence.spiritmagic.data;

import com.patrickjameslawrence.spiritmagic.data.client.BlockStateProvider;
import com.patrickjameslawrence.spiritmagic.data.client.ItemModelProvider;
import com.patrickjameslawrence.spiritmagic.data.client.LanguageProvider;
import com.patrickjameslawrence.spiritmagic.data.loot.LootTableProvider;
import com.patrickjameslawrence.spiritmagic.data.tag.BlockTagsProvider;
import com.patrickjameslawrence.spiritmagic.data.tag.ItemTagsProvider;

import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;


@Mod.EventBusSubscriber(modid = SpiritMagic.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		net.minecraft.data.DataGenerator dataGenerator = event.getGenerator();
    	ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
    	
    	BlockTagsProvider blockTagsProvider = new BlockTagsProvider(dataGenerator, existingFileHelper);
    	
    	dataGenerator.addProvider(blockTagsProvider);
    	dataGenerator.addProvider(new ItemTagsProvider(dataGenerator, blockTagsProvider, existingFileHelper));
    	dataGenerator.addProvider(new LootTableProvider(dataGenerator));
    	dataGenerator.addProvider(new RecipeProvider(dataGenerator));
    	
    	if (event.includeClient()) {
    		dataGenerator.addProvider(new LanguageProvider(dataGenerator, "en_us"));
    		dataGenerator.addProvider(new BlockStateProvider(dataGenerator, existingFileHelper));
    		dataGenerator.addProvider(new ItemModelProvider(dataGenerator, existingFileHelper));
    	}
	}
}
