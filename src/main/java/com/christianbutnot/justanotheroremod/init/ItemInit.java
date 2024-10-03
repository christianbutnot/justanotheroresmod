package com.christianbutnot.justanotheroremod.init;

import com.christianbutnot.justanotheroremod.common.item.ItemRarities.ResourceItem;
import com.christianbutnot.justanotheroremod.common.item.armor.CustomArmorMaterials;
import com.christianbutnot.justanotheroremod.common.item.tools.CustomTiersEnum;
import com.christianbutnot.justanotheroremod.Main;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ArmorItem.Type;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MODID);

	// materials
	public static final DeferredItem<Item> CHRONIUM_GEM = ITEMS.register("chronium_gem", () -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ROSIUM_GEM = ITEMS.register("rosium_gem", () -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> LUCIUM_GEM = ITEMS.register("lucium_gem", () -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> MOCYLITE_GEM = ITEMS.register("mycolite_gem", () -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ENDERITE_GEM = ITEMS.register("enderite_gem", () -> new ResourceItem(new Item.Properties()));
	// chronium tools
	public static final DeferredItem<Item> CHRONIUM_SWORD = ITEMS.register("chronium_sword",
			() -> new SwordItem(CustomTiersEnum.CHRONIUM,
					new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.CHRONIUM, 4, -3.1f))));
	public static final DeferredItem<Item> CHRONIUM_PICKAXE = ITEMS.register("chronium_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.CHRONIUM,
					new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.CHRONIUM, 1, -2.8f))));
	public static final DeferredItem<Item> CHRONIUM_AXE = ITEMS.register("chronium_axe", () -> new AxeItem(CustomTiersEnum.CHRONIUM,
			new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.CHRONIUM, 4, -3.1f))));
	public static final DeferredItem<Item> CHRONIUM_SHOVEL = ITEMS.register("chronium_shovel",
			() -> new ShovelItem(CustomTiersEnum.CHRONIUM,
					new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.CHRONIUM, 1, -3f))));
	public static final DeferredItem<Item> CHRONIUM_HOE = ITEMS.register("chronium_hoe", () -> new HoeItem(CustomTiersEnum.CHRONIUM,
			new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.CHRONIUM, -1, -2.4f))));
	// chronium armor
	public static final DeferredItem<Item> CHRONIUM_HELMET = ITEMS.register("chronium_helmet",
			() -> new ArmorItem(CustomArmorMaterials.CHRONIUM, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> CHRONIUM_CHESTPLATE = ITEMS.register("chronium_chestplate",
			() -> new ArmorItem(CustomArmorMaterials.CHRONIUM, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> CHRONIUM_LEGGINGS = ITEMS.register("chronium_leggings",
			() -> new ArmorItem(CustomArmorMaterials.CHRONIUM, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> CHRONIUM_BOOTS = ITEMS.register("chronium_boots",
			() -> new ArmorItem(CustomArmorMaterials.CHRONIUM, Type.BOOTS, new Item.Properties().stacksTo(1)));

	public static void register(IEventBus bus) {
		ITEMS.register(bus);
	}
}