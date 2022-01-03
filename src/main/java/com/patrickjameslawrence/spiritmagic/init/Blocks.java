package com.patrickjameslawrence.spiritmagic.init;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			SpiritMagic.MOD_ID);

	public static final RegistryObject<Block> ROWAN_WOOD = BLOCKS.register("rowan_wood", () -> new RotatedPillarBlock(
			BlockBehaviour.Properties.of(Material.WOOD, (blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MaterialColor.WOOD : MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)) {
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}
	});
	public static final RegistryObject<Block> STRIPPED_ROWAN_WOOD = BLOCKS.register("stripped_rowan_wood", () -> new RotatedPillarBlock(
			BlockBehaviour.Properties.of(Material.WOOD, (blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MaterialColor.WOOD : MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)) {
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}
	});
	public static final RegistryObject<Block> ROWAN_LOG = BLOCKS.register("rowan_log", () -> new RotatedPillarBlock(
			BlockBehaviour.Properties.of(Material.WOOD, (blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MaterialColor.WOOD : MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)) {
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}
	});
	public static final RegistryObject<Block> STRIPPED_ROWAN_LOG = BLOCKS.register("stripped_rowan_log", () -> new RotatedPillarBlock(
			BlockBehaviour.Properties.of(Material.WOOD, (blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MaterialColor.WOOD : MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)) {
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}
	});
	public static final RegistryObject<Block> ROWAN_PLANKS = BLOCKS.register("rowan_planks", () -> new Block(
			BlockBehaviour.Properties.of(Material.WOOD).strength(2.0f).sound(SoundType.WOOD)) {
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}
	});

}
