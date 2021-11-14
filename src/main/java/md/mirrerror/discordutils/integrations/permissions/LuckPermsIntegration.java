package md.mirrerror.discordutils.integrations.permissions;

import md.mirrerror.discordutils.Main;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.group.Group;
import net.luckperms.api.model.user.User;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LuckPermsIntegration implements PermissionsIntegration {

    @Override
    public List<String> getUserGroups(Player player) {
        List<String> groups = new ArrayList<>();
        try {
            LuckPerms api = LuckPermsProvider.get();
            User user = api.getUserManager().getUser(player.getUniqueId());
            if(user != null) {
                Collection<Group> inheritedGroups = user.getInheritedGroups(user.getQueryOptions());
                for(Group group : inheritedGroups) {
                    groups.add(group.getName());
                }
            }
        } catch (IllegalStateException ignored) {
            Main.getInstance().getLogger().severe("Something went wrong while using LuckPerms integration. Probably, there is not the LuckPerms plugin installed on your server.");
        }
        return groups;
    }

    @Override
    public List<String> getUserGroups(OfflinePlayer offlinePlayer) {
        List<String> groups = new ArrayList<>();
        try {
            LuckPerms api = LuckPermsProvider.get();
            User user = api.getUserManager().getUser(offlinePlayer.getUniqueId());
            if(user != null) {
                Collection<Group> inheritedGroups = user.getInheritedGroups(user.getQueryOptions());
                for(Group group : inheritedGroups) {
                    groups.add(group.getName());
                }
            }
        } catch (IllegalStateException ignored) {
            Main.getInstance().getLogger().severe("Something went wrong while using LuckPerms integration. Probably, there is not the LuckPerms plugin installed on your server.");
        }
        return groups;
    }

}
