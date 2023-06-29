package de.mecrytv.pluginscoden.commands;

import de.mecrytv.pluginscoden.PluginsCoden;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GMCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (!(commandSender instanceof Player)) {
            return false;
        }

        Player player = (Player) commandSender;
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("1")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(PluginsCoden.getInstance().getPrefix() + " §aDu bist jetzt im Creative");
            } else if (args[0].equalsIgnoreCase("2")) {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(PluginsCoden.getInstance().getPrefix() + " §aDu bist jetzt im Adventure");
            } else if (args[0].equalsIgnoreCase("3")) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(PluginsCoden.getInstance().getPrefix() + " §aDu bist jetzt im Spectator");
            } else if (args[0].equalsIgnoreCase("0")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(PluginsCoden.getInstance().getPrefix() + " §aDu bist jetzt im Survival");
            }
        } else {
            commandSender.sendMessage(ChatColor.AQUA + "Benutze: /gm <0|1|2|3>");
        }
        return true;
    }
}
