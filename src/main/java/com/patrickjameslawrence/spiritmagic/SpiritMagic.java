package com.patrickjameslawrence.spiritmagic;

import com.patrickjameslawrence.spiritmagic.init.Blocks;
import com.patrickjameslawrence.spiritmagic.init.Items;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("spiritmagic")
public class SpiritMagic {
	public static final String MOD_ID = "spiritmagic";

	public SpiritMagic() {
		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
		
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Blocks.BLOCKS.register(eventBus);
        Items.ITEMS.register(eventBus);
	}
}
