package de.mecrytv.pluginscoden.commands;

import de.mecrytv.pluginscoden.PluginsCoden;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player) commandSender;
        player.setHealth(player.getMaxHealth());
        player.setFoodLevel(20);

        player.sendMessage(PluginsCoden.getInstance().getPrefix() + ChatColor.GREEN + " Du wurdest geheilt.");
        return true;
    }
}
