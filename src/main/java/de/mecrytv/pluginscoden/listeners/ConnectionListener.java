package de.mecrytv.pluginscoden.listeners;

import de.mecrytv.pluginscoden.PluginsCoden;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

public class ConnectionListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        event.setJoinMessage(PluginsCoden.getInstance().getPrefix() + " " + ChatColor.AQUA + player.getName() + ChatColor.DARK_GRAY + " hat das Spiel betreten");
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        event.setQuitMessage(null);
    }
}
