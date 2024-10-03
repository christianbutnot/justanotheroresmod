package com.christianbutnot.justanotheroremod.common.item.tools;

import java.util.function.Supplier;

import com.christianbutnot.justanotheroremod.init.ItemInit;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public enum CustomTiersEnum implements Tier { 
	
	CHRONIUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 15, () -> Ingredient.of(ItemInit.CHRONIUM_GEM.get())),
	ROSIUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 20, () -> Ingredient.of(ItemInit.ROSIUM_GEM.get())),
	LUCIUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 10, () -> Ingredient.of(ItemInit.LUCIUM_GEM.get())),
	MOCYLITE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2031, 8.0F, 3.0F, 12, () -> Ingredient.of(ItemInit.MOCYLITE_GEM.get())),
	ENDERITE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2571, 10.0F, 4.0F, 15, () -> Ingredient.of(ItemInit.ENDERITE_GEM.get()));

    private final TagKey<Block> incorrect;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    CustomTiersEnum(TagKey<Block> incorrect, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.incorrect = incorrect;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.ingredient = ingredient;
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrect;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}