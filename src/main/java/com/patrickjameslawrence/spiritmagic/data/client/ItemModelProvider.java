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
        withExistingParent("rowan_stairs", modLoc("block/rowan_stairs"));
        withExistingParent("rowan_slab", modLoc("block/rowan_slab"));
        withExistingParent("rowan_fence", modLoc("block/rowan_fence_inventory"));
        withExistingParent("rowan_fence_gate", modLoc("block/rowan_fence_gate"));
        getBuilder("rowan_door").parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", modLoc("item/rowan_door"));
        withExistingParent("rowan_trapdoor", modLoc("block/rowan_trapdoor_bottom"));
        withExistingParent("rowan_pressure_plate", modLoc("block/rowan_pressure_plate"));
        withExistingParent("rowan_button", modLoc("block/rowan_button_inventory"));
        // getBuilder("rowan_sign").parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", modLoc("item/rowan_sign"));
        // getBuilder("rowan_sapling").parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", modLoc("item/rowan_sapling"));
        withExistingParent("rowan_leaves", modLoc("block/rowan_leaves"));
        // getBuilder("rowan_boat").parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", modLoc("item/rowan_boat"));
	}
}
