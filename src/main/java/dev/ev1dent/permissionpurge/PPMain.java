package dev.ev1dent.permissionpurge;

import dev.ev1dent.permissionpurge.commands.CommandPP;
import net.luckperms.api.LuckPerms;
import org.bukkit.plugin.java.JavaPlugin;

public final class PPMain extends JavaPlugin {

    private LuckPerms luckPerms;

    @Override
    public void onEnable() {
        this.luckPerms = getServer().getServicesManager().load(LuckPerms.class);
        registerCommands();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    
    private void registerCommands(){
        this.getCommand("pp").setExecutor(new CommandPP(this.luckPerms));
    }
}
