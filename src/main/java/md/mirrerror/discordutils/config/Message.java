package md.mirrerror.discordutils.config;

import md.mirrerror.discordutils.Main;
import org.bukkit.ChatColor;

public enum Message {

    PREFIX,
    INSUFFICIENT_PERMISSIONS,
    ACCOUNT_SUCCESSFULLY_LINKED,
    INVALID_LINK_CODE,
    INVALID_TWOFACTOR_CODE,
    ACCOUNT_ALREADY_VERIFIED,
    DISCORDUTILS_LINK_USAGE,
    SENDER_IS_NOT_A_PLAYER,
    CONFIG_FILES_RELOADED,
    ACCOUNT_IS_NOT_VERIFIED,
    ENABLED,
    DISABLED,
    DISCORDUTILS_TWOFACTOR_SUCCESSFUL,
    TWOFACTOR_NEEDED,
    TWOFACTOR_AUTHORIZED,
    TWOFACTOR_CODE_MESSAGE,
    VERIFICATION_MESSAGE,
    VERIFICATION_CODE_MESSAGE,
    UNKNOWN_SUBCOMMAND,
    LINK_ALREADY_INITIATED,
    ONLINE,
    COMMAND_EXECUTED,
    DISCORD_SUDO_USAGE,
    ERROR,
    INFORMATION,
    SUCCESSFULLY;

    public String getText() {
        return ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfigManager().getLang().getString(String.valueOf(this)));
    }

    public String getText(boolean addPrefix) {
        if(addPrefix) return ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfigManager().getLang().getString(String.valueOf(PREFIX)) + " "
                + ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfigManager().getLang().getString(String.valueOf(this))));
        return ChatColor.translateAlternateColorCodes('&', Main.getInstance().getConfigManager().getLang().getString(String.valueOf(this)));
    }
}
