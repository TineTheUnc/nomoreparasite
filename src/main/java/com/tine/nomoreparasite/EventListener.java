package com.tine.nomoreparasite;

import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Tags.MOD_ID)
public class EventListener {
    @SubscribeEvent
    public void onEntityJoin(EntityJoinWorldEvent event) {
        if ("com.Fishmod.mod_LavaCow.entities.EntityParasite".equals(event.getEntity().getClass().getName())) {
            event.setCanceled(true);
        }
    }
}
