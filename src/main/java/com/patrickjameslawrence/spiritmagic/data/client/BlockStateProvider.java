package com.patrickjameslawrence.spiritmagic.data.client;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;
import com.patrickjameslawrence.spiritmagic.init.Blocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStateProvider extends net.minecraftforge.client.model.generators.BlockStateProvider {

	public BlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, SpiritMagic.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		axisBlock((RotatedPillarBlock) Blocks.ROWAN_WOOD.get(), new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_log"), new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_log"));
        axisBlock((RotatedPillarBlock) Blocks.STRIPPED_ROWAN_WOOD.get(), new ResourceLocation(SpiritMagic.MOD_ID, "block/stripped_rowan_log"), new ResourceLocation(SpiritMagic.MOD_ID, "block/stripped_rowan_log"));
        logBlock((RotatedPillarBlock) Blocks.ROWAN_LOG.get());
        logBlock((RotatedPillarBlock) Blocks.STRIPPED_ROWAN_LOG.get());
        simpleBlock(Blocks.ROWAN_PLANKS.get());
	}

}
