package com.christianbutnot.justanotheroremod.common.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public class CustomArmorItem extends ArmorItem {

	public CustomArmorItem(ArmorMaterial material, ArmorType type, int durabilityMultiplier, Properties properties) {
	      super(material, type, properties.durability((new int[]{13, 15, 16, 11})[type.getSlot().getIndex()] * durabilityMultiplier));
	   }

}
