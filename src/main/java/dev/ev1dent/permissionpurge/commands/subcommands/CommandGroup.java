package dev.ev1dent.permissionpurge.commands.subcommands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.ev1dent.permissionpurge.utilities.Utils;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import net.luckperms.api.model.group.Group;

public class CommandGroup {



    public LiteralArgumentBuilder<CommandSourceStack> create() {
        return Commands.literal("group")

            .then(Commands.argument("group", StringArgumentType.string())
                .executes(ctx -> {
                    // do stuff
                    return Command.SINGLE_SUCCESS;
                })
            );
    }

    private void purgeGroup(String target, String matchedPermission, CommandSender sender) {
        Utils Utils = new Utils();
        Group group = luckPerms.getGroupManager().getGroup(target);

        if (group == null) {
            Utils.sendMessage(sender, String.format("<dark_red>Error: <red>Unknown Group \"%s\"", target));
            return;
        }

        int nodeCount = 0;
        for (Node node : group.getNodes()) {
            if (node.getKey().startsWith(matchedPermission)) {
                group.data().remove(node);
                nodeCount++;
                luckPerms.getGroupManager().saveGroup(group);
            }
        }
        String nodesOrNode;
        if (nodeCount == 1) {
            nodesOrNode = "node";
        } else {
            nodesOrNode = "nodes";
        }
        Utils.sendMessage(sender, String.format("Removed %s " + nodesOrNode + " from %s matching \"%s\"", nodeCount, group.getName(), matchedPermission));

    }
}
