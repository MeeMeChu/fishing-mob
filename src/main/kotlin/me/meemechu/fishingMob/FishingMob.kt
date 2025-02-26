package me.meemechu.fishingMob

import org.bukkit.plugin.java.JavaPlugin

class FishingMob : JavaPlugin() {

  override fun onEnable() {
    // Plugin startup logic
    logger.info("FishingMob v0.0.1 is enabled!")
  }

  override fun onDisable() {
    // Plugin shutdown logic
    logger.info("FishingMob v0.0.1 is disabled!")
  }

  fun loadConfig() {
    reloadConfig()
  }
}
