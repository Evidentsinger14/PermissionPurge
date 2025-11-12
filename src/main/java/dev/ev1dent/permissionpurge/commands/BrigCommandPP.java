package dev.ev1dent.permissionpurge.commands;


import com.mojang.brigadier.tree.LiteralCommandNode;
import dev.ev1dent.permissionpurge.PPMain;
import dev.ev1dent.permissionpurge.commands.subcommands.CommandGroup;
import dev.ev1dent.permissionpurge.commands.subcommands.CommandUser;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import org.jspecify.annotations.NullMarked;

@SuppressWarnings({"UnstableApiUsage", "SameReturnValue"})
@NullMarked
public class BrigCommandPP {

    private PPMain ppPlugin(){
        return PPMain.getPlugin(PPMain.class);
    }

    public LiteralCommandNode<CommandSourceStack> constructCommand() {
        return Commands.literal("warehouse")
            .then(new CommandGroup(ppPlugin()).create())
            .then(new CommandUser(ppPlugin()).create())
            .build();
    }
}