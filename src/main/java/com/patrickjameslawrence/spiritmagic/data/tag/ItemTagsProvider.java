package com.patrickjameslawrence.spiritmagic.data.tag;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagsProvider extends net.minecraft.data.tags.ItemTagsProvider {

	public ItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagsProvider,
			ExistingFileHelper existingFileHelper) {
		super(dataGenerator, blockTagsProvider, SpiritMagic.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags() {
		this.copy(BlockTags.ROWAN_LOGS, ItemTags.ROWAN_LOGS);
		
		this.copy(net.minecraft.tags.BlockTags.PLANKS, net.minecraft.tags.ItemTags.PLANKS);
		this.copy(net.minecraft.tags.BlockTags.LOGS_THAT_BURN, net.minecraft.tags.ItemTags.LOGS_THAT_BURN);
        this.copy(net.minecraft.tags.BlockTags.LOGS, net.minecraft.tags.ItemTags.LOGS);
	}
}
