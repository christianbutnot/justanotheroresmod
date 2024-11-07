package com.christianbutnot.justanotheroremod.init;

import com.christianbutnot.justanotherlibrarymod.common.item.ItemTypes.ResourceItem;
import com.christianbutnot.justanotherlibrarymod.common.item.armor.JAOMArmorMaterials;
import com.christianbutnot.justanotherlibrarymod.common.item.tools.CustomTiersEnum;
import com.christianbutnot.justanotheroremod.Main;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MODID);

	// materials
	public static final DeferredItem<Item> CHRONIUM_GEM = ITEMS.register("chronium_gem",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ROSIUM_GEM = ITEMS.register("rosium_gem",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> LUCIUM_GEM = ITEMS.register("lucium_gem",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> MOCYLITE_GEM = ITEMS.register("mocylite_gem",
			() -> new ResourceItem(new Item.Properties()));
	public static final DeferredItem<Item> ENDERITE_GEM = ITEMS.register("enderite_gem",
			() -> new ResourceItem(new Item.Properties()));
	// chronium tools
	public static final DeferredItem<Item> CHRONIUM_SWORD = ITEMS.register("chronium_sword",
			() -> new SwordItem(CustomTiersEnum.CHRONIUM,
					new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.CHRONIUM, 3.5f, -2.4f))));
	public static final DeferredItem<Item> CHRONIUM_PICKAXE = ITEMS.register("chronium_pickaxe", () -> new PickaxeItem(
			CustomTiersEnum.CHRONIUM,
			new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.CHRONIUM, 1, -2.8f))));
	public static final DeferredItem<Item> CHRONIUM_AXE = ITEMS.register("chronium_axe",
			() -> new AxeItem(CustomTiersEnum.CHRONIUM,
					new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.CHRONIUM, 6, -3.1f))));
	public static final DeferredItem<Item> CHRONIUM_SHOVEL = ITEMS.register("chronium_shovel",
			() -> new ShovelItem(CustomTiersEnum.CHRONIUM,
					new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.CHRONIUM, 1.5f, -3f))));
	public static final DeferredItem<Item> CHRONIUM_HOE = ITEMS.register("chronium_hoe",
			() -> new HoeItem(CustomTiersEnum.CHRONIUM,
					new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.CHRONIUM, -2, -1f))));
	// chronium armor
	public static final DeferredItem<Item> CHRONIUM_HELMET = ITEMS.register("chronium_helmet",
			() -> new ArmorItem(JAOMArmorMaterials.CHRONIUM, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> CHRONIUM_CHESTPLATE = ITEMS.register("chronium_chestplate",
			() -> new ArmorItem(JAOMArmorMaterials.CHRONIUM, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> CHRONIUM_LEGGINGS = ITEMS.register("chronium_leggings",
			() -> new ArmorItem(JAOMArmorMaterials.CHRONIUM, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> CHRONIUM_BOOTS = ITEMS.register("chronium_boots",
			() -> new ArmorItem(JAOMArmorMaterials.CHRONIUM, Type.BOOTS, new Item.Properties().stacksTo(1)));

	// rosium tools
	public static final DeferredItem<Item> ROSIUM_SWORD = ITEMS.register("rosium_sword",
			() -> new SwordItem(CustomTiersEnum.ROSIUM,
					new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.ROSIUM, 3, -2.4f))));
	public static final DeferredItem<Item> ROSIUM_PICKAXE = ITEMS.register("rosium_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.ROSIUM,
					new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.ROSIUM, 1, -2.8f))));
	public static final DeferredItem<Item> ROSIUM_AXE = ITEMS.register("rosium_axe",
			() -> new AxeItem(CustomTiersEnum.ROSIUM,
					new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.ROSIUM, 5.5f, -3.1f))));
	public static final DeferredItem<Item> ROSIUM_SHOVEL = ITEMS.register("rosium_shovel",
			() -> new ShovelItem(CustomTiersEnum.ROSIUM,
					new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.ROSIUM, 1, -2.5f))));
	public static final DeferredItem<Item> ROSIUM_HOE = ITEMS.register("rosium_hoe",
			() -> new HoeItem(CustomTiersEnum.ROSIUM,
					new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.ROSIUM, -3, -1f))));
	// rosium armor
	public static final DeferredItem<Item> ROSIUM_HELMET = ITEMS.register("rosium_helmet",
			() -> new ArmorItem(JAOMArmorMaterials.ROSIUM, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ROSIUM_CHESTPLATE = ITEMS.register("rosium_chestplate",
			() -> new ArmorItem(JAOMArmorMaterials.ROSIUM, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ROSIUM_LEGGINGS = ITEMS.register("rosium_leggings",
			() -> new ArmorItem(JAOMArmorMaterials.ROSIUM, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ROSIUM_BOOTS = ITEMS.register("rosium_boots",
			() -> new ArmorItem(JAOMArmorMaterials.ROSIUM, Type.BOOTS, new Item.Properties().stacksTo(1)));

	// lucium tools
	public static final DeferredItem<Item> LUCIUM_SWORD = ITEMS.register("lucium_sword",
			() -> new SwordItem(CustomTiersEnum.LUCIUM,
					new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.LUCIUM, 3, -2.4f))));
	public static final DeferredItem<Item> LUCIUM_PICKAXE = ITEMS.register("lucium_pickaxe",
			() -> new PickaxeItem(CustomTiersEnum.LUCIUM,
					new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.LUCIUM, 1, -2.8f))));
	public static final DeferredItem<Item> LUCIUM_AXE = ITEMS.register("lucium_axe",
			() -> new AxeItem(CustomTiersEnum.LUCIUM,
					new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.LUCIUM, 5.5f, -3.1f))));
	public static final DeferredItem<Item> LUCIUM_SHOVEL = ITEMS.register("lucium_shovel",
			() -> new ShovelItem(CustomTiersEnum.LUCIUM,
					new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.LUCIUM, 1, -3f))));
	public static final DeferredItem<Item> LUCIUM_HOE = ITEMS.register("lucium_hoe",
			() -> new HoeItem(CustomTiersEnum.LUCIUM,
					new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.LUCIUM, -3, -1f))));
	// lucium armor
	public static final DeferredItem<Item> LUCIUM_HELMET = ITEMS.register("lucium_helmet",
			() -> new ArmorItem(JAOMArmorMaterials.LUCIUM, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> LUCIUM_CHESTPLATE = ITEMS.register("lucium_chestplate",
			() -> new ArmorItem(JAOMArmorMaterials.LUCIUM, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> LUCIUM_LEGGINGS = ITEMS.register("lucium_leggings",
			() -> new ArmorItem(JAOMArmorMaterials.LUCIUM, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> LUCIUM_BOOTS = ITEMS.register("lucium_boots",
			() -> new ArmorItem(JAOMArmorMaterials.LUCIUM, Type.BOOTS, new Item.Properties().stacksTo(1)));

	// mocylite tools
	public static final DeferredItem<Item> MOCYLITE_SWORD = ITEMS.register("mocylite_sword",
			() -> new SwordItem(CustomTiersEnum.MOCYLITE,
					new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.MOCYLITE, 3, -2.4f))));
	public static final DeferredItem<Item> MOCYLITE_PICKAXE = ITEMS.register("mocylite_pickaxe", () -> new PickaxeItem(
			CustomTiersEnum.MOCYLITE,
			new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.MOCYLITE, 1, -2.8f))));
	public static final DeferredItem<Item> MOCYLITE_AXE = ITEMS.register("mocylite_axe",
			() -> new AxeItem(CustomTiersEnum.MOCYLITE,
					new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.MOCYLITE, 6, -3.1f))));
	public static final DeferredItem<Item> MOCYLITE_SHOVEL = ITEMS.register("mocylite_shovel",
			() -> new ShovelItem(CustomTiersEnum.MOCYLITE,
					new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.MOCYLITE, 1.5f, -3f))));
	public static final DeferredItem<Item> MOCYLITE_HOE = ITEMS.register("mocylite_hoe",
			() -> new HoeItem(CustomTiersEnum.MOCYLITE,
					new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.MOCYLITE, -3, -1f))));
	// mocylite armor
	public static final DeferredItem<Item> MOCYLITE_HELMET = ITEMS.register("mocylite_helmet",
			() -> new ArmorItem(JAOMArmorMaterials.MOCYLITE, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> MOCYLITE_CHESTPLATE = ITEMS.register("mocylite_chestplate",
			() -> new ArmorItem(JAOMArmorMaterials.MOCYLITE, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> MOCYLITE_LEGGINGS = ITEMS.register("mocylite_leggings",
			() -> new ArmorItem(JAOMArmorMaterials.MOCYLITE, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> MOCYLITE_BOOTS = ITEMS.register("mocylite_boots",
			() -> new ArmorItem(JAOMArmorMaterials.MOCYLITE, Type.BOOTS, new Item.Properties().stacksTo(1)));

	// enderite tools
	public static final DeferredItem<Item> ENDERITE_SWORD = ITEMS.register("enderite_sword",
			() -> new SwordItem(CustomTiersEnum.ENDERITE,
					new Item.Properties().attributes(SwordItem.createAttributes(CustomTiersEnum.ENDERITE, 4, -2.4f))));
	public static final DeferredItem<Item> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe", () -> new PickaxeItem(
			CustomTiersEnum.ENDERITE,
			new Item.Properties().attributes(PickaxeItem.createAttributes(CustomTiersEnum.ENDERITE, 1, -2.8f))));
	public static final DeferredItem<Item> ENDERITE_AXE = ITEMS.register("enderite_axe",
			() -> new AxeItem(CustomTiersEnum.ENDERITE,
					new Item.Properties().attributes(AxeItem.createAttributes(CustomTiersEnum.ENDERITE, 6, -3.1f))));
	public static final DeferredItem<Item> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel",
			() -> new ShovelItem(CustomTiersEnum.ENDERITE,
					new Item.Properties().attributes(ShovelItem.createAttributes(CustomTiersEnum.ENDERITE, 1, -3f))));
	public static final DeferredItem<Item> ENDERITE_HOE = ITEMS.register("enderite_hoe",
			() -> new HoeItem(CustomTiersEnum.ENDERITE,
					new Item.Properties().attributes(HoeItem.createAttributes(CustomTiersEnum.ENDERITE, -4, -1f))));
	// enderite armor
	public static final DeferredItem<Item> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
			() -> new ArmorItem(JAOMArmorMaterials.ENDERITE, Type.HELMET, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
			() -> new ArmorItem(JAOMArmorMaterials.ENDERITE, Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
			() -> new ArmorItem(JAOMArmorMaterials.ENDERITE, Type.LEGGINGS, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
			() -> new ArmorItem(JAOMArmorMaterials.ENDERITE, Type.BOOTS, new Item.Properties().stacksTo(1)));

	public static void register(IEventBus bus) {
		ITEMS.register(bus);
	}
}