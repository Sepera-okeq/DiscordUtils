package md.mirrerror.discordutils.utils.integrations.placeholders;

import md.mirrerror.discordutils.Main;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class PAPIManager {

    private final boolean isEnabled;

    public PAPIManager() {
        this.isEnabled = Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null;
        if(!isEnabled) {
            Main.getInstance().getLogger().warning("It seems like you don't have PlaceholderAPI installed on your server. Disabling PAPIManager...");
        } else {
            Main.getInstance().getLogger().info("PAPIManager has been successfully enabled.");
        }
    }

    public String setPlaceholders(Player player, String s) {
        if(isEnabled) return PlaceholderAPI.setPlaceholders(player, s);
        return s;
    }

    public String setPlaceholders(OfflinePlayer offlinePlayer, String s) {
        if(isEnabled) return PlaceholderAPI.setPlaceholders(offlinePlayer, s);
        return s;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
