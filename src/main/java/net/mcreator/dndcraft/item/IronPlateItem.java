
package net.mcreator.dndcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronPlateItem extends Item {
	public IronPlateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
