package de.mecrytv.pluginscoden.commands;

import de.mecrytv.pluginscoden.PluginsCoden;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (player.getAllowFlight()) {
            player.setAllowFlight(false);
            player.setFlying(false);
            player.sendMessage(PluginsCoden.getInstance().getPrefix() + ChatColor.GREEN + " Flugmodus deaktiviert.");
        } else {
            player.setAllowFlight(true);
            player.sendMessage(PluginsCoden.getInstance().getPrefix() + ChatColor.GREEN + " Flugmodus aktiviert. Du kannst nun fliegen.");
        }

        return true;
    }
}
