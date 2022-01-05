package com.patrickjameslawrence.spiritmagic.data.client;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;
import com.patrickjameslawrence.spiritmagic.init.Blocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStateProvider extends net.minecraftforge.client.model.generators.BlockStateProvider {

	public BlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, SpiritMagic.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		axisBlock((RotatedPillarBlock) Blocks.ROWAN_WOOD.get(),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_log"),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_log"));
		axisBlock((RotatedPillarBlock) Blocks.STRIPPED_ROWAN_WOOD.get(),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/stripped_rowan_log"),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/stripped_rowan_log"));
		logBlock((RotatedPillarBlock) Blocks.ROWAN_LOG.get());
		logBlock((RotatedPillarBlock) Blocks.STRIPPED_ROWAN_LOG.get());
		simpleBlock(Blocks.ROWAN_PLANKS.get());
		stairsBlock((StairBlock) Blocks.ROWAN_STAIRS.get(),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_planks"));
		slabBlock((SlabBlock) Blocks.ROWAN_SLAB.get(), new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_planks"),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_planks"));
		fenceBlock((FenceBlock) Blocks.ROWAN_FENCE.get(),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_planks"));
		fenceGateBlock((FenceGateBlock) Blocks.ROWAN_FENCE_GATE.get(),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_planks"));
		doorBlock((DoorBlock) Blocks.ROWAN_DOOR.get(),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_door_bottom"),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_door_top"));
		trapdoorBlock((TrapDoorBlock) Blocks.ROWAN_TRAPDOOR.get(),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_trapdoor"), true);
		pressurePlateBlock((PressurePlateBlock) Blocks.ROWAN_PRESSURE_PLATE.get(),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_planks"));
		buttonBlock((WoodButtonBlock) Blocks.ROWAN_BUTTON.get(),
				new ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_planks"));
		// simpleBlock(Blocks.ROWAN_SIGN.get(),
		// models().getBuilder(Blocks.ROWAN_SIGN.get().getRegistryName().getPath()).texture("particle",
		// modLoc("block/rowan_planks")));
		// simpleBlock(Blocks.ROWAN_WALL_SIGN.get(),
		// models().getBuilder(Blocks.ROWAN_WALL_SIGN.get().getRegistryName().getPath()).texture("particle",
		// modLoc("block/rowan_planks")));
		// simpleBlock(Blocks.ROWAN_SAPLING.get(),
		// models().cross(Blocks.ROWAN_SAPLING.get().getRegistryName().getPath(),
		// modLoc("block/rowan_sapling")));
		// leavesBlock((LeavesBlock) Blocks.ROWAN_LEAVES.get(), new
		// ResourceLocation(SpiritMagic.MOD_ID, "block/rowan_leaves"));
		getVariantBuilder(Blocks.ROWAN_LEAVES.get()).forAllStates(state -> {
			return ConfiguredModel.builder().modelFile(models()
					.withExistingParent(Blocks.ROWAN_LEAVES.get().getRegistryName().getPath(), "block/leaves")
					.texture("all", modLoc("block/rowan_leaves")))
					.build();
		});
	}
}
