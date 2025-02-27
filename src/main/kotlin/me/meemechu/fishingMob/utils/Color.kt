package me.meemechu.fishingMob.utils

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
import org.bukkit.command.CommandSender

class Color {
  companion object {
    private fun colorize(message: String): Component {
      return LegacyComponentSerializer.legacyAmpersand().deserialize(message)
    }

    fun sendColoredMessage(player: CommandSender, message: String) {
      player.sendMessage(colorize(message))
    }
  }
}