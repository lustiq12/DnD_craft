
package net.mcreator.dndcraft.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.dndcraft.procedures.GoblinsBackpackRightclickedOnBlockProcedure;

public class GoblinsBackpackItem extends Item {
	public GoblinsBackpackItem() {
		super(new Item.Properties().stacksTo(32).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		GoblinsBackpackRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
