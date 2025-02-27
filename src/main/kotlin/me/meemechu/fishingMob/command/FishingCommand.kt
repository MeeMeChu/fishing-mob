package me.meemechu.fishingMob.command

import me.meemechu.fishingMob.FishingMob
import me.meemechu.fishingMob.utils.Color
import net.kyori.adventure.text.Component
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class FishingCommand(private val plugin: FishingMob) : CommandExecutor{

  private val prefix = plugin.config.getString("prefix", "&aFishingMob") ?: "&aFishingMob"

  override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
    val usageMessage: String = """
      §7- §e$prefix by MeeMeChu §7-
      
      §aUsage:
      > /fishingmob reload
    """.trimIndent()

    if (args.isEmpty()) {
      sender.sendMessage(Component.text(usageMessage))
      return true
    }

    when {
      args[0].equals("reload", true) -> {
        if (sender is Player && !sender.isOp) {
          Color.sendColoredMessage(sender,"$prefix &8-> &fYou do not have permission to reload the config.")
          return true
        }

        plugin.reloadConfig()
        plugin.loadConfig()
        Color.sendColoredMessage(sender,"$prefix &8-> &fPlugin config reloaded successfully!")
      }
    }

    return true;
  }
}