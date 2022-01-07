package com.patrickjameslawrence.spiritmagic.data.tag;

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
		tag(BlockTags.ROWAN_LOGS).add(Blocks.ROWAN_WOOD.get(), Blocks.STRIPPED_ROWAN_WOOD.get(), Blocks.ROWAN_LOG.get(), Blocks.STRIPPED_ROWAN_LOG.get());
		
		tag(net.minecraft.tags.BlockTags.PLANKS).add(Blocks.ROWAN_PLANKS.get());
		tag(net.minecraft.tags.BlockTags.LOGS_THAT_BURN).addTags(BlockTags.ROWAN_LOGS);
		tag(net.minecraft.tags.BlockTags.WOODEN_BUTTONS).add(Blocks.ROWAN_BUTTON.get());
		tag(net.minecraft.tags.BlockTags.WOODEN_DOORS).add(Blocks.ROWAN_DOOR.get());
		tag(net.minecraft.tags.BlockTags.WOODEN_STAIRS).add(Blocks.ROWAN_STAIRS.get());
		tag(net.minecraft.tags.BlockTags.WOODEN_SLABS).add(Blocks.ROWAN_SLAB.get());
		tag(net.minecraft.tags.BlockTags.WOODEN_FENCES).add(Blocks.ROWAN_FENCE.get());
		tag(net.minecraft.tags.BlockTags.WOODEN_PRESSURE_PLATES).add(Blocks.ROWAN_PRESSURE_PLATE.get());
		tag(net.minecraft.tags.BlockTags.WOODEN_TRAPDOORS).add(Blocks.ROWAN_TRAPDOOR.get());
		tag(net.minecraft.tags.BlockTags.LEAVES).add(Blocks.ROWAN_LEAVES.get());
	}
}
