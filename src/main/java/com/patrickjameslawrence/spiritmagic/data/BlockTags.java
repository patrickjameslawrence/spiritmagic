package com.patrickjameslawrence.spiritmagic.data;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;

public class BlockTags {
	public static final Tag.Named<Block> ROWAN_LOGS = net.minecraft.tags.BlockTags.bind(new ResourceLocation(SpiritMagic.MOD_ID, "rowan_logs").toString());
}
