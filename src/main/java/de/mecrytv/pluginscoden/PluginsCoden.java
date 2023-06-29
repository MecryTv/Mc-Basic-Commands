package de.mecrytv.pluginscoden;

import de.mecrytv.pluginscoden.commands.*;
import de.mecrytv.pluginscoden.listeners.CancelListener;
import de.mecrytv.pluginscoden.listeners.ConnectionListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginsCoden extends JavaPlugin {

    private String prefix;
    private static PluginsCoden instance;


    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        prefix = "§7[§9PluginsCoden§7]";

        getCommand("items").setExecutor(new ItemsCommand());
        getCommand("gm").setExecutor(new GMCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("adminitems").setExecutor(new AdminItemsCommand());
        getCommand("heal").setExecutor(new HealCommand());

        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new ConnectionListener(), this);
        manager.registerEvents(new CancelListener(), this);

    }

    @Override
    public void onDisable() {

    }

    public String getPrefix() {
        return prefix;
    }

    public static PluginsCoden getInstance() {
        return instance;
    }

}
