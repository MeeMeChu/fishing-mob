package me.meemechu.fishingMob

import me.meemechu.fishingMob.command.FishingCommand
import org.bukkit.plugin.java.JavaPlugin

class FishingMob : JavaPlugin() {

  override fun onEnable() {
    // Plugin startup logic
    logger.info("FishingMob v0.0.1 is enabled!")
    getCommand("fishingmob")?.setExecutor(FishingCommand(this))
  }

  override fun onDisable() {
    // Plugin shutdown logic
    logger.info("FishingMob v0.0.1 is disabled!")
  }

  fun loadConfig() {
    reloadConfig()
  }
}
