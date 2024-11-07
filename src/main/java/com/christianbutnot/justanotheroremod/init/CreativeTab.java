package com.christianbutnot.justanotheroremod.init;

import com.christianbutnot.justanotheroremod.Main;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTab {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> JUSTANOTHERORESMOD_TAB = CREATIVE_MODE_TABS.register("justanotheroresmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.ROSIUM_GEM.get()))
                    .title(Component.translatable("creativetab.justanotheroresmod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                    	for (final DeferredHolder<Item, ? extends Item> item : ItemInit.ITEMS.getEntries())
                            pOutput.accept(item.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}