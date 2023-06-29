package de.mecrytv.pluginscoden.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class AdminItemsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if (s instanceof Player){
            Player  player = (Player) s;
            Inventory inventory = Bukkit.createInventory(null, 9, "§4Admin Items");
            ItemStack i = new ItemStack(Material.STICK);
            ItemMeta m = i.getItemMeta();
            m.setUnbreakable(true);
            m.setDisplayName("§dKnockback §8Stick");
            m.addEnchant(Enchantment.KNOCKBACK, 10000, true);
            i.setItemMeta(m);
            ArrayList<String> l = new ArrayList<>();
            l.add(" ");
            l.add(ChatColor.DARK_GRAY + ">>" + ChatColor.AQUA + " Ultra " + ChatColor.AQUA + "Knockback " + ChatColor.RED + "Stick");
            inventory.setItem(0, i);
            player.openInventory(inventory);
        }
        return false;
    }
}
