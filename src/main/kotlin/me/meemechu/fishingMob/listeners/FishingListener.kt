package me.meemechu.fishingMob.listeners

import me.meemechu.fishingMob.FishingMob
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerFishEvent

class FishingListener(private val plugin: FishingMob) : Listener{

  @EventHandler
  fun onPlayerFish(event: PlayerFishEvent) {

  }
}