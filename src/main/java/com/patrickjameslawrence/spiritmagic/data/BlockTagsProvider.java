package com.patrickjameslawrence.spiritmagic.data;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;
import com.patrickjameslawrence.spiritmagic.init.Blocks;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagsProvider extends net.minecraft.data.tags.BlockTagsProvider {

	public BlockTagsProvider(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, SpiritMagic.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags() {
		// TODO: Add crops and bee growables
		this.tag(BlockTags.ROWAN_LOGS).add(Blocks.ROWAN_WOOD.get(), Blocks.STRIPPED_ROWAN_WOOD.get(), Blocks.ROWAN_LOG.get(), Blocks.STRIPPED_ROWAN_LOG.get(), Blocks.ROWAN_PLANKS.get());
		
		this.tag(net.minecraft.tags.BlockTags.PLANKS).add(Blocks.ROWAN_PLANKS.get());
		this.tag(net.minecraft.tags.BlockTags.LOGS_THAT_BURN).addTags(BlockTags.ROWAN_LOGS);
	}
}
