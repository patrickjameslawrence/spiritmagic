package com.patrickjameslawrence.spiritmagic.data;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;

public class ItemTags {
	public static final Tag.Named<Item> ROWAN_LOGS = net.minecraft.tags.ItemTags.bind(new ResourceLocation(SpiritMagic.MOD_ID, "rowan_logs").toString());
}
