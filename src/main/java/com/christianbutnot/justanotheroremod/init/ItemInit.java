package com.christianbutnot.justanotheroremod.init;

import com.christianbutnot.justanotherlibrarymod.common.item.ItemTypes.ResourceItem;
import com.christianbutnot.justanotherlibrarymod.common.item.armor.JAOMArmorMaterials;
import com.christianbutnot.justanotherlibrarymod.common.item.tools.CustomTiers;
import com.christianbutnot.justanotheroremod.Main;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MODID);

	// materials
	public static final DeferredItem<Item> CHRONIUM_GEM = ITEMS.register("chronium_gem",
			() -> new ResourceItem(new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_gem")))));
	public static final DeferredItem<Item> ROSIUM_GEM = ITEMS.register("rosium_gem",
			() -> new ResourceItem(new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_gem")))));
	public static final DeferredItem<Item> LUCIUM_GEM = ITEMS.register("lucium_gem",
			() -> new ResourceItem(new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_gem")))));
	public static final DeferredItem<Item> MOCYLITE_GEM = ITEMS.register("mocylite_gem",
			() -> new ResourceItem(new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_gem")))));
	public static final DeferredItem<Item> ENDERITE_GEM = ITEMS.register("enderite_gem",
			() -> new ResourceItem(new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_gem")))));
	// chronium tools
	public static final DeferredItem<Item> CHRONIUM_SWORD = ITEMS.register("chronium_sword",
			() -> new SwordItem(CustomTiers.CHRONIUM, 3.5f, -2.4f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_sword")))));
	public static final DeferredItem<Item> CHRONIUM_PICKAXE = ITEMS.register("chronium_pickaxe",
			() -> new PickaxeItem(CustomTiers.CHRONIUM, 1, -2.8f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_pickaxe")))));
	public static final DeferredItem<Item> CHRONIUM_AXE = ITEMS.register("chronium_axe",
			() -> new AxeItem(CustomTiers.CHRONIUM, 6, -3.1f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_axe")))));
	public static final DeferredItem<Item> CHRONIUM_SHOVEL = ITEMS.register("chronium_shovel",
			() -> new ShovelItem(CustomTiers.CHRONIUM, 1.5f, -3f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_shovel")))));
	public static final DeferredItem<Item> CHRONIUM_HOE = ITEMS.register("chronium_hoe",
			() -> new HoeItem(CustomTiers.CHRONIUM, -2, -1f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_hoe")))));
	// chronium armor
	public static final DeferredItem<Item> CHRONIUM_HELMET = ITEMS.register("chronium_helmet",
			() -> new ArmorItem(JAOMArmorMaterials.CHRONIUM_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(200).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_helmet")))));
	public static final DeferredItem<Item> CHRONIUM_CHESTPLATE = ITEMS.register("chronium_chestplate",
			() -> new ArmorItem(JAOMArmorMaterials.CHRONIUM_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(260).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_chestplate")))));
	public static final DeferredItem<Item> CHRONIUM_LEGGINGS = ITEMS.register("chronium_leggings",
			() -> new ArmorItem(JAOMArmorMaterials.CHRONIUM_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(230).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_leggings")))));
	public static final DeferredItem<Item> CHRONIUM_BOOTS = ITEMS.register("chronium_boots",
			() -> new ArmorItem(JAOMArmorMaterials.CHRONIUM_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(210).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "chronium_boots")))));

	// rosium tools
	public static final DeferredItem<Item> ROSIUM_SWORD = ITEMS.register("rosium_sword",
			() -> new SwordItem(CustomTiers.ROSIUM, 3, -2.4f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_sword")))));
	public static final DeferredItem<Item> ROSIUM_PICKAXE = ITEMS.register("rosium_pickaxe",
			() -> new PickaxeItem(CustomTiers.ROSIUM, 1, -2.8f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_pickaxe")))));
	public static final DeferredItem<Item> ROSIUM_AXE = ITEMS.register("rosium_axe",
			() -> new AxeItem(CustomTiers.ROSIUM, 5.5f, -3.1f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_axe")))));
	public static final DeferredItem<Item> ROSIUM_SHOVEL = ITEMS.register("rosium_shovel",
			() -> new ShovelItem(CustomTiers.ROSIUM, 1, -2.5f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_shovel")))));
	public static final DeferredItem<Item> ROSIUM_HOE = ITEMS.register("rosium_hoe",
			() -> new HoeItem(CustomTiers.ROSIUM, -3, -1f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_hoe")))));
	// rosium armor
	public static final DeferredItem<Item> ROSIUM_HELMET = ITEMS.register("rosium_helmet",
			() -> new ArmorItem(JAOMArmorMaterials.ROSIUM_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(363).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_helmet")))));
	public static final DeferredItem<Item> ROSIUM_CHESTPLATE = ITEMS.register("rosium_chestplate",
			() -> new ArmorItem(JAOMArmorMaterials.ROSIUM_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(528).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_chestplate")))));
	public static final DeferredItem<Item> ROSIUM_LEGGINGS = ITEMS.register("rosium_leggings",
			() -> new ArmorItem(JAOMArmorMaterials.ROSIUM_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(495).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_leggings")))));
	public static final DeferredItem<Item> ROSIUM_BOOTS = ITEMS.register("rosium_boots",
			() -> new ArmorItem(JAOMArmorMaterials.ROSIUM_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(429).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "rosium_boots")))));

	// lucium tools
	public static final DeferredItem<Item> LUCIUM_SWORD = ITEMS.register("lucium_sword",
			() -> new SwordItem(CustomTiers.LUCIUM, 3, -2.4f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_sword")))));
	public static final DeferredItem<Item> LUCIUM_PICKAXE = ITEMS.register("lucium_pickaxe",
			() -> new PickaxeItem(CustomTiers.LUCIUM, 1, -2.8f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_pickaxe")))));
	public static final DeferredItem<Item> LUCIUM_AXE = ITEMS.register("lucium_axe",
			() -> new AxeItem(CustomTiers.LUCIUM, 5.5f, -3.1f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_axe")))));
	public static final DeferredItem<Item> LUCIUM_SHOVEL = ITEMS.register("lucium_shovel",
			() -> new ShovelItem(CustomTiers.LUCIUM, 1, -3f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_shovel")))));
	public static final DeferredItem<Item> LUCIUM_HOE = ITEMS.register("lucium_hoe",
			() -> new HoeItem(CustomTiers.LUCIUM, -3, -1f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_hoe")))));
	// lucium armor
	public static final DeferredItem<Item> LUCIUM_HELMET = ITEMS.register("lucium_helmet",
			() -> new ArmorItem(JAOMArmorMaterials.LUCIUM_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(363).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_helmet")))));
	public static final DeferredItem<Item> LUCIUM_CHESTPLATE = ITEMS.register("lucium_chestplate",
			() -> new ArmorItem(JAOMArmorMaterials.LUCIUM_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(528).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_chestplate")))));
	public static final DeferredItem<Item> LUCIUM_LEGGINGS = ITEMS.register("lucium_leggings",
			() -> new ArmorItem(JAOMArmorMaterials.LUCIUM_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(495).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_leggings")))));
	public static final DeferredItem<Item> LUCIUM_BOOTS = ITEMS.register("lucium_boots",
			() -> new ArmorItem(JAOMArmorMaterials.LUCIUM_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(429).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "lucium_boots")))));

	// mocylite tools
	public static final DeferredItem<Item> MOCYLITE_SWORD = ITEMS.register("mocylite_sword",
			() -> new SwordItem(CustomTiers.MOCYLITE, 3, -2.4f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_sword")))));
	public static final DeferredItem<Item> MOCYLITE_PICKAXE = ITEMS.register("mocylite_pickaxe",
			() -> new PickaxeItem(CustomTiers.MOCYLITE, 1, -2.8f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_pickaxe")))));
	public static final DeferredItem<Item> MOCYLITE_AXE = ITEMS.register("mocylite_axe",
			() -> new AxeItem(CustomTiers.MOCYLITE, 6, -3.1f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_axe")))));
	public static final DeferredItem<Item> MOCYLITE_SHOVEL = ITEMS.register("mocylite_shovel",
			() -> new ShovelItem(CustomTiers.MOCYLITE, 1.5f, -3f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_shovel")))));
	public static final DeferredItem<Item> MOCYLITE_HOE = ITEMS.register("mocylite_hoe",
			() -> new HoeItem(CustomTiers.MOCYLITE, -3, -1f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_hoe")))));
	// mocylite armor
	public static final DeferredItem<Item> MOCYLITE_HELMET = ITEMS.register("mocylite_helmet",
			() -> new ArmorItem(JAOMArmorMaterials.MOCYLITE_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(363).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_helmet")))));
	public static final DeferredItem<Item> MOCYLITE_CHESTPLATE = ITEMS.register("mocylite_chestplate",
			() -> new ArmorItem(JAOMArmorMaterials.MOCYLITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(528).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_chestplate")))));
	public static final DeferredItem<Item> MOCYLITE_LEGGINGS = ITEMS.register("mocylite_leggings",
			() -> new ArmorItem(JAOMArmorMaterials.MOCYLITE_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(495).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_leggings")))));
	public static final DeferredItem<Item> MOCYLITE_BOOTS = ITEMS.register("mocylite_boots",
			() -> new ArmorItem(JAOMArmorMaterials.MOCYLITE_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(429).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "mocylite_boots")))));

	// enderite tools
	public static final DeferredItem<Item> ENDERITE_SWORD = ITEMS.register("enderite_sword",
			() -> new SwordItem(CustomTiers.ENDERITE, 4, -2.4f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_sword")))));
	public static final DeferredItem<Item> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe",
			() -> new PickaxeItem(CustomTiers.ENDERITE, 1, -2.8f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_pickaxe")))));
	public static final DeferredItem<Item> ENDERITE_AXE = ITEMS.register("enderite_axe",
			() -> new AxeItem(CustomTiers.ENDERITE, 6, -3.1f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_axe")))));
	public static final DeferredItem<Item> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel",
			() -> new ShovelItem(CustomTiers.ENDERITE, 1, -3f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_shovel")))));
	public static final DeferredItem<Item> ENDERITE_HOE = ITEMS.register("enderite_hoe",
			() -> new HoeItem(CustomTiers.ENDERITE, -4, -1f, new Item.Properties().setId(ResourceKey.create(Registries.ITEM,
					ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_hoe")))));
	// enderite armor
	public static final DeferredItem<Item> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
			() -> new ArmorItem(JAOMArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorType.HELMET,
					new Item.Properties().durability(407).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_helmet")))));
	public static final DeferredItem<Item> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
			() -> new ArmorItem(JAOMArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE,
					new Item.Properties().durability(592).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_chestplate")))));
	public static final DeferredItem<Item> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
			() -> new ArmorItem(JAOMArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorType.LEGGINGS,
					new Item.Properties().durability(555).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_leggings")))));
	public static final DeferredItem<Item> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
			() -> new ArmorItem(JAOMArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorType.BOOTS,
					new Item.Properties().durability(481).stacksTo(1).setId(ResourceKey.create(Registries.ITEM,
							ResourceLocation.fromNamespaceAndPath(Main.MODID, "enderite_boots")))));

	public static void register(IEventBus bus) {
		ITEMS.register(bus);
	}
}