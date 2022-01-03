package com.patrickjameslawrence.spiritmagic.data.client;

import com.patrickjameslawrence.spiritmagic.SpiritMagic;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
	public ItemModelProvider(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper) {
		super(dataGenerator, SpiritMagic.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		getBuilder("aconite").parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", modLoc("item/aconite"));
        getBuilder("belladonna").parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", modLoc("item/belladonna"));
        getBuilder("mandrake").parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", modLoc("item/mandrake"));
        getBuilder("sage").parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", modLoc("item/sage"));
        getBuilder("rue").parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", modLoc("item/rue"));
        getBuilder("datura").parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", modLoc("item/datura"));
		
		withExistingParent("rowan_wood", modLoc("block/rowan_wood"));
        withExistingParent("stripped_rowan_wood", modLoc("block/stripped_rowan_wood"));
        withExistingParent("rowan_log", modLoc("block/rowan_log"));
        withExistingParent("stripped_rowan_log", modLoc("block/stripped_rowan_log"));
        withExistingParent("rowan_planks", modLoc("block/rowan_planks"));
	}
}
