package net.mcreator.dndcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.dndcraft.network.DndCraftModVariables;

public class DailyRationQuestProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DndCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DndCraftModVariables.PlayerVariables())).DailyRationQuest > -1) {
			{
				double _setval = (entity.getCapability(DndCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DndCraftModVariables.PlayerVariables())).DailyRationQuest + 1;
				entity.getCapability(DndCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DailyRationQuest = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(DndCraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DndCraftModVariables.PlayerVariables())).DailyRationQuest == 12) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74You have completed the cooks quest: Daily eater"), false);
			}
		}
	}
}
