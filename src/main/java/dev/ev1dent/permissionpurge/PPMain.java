package dev.ev1dent.permissionpurge;

import dev.ev1dent.permissionpurge.commands.CommandPP;
import dev.ev1dent.permissionpurge.utilities.PPTabCompletion;
import net.luckperms.api.LuckPerms;
import org.bukkit.plugin.java.JavaPlugin;

public final class PPMain extends JavaPlugin {

    private LuckPerms luckPerms;

    @Override
    public void onEnable() {
        this.luckPerms = getServer().getServicesManager().load(LuckPerms.class);
        registerCommands();
    }

    private void registerCommands() {
        this.getCommand("pp").setExecutor(new CommandPP(this.luckPerms));
        registerTabCompletion();
    }

    private void registerTabCompletion() {
        this.getCommand("pp").setTabCompleter(new PPTabCompletion(this.luckPerms));
    }
}
