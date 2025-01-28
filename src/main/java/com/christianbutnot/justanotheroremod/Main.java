package com.christianbutnot.justanotheroremod;

import org.slf4j.Logger;

import com.christianbutnot.justanotheroremod.init.BlockInit;
import com.christianbutnot.justanotheroremod.init.CreativeTab;
import com.christianbutnot.justanotheroremod.init.ItemInit;
import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(Main.MODID)
public class Main {
	// Define mod id in a common place for everything to reference
	public static final String MODID = "justanotheroresmod";

	public Main(IEventBus bus) {
		CreativeTab.register(bus);
		//ReplaceInit.register(bus);
		ItemInit.register(bus);
		BlockInit.register(bus);
		
	}
	
	private static final Logger LOGGER = LogUtils.getLogger();
	   
	@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("[JustAnotherLibrary] JustAnotherOresMod reporting for duty.");
        }
    }
}