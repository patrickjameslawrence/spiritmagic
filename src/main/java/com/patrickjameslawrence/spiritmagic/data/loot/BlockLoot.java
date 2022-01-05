package com.patrickjameslawrence.spiritmagic.data.loot;

import java.util.stream.Collectors;

import com.patrickjameslawrence.spiritmagic.init.Blocks;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class BlockLoot extends net.minecraft.data.loot.BlockLoot {
	private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
	
	@Override
	protected void addTables() {
		dropSelf(Blocks.ROWAN_WOOD.get());
		dropSelf(Blocks.STRIPPED_ROWAN_WOOD.get());
		dropSelf(Blocks.ROWAN_LOG.get());
		dropSelf(Blocks.STRIPPED_ROWAN_LOG.get());
		dropSelf(Blocks.ROWAN_PLANKS.get());
		dropSelf(Blocks.ROWAN_STAIRS.get());
		add(Blocks.ROWAN_SLAB.get(), BlockLoot::createSlabItemTable);
		dropSelf(Blocks.ROWAN_FENCE.get());
		dropSelf(Blocks.ROWAN_FENCE_GATE.get());
		add(Blocks.ROWAN_DOOR.get(), BlockLoot::createDoorTable);
		dropSelf(Blocks.ROWAN_TRAPDOOR.get());
        dropSelf(Blocks.ROWAN_PRESSURE_PLATE.get());
        dropSelf(Blocks.ROWAN_BUTTON.get());
        // dropSelf(Blocks.ROWAN_SIGN.get());
        // dropSelf(Blocks.ROWAN_SAPLING.get());
        // add(Blocks.ROWAN_LEAVES.get(), (block) -> createLeavesDrops(block, Blocks.ROWAN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(Blocks.ROWAN_LEAVES.get()); // TODO: Remove this line
	}
	
	

	@Override
	protected Iterable<Block> getKnownBlocks() {
		return Blocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
	}
}