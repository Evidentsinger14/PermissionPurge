package dev.ev1dent.permissionpurge.utilities;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.model.group.Group;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

import java.util.*;

public class PPTabCompletion implements TabCompleter {
    private final LuckPerms luckPerms;

    public PPTabCompletion(LuckPerms luckPerms) {
        this.luckPerms = luckPerms;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command cmd, String s, String[] args) {
        final List<String> completions = new ArrayList<>();
        switch (args.length) {
            case 1: { // args 0
                final String[] userOrGroup = {"user", "group"};
                StringUtil.copyPartialMatches(args[0], Arrays.asList(userOrGroup), completions);
                return completions;
            }

            case 2: { // args 1
                if (args[0].equalsIgnoreCase("user")) {
                    return null; // sends list of players

                } else if (args[0].equalsIgnoreCase("group")) {
                    Collection<Group> groups = luckPerms.getGroupManager().getLoadedGroups();
                    List<String> groupNames = new ArrayList<>();

                    for (Group group : groups) {
                        groupNames.add(group.getName());
                    }

                    StringUtil.copyPartialMatches(args[1], groupNames, completions);
                    return completions;
                }
                return null;
            }
        }
        return null;
    }
}



