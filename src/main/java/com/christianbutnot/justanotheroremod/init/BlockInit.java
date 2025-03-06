package com.christianbutnot.justanotheroremod.init;

import java.util.function.Supplier;

import com.christianbutnot.justanotheroremod.Main;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockInit {

	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Main.MODID);

	public static final DeferredBlock<Block> CHRONIUM_ORE = registerBlock("chronium_ore",
			() -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_ore")))));
	public static final DeferredBlock<Block> ROSIUM_ORE = registerBlock("rosium_ore",
			() -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_ore")))));
	public static final DeferredBlock<Block> LUCIUM_ORE = registerBlock("lucium_ore",
			() -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_ore")))));
	public static final DeferredBlock<Block> MOCYLITE_ORE = registerBlock("mocylite_ore",
			() -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_ore")))));
	public static final DeferredBlock<Block> ENDERITE_ORE = registerBlock("enderite_ore",
			() -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_ore")))));

	@SuppressWarnings("unused")
	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<T> block) {
		return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()
				.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Main.MODID, name)))));
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}