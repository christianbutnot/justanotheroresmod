package com.christianbutnot.justanotheroremod.init;

import java.util.function.Supplier;

import com.christianbutnot.justanotheroremod.Main;

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
			() -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
	public static final DeferredBlock<Block> ROSIUM_ORE = registerBlock("rosium_ore",
			() -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
	public static final DeferredBlock<Block> LUCIUM_ORE = registerBlock("lucium_ore",
			() -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
	public static final DeferredBlock<Block> MOCYLITE_ORE = registerBlock("mocylite_ore",
			() -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
	public static final DeferredBlock<Block> ENDERITE_ORE = registerBlock("enderite_ore",
			() -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    
    
	@SuppressWarnings("unused")
	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<T> block) {
		return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}