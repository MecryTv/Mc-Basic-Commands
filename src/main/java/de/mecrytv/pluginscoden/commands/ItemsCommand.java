package de.mecrytv.pluginscoden.commands;

import de.mecrytv.pluginscoden.PluginsCoden;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            commandSender.sendMessage(PluginsCoden.getInstance().getPrefix() + " §8Du hast das §bBlue §4Demon Schwert §8erhalten");
            ItemStack stack = new ItemStack(Material.NETHERITE_SWORD);
            ItemMeta meta = stack.getItemMeta();
            meta.setDisplayName(ChatColor.AQUA + "Blue " + ChatColor.RED + "Demon Schwert");
            ArrayList<String> lore = new ArrayList<>();
            lore.add(" ");
            lore.add(ChatColor.DARK_GRAY + ">>" + ChatColor.AQUA + " Das ist das mein " + ChatColor.AQUA + "Blue " + ChatColor.RED + "Demon Schwert");
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
            meta.addEnchant(Enchantment.MENDING, 10, true);
            meta.addEnchant(Enchantment.DURABILITY, 10, true);
            meta.addEnchant(Enchantment.FIRE_ASPECT, 10, true);
            meta.addEnchant(Enchantment.SWEEPING_EDGE, 10, true);
            meta.setUnbreakable(true);
            stack.setItemMeta(meta);
            player.getInventory().addItem(stack);

        }

        return false;
    }
}
