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
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpiritMagic.MOD_ID);
	
	public static final RegistryObject<Item> ACONITE = ITEMS.register("aconite", () -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> DATURA = ITEMS.register("datura", () -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> BELLADONNA = ITEMS.register("belladonna", () -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> MANDRAKE = ITEMS.register("mandrake", () -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> SAGE = ITEMS.register("sage", () -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> RUE = ITEMS.register("rue", () -> new Item(new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	
	public static final RegistryObject<Item> ROWAN_WOOD = ITEMS.register("rowan_wood", () -> new BlockItem(Blocks.ROWAN_WOOD.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> STRIPPED_ROWAN_WOOD = ITEMS.register("stripped_rowan_wood", () -> new BlockItem(Blocks.STRIPPED_ROWAN_WOOD.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_LOG = ITEMS.register("rowan_log", () -> new BlockItem(Blocks.ROWAN_LOG.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> STRIPPED_ROWAN_LOG = ITEMS.register("stripped_rowan_log", () -> new BlockItem(Blocks.STRIPPED_ROWAN_LOG.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));
	public static final RegistryObject<Item> ROWAN_PLANKS = ITEMS.register("rowan_planks", () -> new BlockItem(Blocks.ROWAN_PLANKS.get(), new Item.Properties().tab(TAB_SPIRITMAGIC).stacksTo(64)));

}
