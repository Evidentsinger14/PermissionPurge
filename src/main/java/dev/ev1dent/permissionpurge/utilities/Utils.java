package dev.ev1dent.permissionpurge.utilities;

import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.CommandSender;

public class Utils {

    public Component formatMM(String s) {
        return MiniMessage.miniMessage().deserialize(s).decorationIfAbsent(TextDecoration.ITALIC, TextDecoration.State.FALSE);
    }

    public void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(formatMM(String.format("<grey>[<bold><dark_aqua>P</dark_aqua><aqua>P</aqua></bold>]<white> %s", message)));
    }
}
