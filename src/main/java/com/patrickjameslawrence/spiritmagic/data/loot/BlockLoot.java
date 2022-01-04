package com.patrickjameslawrence.spiritmagic.data.loot;

import java.util.stream.Collectors;

import com.patrickjameslawrence.spiritmagic.init.Blocks;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class BlockLoot extends net.minecraft.data.loot.BlockLoot {
	@Override
	protected void addTables() {
		dropSelf(Blocks.ROWAN_WOOD.get());
		dropSelf(Blocks.STRIPPED_ROWAN_WOOD.get());
		dropSelf(Blocks.ROWAN_LOG.get());
		dropSelf(Blocks.STRIPPED_ROWAN_LOG.get());
		dropSelf(Blocks.ROWAN_PLANKS.get());
	}
	
	

	@Override
	protected Iterable<Block> getKnownBlocks() {
		return Blocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
	}
}