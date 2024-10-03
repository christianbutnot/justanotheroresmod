package com.christianbutnot.justanotheroremod;

import com.christianbutnot.justanotheroremod.init.BlockInit;
import com.christianbutnot.justanotheroremod.init.CreativeTab;
import com.christianbutnot.justanotheroremod.init.ItemInit;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Main.MODID)
public class Main {
	// Define mod id in a common place for everything to reference
	public static final String MODID = "resourceful";

	public Main(IEventBus bus) {
		CreativeTab.register(bus);
		//ReplaceInit.register(bus);
		ItemInit.register(bus);
		BlockInit.register(bus);
		
	}
}