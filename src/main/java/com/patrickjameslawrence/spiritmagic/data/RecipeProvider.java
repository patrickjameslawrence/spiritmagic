package com.patrickjameslawrence.spiritmagic.data;

import java.util.function.Consumer;

import com.patrickjameslawrence.spiritmagic.data.tag.ItemTags;
import com.patrickjameslawrence.spiritmagic.init.Blocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider {

	public RecipeProvider(DataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		planksFromLogs(consumer, Blocks.ROWAN_PLANKS.get(), ItemTags.ROWAN_LOGS);
		woodFromLogs(consumer, Blocks.ROWAN_WOOD.get(), Blocks.ROWAN_LOG.get());
	}

	private static void planksFromLogs(Consumer<FinishedRecipe> p_126018_, ItemLike p_126019_, Tag<Item> p_126020_) {
		ShapelessRecipeBuilder.shapeless(p_126019_, 4).requires(p_126020_).group("planks")
				.unlockedBy("has_logs", has(p_126020_)).save(p_126018_);
	}

	private static void woodFromLogs(Consumer<FinishedRecipe> p_126003_, ItemLike p_126004_, ItemLike p_126005_) {
		ShapedRecipeBuilder.shaped(p_126004_, 3).define('#', p_126005_).pattern("##").pattern("##").group("bark")
				.unlockedBy("has_log", has(p_126005_)).save(p_126003_);
	}

	private static RecipeBuilder stairBuilder(ItemLike p_176711_, Ingredient p_176712_) {
		return ShapedRecipeBuilder.shaped(p_176711_, 4).define('#', p_176712_).pattern("#  ").pattern("## ")
				.pattern("###");
	}
	
	private static RecipeBuilder slabBuilder(ItemLike p_176705_, Ingredient p_176706_) {
		return ShapedRecipeBuilder.shaped(p_176705_, 6).define('#', p_176706_).pattern("###");
	}
}
