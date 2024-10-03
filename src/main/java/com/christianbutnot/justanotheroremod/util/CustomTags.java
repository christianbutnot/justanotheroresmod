package com.christianbutnot.justanotheroremod.util;

import com.christianbutnot.justanotheroremod.Main;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CustomTags {

		public static TagKey<Block> blockTag(ResourceLocation tagLocaction) {
			return TagKey.create(Registries.BLOCK, tagLocaction);
		}

		public static TagKey<Item> itemTag(ResourceLocation tagLocaction) {
			return TagKey.create(Registries.ITEM, tagLocaction);
		}

		public static TagKey<Block> modBlockTag(String tagName) {
			return CustomTags.blockTag(ResourceLocation.fromNamespaceAndPath(Main.MODID, tagName));
		}

	}