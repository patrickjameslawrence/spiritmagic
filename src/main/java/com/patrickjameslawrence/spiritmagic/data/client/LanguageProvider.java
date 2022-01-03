package com.patrickjameslawrence.spiritmagic.data.client;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;
import com.patrickjameslawrence.spiritmagic.init.Blocks;
import com.patrickjameslawrence.spiritmagic.init.Items;

import net.minecraft.data.DataGenerator;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {

	public LanguageProvider(DataGenerator dataGenerator, String locale) {
		super(dataGenerator, SpiritMagic.MOD_ID, locale);
	}
	
	@Override
	protected void addTranslations() {
		add("itemGroup.spiritmagic", "Spirit Magic");
		
		add(Items.ACONITE.get(), "Aconite");
        add(Items.BELLADONNA.get(), "Belladonna");
        add(Items.MANDRAKE.get(), "Mandrake");
        add(Items.SAGE.get(), "Sage");
        add(Items.RUE.get(), "Rue");
        add(Items.DATURA.get(), "Datura");
		
		add(Blocks.ROWAN_WOOD.get(), "Rowan Wood");
        add(Blocks.STRIPPED_ROWAN_WOOD.get(), "Stripped Rowan Wood");
        add(Blocks.ROWAN_LOG.get(), "Rowan Log");
        add(Blocks.STRIPPED_ROWAN_LOG.get(), "Stripped Rowan Log");
        add(Blocks.ROWAN_PLANKS.get(), "Rowan Planks");
	}
}
