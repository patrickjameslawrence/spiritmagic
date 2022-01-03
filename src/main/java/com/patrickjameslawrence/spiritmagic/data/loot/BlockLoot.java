package com.patrickjameslawrence.spiritmagic.data.loot;

import com.patrickjameslawrence.spiritmagic.init.Blocks;

public class BlockLoot extends net.minecraft.data.loot.BlockLoot {
	@Override
	protected void addTables() {
		this.dropSelf(Blocks.ROWAN_WOOD.get());
		this.dropSelf(Blocks.STRIPPED_ROWAN_WOOD.get());
		this.dropSelf(Blocks.ROWAN_LOG.get());
		this.dropSelf(Blocks.STRIPPED_ROWAN_LOG.get());
		this.dropSelf(Blocks.ROWAN_PLANKS.get());
	}
}
