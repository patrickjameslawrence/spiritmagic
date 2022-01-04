package com.patrickjameslawrence.spiritmagic.init;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
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

	public static final RegistryObject<Block> ROWAN_WOOD = BLOCKS
			.register("rowan_wood",
					() -> new RotatedPillarBlock(
							BlockBehaviour.Properties
									.of(Material.WOOD,
											(blockState) -> blockState
													.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y
															? MaterialColor.WOOD
															: MaterialColor.WOOD)
									.strength(2.0F).sound(SoundType.WOOD)) {
						@Override
						public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos,
								Direction face) {
							return 5;
						}

						@Override
						public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
							return 5;
						}
					});
	public static final RegistryObject<Block> STRIPPED_ROWAN_WOOD = BLOCKS
			.register("stripped_rowan_wood",
					() -> new RotatedPillarBlock(
							BlockBehaviour.Properties
									.of(Material.WOOD,
											(blockState) -> blockState
													.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y
															? MaterialColor.WOOD
															: MaterialColor.WOOD)
									.strength(2.0F).sound(SoundType.WOOD)) {
						@Override
						public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos,
								Direction face) {
							return 5;
						}

						@Override
						public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
							return 5;
						}
					});
	public static final RegistryObject<Block> ROWAN_LOG = BLOCKS
			.register("rowan_log",
					() -> new RotatedPillarBlock(
							BlockBehaviour.Properties
									.of(Material.WOOD,
											(blockState) -> blockState
													.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y
															? MaterialColor.WOOD
															: MaterialColor.WOOD)
									.strength(2.0F).sound(SoundType.WOOD)) {
						@Override
						public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos,
								Direction face) {
							return 5;
						}

						@Override
						public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
							return 5;
						}
					});
	public static final RegistryObject<Block> STRIPPED_ROWAN_LOG = BLOCKS
			.register("stripped_rowan_log",
					() -> new RotatedPillarBlock(
							BlockBehaviour.Properties
									.of(Material.WOOD,
											(blockState) -> blockState
													.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y
															? MaterialColor.WOOD
															: MaterialColor.WOOD)
									.strength(2.0F).sound(SoundType.WOOD)) {
						@Override
						public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos,
								Direction face) {
							return 5;
						}

						@Override
						public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
							return 5;
						}
					});
	public static final RegistryObject<Block> ROWAN_PLANKS = BLOCKS.register("rowan_planks",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0f).sound(SoundType.WOOD)) {
				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});
	public static final RegistryObject<Block> ROWAN_STAIRS = BLOCKS.register("rowan_stairs",
			() -> new StairBlock(() -> ROWAN_PLANKS.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(ROWAN_PLANKS.get())) {
				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}
			});
	public static final RegistryObject<Block> ROWAN_SLAB = BLOCKS.register("rowan_slab", () -> new SlabBlock(
			BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)) {
		@Override
		public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
			return 20;
		}
	});
	public static final RegistryObject<Block> ROWAN_FENCE = BLOCKS.register("rowan_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, ROWAN_PLANKS.get().defaultMaterialColor())
					.strength(2.0F, 3.0F).sound(SoundType.WOOD)) {
				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}
			});
	public static final RegistryObject<Block> ROWAN_FENCE_GATE = BLOCKS.register("rowan_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, ROWAN_PLANKS.get().defaultMaterialColor())
					.strength(2.0F, 3.0F).sound(SoundType.WOOD)) {
				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}
			});
	public static final RegistryObject<Block> ROWAN_DOOR = BLOCKS.register("rowan_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, ROWAN_PLANKS.get().defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
	public static final RegistryObject<Block> ROWAN_TRAPDOOR = BLOCKS.register("rowan_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion().isValidSpawn(Blocks::never)));
	public static final RegistryObject<Block> ROWAN_PRESSURE_PLATE = BLOCKS.register("rowan_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, ROWAN_PLANKS.get().defaultMaterialColor()).noCollission().strength(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ROWAN_BUTTON = BLOCKS.register("rowan_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)));
    // public static final RegistryObject<Block> ROWAN_SIGN = BLOCKS.register("rowan_sign", () -> BlocksUtil.createSignBlock(WoodType.ROWAN));
    // public static final RegistryObject<Block> ROWAN_WALL_SIGN = BLOCKS.register("rowan_wall_sign", () -> BlocksUtil.createWallSignBlock(WoodType.ROWAN, Blocks.ROWAN_SIGN.get().getBlock()));
    // public static final RegistryObject<Block> ROWAN_SAPLING = BLOCKS.register("rowan_sapling", () -> BlocksUtil.createSaplingBlock(new RowanTree()));
    public static final RegistryObject<Block> ROWAN_LEAVES = BLOCKS.register("rowan_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never).isViewBlocking(Blocks::never)));

	// Copied from net.minecraft.world.level.Blocks.java
	private static Boolean never(BlockState p_50779_, BlockGetter p_50780_, BlockPos p_50781_, EntityType<?> p_50782_) {
		return (boolean)false;
	}
	
	private static boolean never(BlockState p_50806_, BlockGetter p_50807_, BlockPos p_50808_) {
		return false;
	}
	
	private static Boolean ocelotOrParrot(BlockState p_50822_, BlockGetter p_50823_, BlockPos p_50824_, EntityType<?> p_50825_) {
		return p_50825_ == EntityType.OCELOT || p_50825_ == EntityType.PARROT;
	}
}
