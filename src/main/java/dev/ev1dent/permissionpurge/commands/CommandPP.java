package dev.ev1dent.permissionpurge.commands;

import dev.ev1dent.permissionpurge.utilities.Utils;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.Node;
import net.luckperms.api.node.NodeType;
import net.luckperms.api.node.types.PermissionNode;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandPP implements CommandExecutor {
    private final LuckPerms luckPerms;

    public CommandPP(LuckPerms luckPerms) {
        this.luckPerms = luckPerms;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {
        if(args.length < 3) return false;

        String type = args[0].toLowerCase(); // "user" or "group"
        String target = args[1]; // the user or group in question
        String matchedPermission = args[2]; // partial permission match to remove all of.

        Utils Utils = new Utils();
        switch (type){
            case "user":
                purgeUser(target, matchedPermission, sender);
                break;
            case "group":
                purgeGroup(target, matchedPermission, sender);
                break;
            default:
                sender.sendMessage(Utils.formatMM(String.format("<dark_red>Error: <red>Unknown type \"%s\"", type)));
                break;
        }

        return true;
    }

    private void purgeUser(String target, String matchedPermission, CommandSender sender){
        Utils Utils = new Utils();
        Player player = Bukkit.getPlayer(target);

        if(player == null){
            sender.sendMessage(Utils.formatMM(String.format("<dark_red>Error: <red>Unknown Player \"%s\"", target)));
            return;
        }

        User user = luckPerms.getPlayerAdapter(Player.class).getUser(player);
        int nodeCount = 0;
        for (Node node : user.getNodes(NodeType.PERMISSION)){
            if (node instanceof PermissionNode && node.getKey().startsWith(matchedPermission)){
                user.data().remove(node);
                nodeCount++;
                luckPerms.getUserManager().saveUser(user);
            }
        }
        sender.sendMessage(Utils.formatMM(String.format("removed %s nodes from %s matching \"%s\"", nodeCount, user.getUsername(), matchedPermission)));
    }

    private void purgeGroup(String target, String matchedPermission, CommandSender sender){
        Utils Utils = new Utils();
        sender.sendMessage("I didn't do this yet. 😁😁");
    }
}
