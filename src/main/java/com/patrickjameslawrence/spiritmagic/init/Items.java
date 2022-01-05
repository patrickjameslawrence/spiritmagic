package com.patrickjameslawrence.spiritmagic.init;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
	public final static CreativeModeTab TAB_SPIRITMAGIC = new CreativeModeTab(SpiritMagic.MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(Items.ACONITE.get());
		}
	};
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SpiritMagic.MOD_ID);

	public static final RegistryObject<Item> ACONITE = ITEMS.register("aconite",
			() -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> DATURA = ITEMS.register("datura",
			() -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> BELLADONNA = ITEMS.register("belladonna",
			() -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> MANDRAKE = ITEMS.register("mandrake",
			() -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> SAGE = ITEMS.register("sage",
			() -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> RUE = ITEMS.register("rue",
			() -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));

	public static final RegistryObject<Item> ROWAN_WOOD = ITEMS.register("rowan_wood",
			() -> new BlockItem(Blocks.ROWAN_WOOD.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> STRIPPED_ROWAN_WOOD = ITEMS.register("stripped_rowan_wood",
			() -> new BlockItem(Blocks.STRIPPED_ROWAN_WOOD.get(),
					new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_LOG = ITEMS.register("rowan_log",
			() -> new BlockItem(Blocks.ROWAN_LOG.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> STRIPPED_ROWAN_LOG = ITEMS.register("stripped_rowan_log",
			() -> new BlockItem(Blocks.STRIPPED_ROWAN_LOG.get(),
					new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_PLANKS = ITEMS.register("rowan_planks",
			() -> new BlockItem(Blocks.ROWAN_PLANKS.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_STAIRS = ITEMS.register("rowan_stairs",
			() -> new BlockItem(Blocks.ROWAN_STAIRS.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_SLAB = ITEMS.register("rowan_slab",
			() -> new BlockItem(Blocks.ROWAN_SLAB.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_FENCE = ITEMS.register("rowan_fence",
			() -> new BlockItem(Blocks.ROWAN_FENCE.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_FENCE_GATE = ITEMS.register("rowan_fence_gate",
			() -> new BlockItem(Blocks.ROWAN_FENCE_GATE.get(),
					new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_DOOR = ITEMS.register("rowan_door",
			() -> new BlockItem(Blocks.ROWAN_DOOR.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_TRAPDOOR = ITEMS.register("rowan_trapdoor",
			() -> new BlockItem(Blocks.ROWAN_TRAPDOOR.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_PRESSURE_PLATE = ITEMS.register("rowan_pressure_plate",
			() -> new BlockItem(Blocks.ROWAN_PRESSURE_PLATE.get(),
					new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_BUTTON = ITEMS.register("rowan_button",
			() -> new BlockItem(Blocks.ROWAN_BUTTON.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	// public static final RegistryObject<Item> ROWAN_SIGN =
	// ITEMS.register("rowan_sign", () -> new SignItem(ITEM_PROPERTIES.stacksTo(16),
	// Blocks.ROWAN_SIGN.get(), Blocks.ROWAN_WALL_SIGN.get()));
	// public static final RegistryObject<Item> ROWAN_SAPLING =
	// ITEMS.register("rowan_sapling", () -> new
	// BlockItem(Blocks.ROWAN_SAPLING.get(), new
	// Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_LEAVES = ITEMS.register("rowan_leaves",
			() -> new BlockItem(Blocks.ROWAN_LEAVES.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	// public static final RegistryObject<Item> ROWAN_BOAT =
	// ITEMS.register("rowan_boat", () -> new BoatItem(BoatEntity.Type.ROWAN,
	// ITEM_PROPERTIES.stacksTo(1)));
}
