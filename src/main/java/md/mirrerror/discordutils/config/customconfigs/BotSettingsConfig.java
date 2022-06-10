package md.mirrerror.discordutils.config.customconfigs;

import org.bukkit.configuration.ConfigurationSection;

import java.util.Collections;

public class BotSettingsConfig extends CustomConfig {

    public BotSettingsConfig(String fileName) {
        super(fileName);
    }
    @Override
    public void initializeFields() {
        getFileConfiguration().addDefault("BotToken", "");
        getFileConfiguration().addDefault("BotPrefix", "!");
        getFileConfiguration().addDefault("BotCommandTextChannels", Collections.emptyList());
        getFileConfiguration().addDefault("AsyncBotLoading", true);
        getFileConfiguration().addDefault("OnlineStatus", "online");
        getFileConfiguration().addDefault("Activities.Enabled", true);
        getFileConfiguration().addDefault("Activities.UpdateDelay", 10);
        getFileConfiguration().addDefault("Activities.1.Type", "playing");
        getFileConfiguration().addDefault("Activities.1.Text", "Minecraft");
        getFileConfiguration().addDefault("Activities.2.Type", "watching");
        getFileConfiguration().addDefault("Activities.2.Text", "mirrerror#7777");
        getFileConfiguration().addDefault("Activities.3.Type", "watching");
        getFileConfiguration().addDefault("Activities.3.Text", "DiscordUtils");
        getFileConfiguration().addDefault("SuccessfulEmbedColor", "#0AAC00");
        getFileConfiguration().addDefault("InformationEmbedColor", "#ECC846");
        getFileConfiguration().addDefault("ErrorEmbedColor", "#A80000");
        getFileConfiguration().addDefault("GroupRoles", new ConfigurationSection[0]);
        getFileConfiguration().addDefault("AdminRoles", Collections.emptyList());
        getFileConfiguration().addDefault("VerifiedRole.Enabled", false);
        getFileConfiguration().addDefault("VerifiedRole.Id", -1);
        getFileConfiguration().addDefault("2FAType", "reaction");
        getFileConfiguration().addDefault("2FASessions", true);
        getFileConfiguration().addDefault("2FASessionTime", 900);
        getFileConfiguration().addDefault("2FATimeToAuthorize", 30);
        getFileConfiguration().addDefault("Default2FAValue", false);
        getFileConfiguration().addDefault("NotifyAboutDisabled2FA", true);
        getFileConfiguration().addDefault("ForceVerification", false);
        getFileConfiguration().addDefault("AllowedCommandsBeforePassing2FA", Collections.emptyList());
        getFileConfiguration().addDefault("ActionsAfterFailing2FA.1.Messages", Collections.singletonList("You have failed 2FA for &bone&f time. If you will have failed 2FA &btwo&f more times, your IP address will be banned."));
        getFileConfiguration().addDefault("ActionsAfterFailing2FA.1.Commands", Collections.emptyList());
        getFileConfiguration().addDefault("ActionsAfterFailing2FA.3.Messages", Collections.emptyList());
        getFileConfiguration().addDefault("ActionsAfterFailing2FA.3.Commands", Collections.singletonList("banip %player% 30m Suspicious activity."));
        getFileConfiguration().addDefault("CommandsAfter2FADeclining", Collections.emptyList());
        getFileConfiguration().addDefault("CommandsAfter2FAPassing", Collections.emptyList());
        getFileConfiguration().addDefault("CommandsAfterVerification", Collections.emptyList());
        getFileConfiguration().addDefault("CommandsAfterUnlink", Collections.emptyList());
        getFileConfiguration().addDefault("CommandsAfterServerBoosting", Collections.emptyList());
        getFileConfiguration().addDefault("RolesSynchronization.Enabled", true);
        getFileConfiguration().addDefault("RolesSynchronization.DelayedRolesCheck.Enabled", true);
        getFileConfiguration().addDefault("RolesSynchronization.DelayedRolesCheck.Delay", 30);
        getFileConfiguration().addDefault("NamesSynchronization.Enabled", true);
        getFileConfiguration().addDefault("NamesSynchronization.NamesSyncFormat", "%player%");
        getFileConfiguration().addDefault("NamesSynchronization.DelayedNamesCheck.Enabled", true);
        getFileConfiguration().addDefault("NamesSynchronization.DelayedNamesCheck.Delay", 30);
        getFileConfiguration().addDefault("GuildVoiceRewards.Enabled", true);
        getFileConfiguration().addDefault("GuildVoiceRewards.Time", 300);
        getFileConfiguration().addDefault("GuildVoiceRewards.Reward", "eco give %player% 100");
        getFileConfiguration().addDefault("GuildVoiceRewards.BlacklistedChannels", Collections.emptyList());
        getFileConfiguration().addDefault("GuildVoiceRewards.MinMembers", 1);
        getFileConfiguration().addDefault("MessagesChannel.Enabled", false);
        getFileConfiguration().addDefault("MessagesChannel.Id", -1);
        getFileConfiguration().addDefault("ServerActivityLogging.Enabled", false);
        getFileConfiguration().addDefault("ServerActivityLogging.ChannelId", -1);
        getFileConfiguration().addDefault("ServerActivityLogging.JoinEmbedColor", "#8de113");
        getFileConfiguration().addDefault("ServerActivityLogging.QuitEmbedColor", "#f34520");
        getFileConfiguration().addDefault("ServerActivityLogging.DeathEmbedColor", "#f34520");
        getFileConfiguration().addDefault("ServerActivityLogging.ChatEmbedColor", "#e8d725");
        getFileConfiguration().addDefault("Console.Enabled", false);
        getFileConfiguration().addDefault("Console.ClearOnEveryInit", true);
        getFileConfiguration().addDefault("Console.ChannelId", -1);
        getFileConfiguration().addDefault("Console.BlacklistedCommands", Collections.emptyList());
        getFileConfiguration().addDefault("NotifyAboutMentions.Enabled", true);
        getFileConfiguration().addDefault("NotifyAboutMentions.Title.Enabled", true);
        getFileConfiguration().addDefault("NotifyAboutMentions.Title.FadeIn", 3);
        getFileConfiguration().addDefault("NotifyAboutMentions.Title.Stay", 50);
        getFileConfiguration().addDefault("NotifyAboutMentions.Title.FadeOut", 3);
        getFileConfiguration().addDefault("NotifyAboutMentions.Title.Title", "&bNew mention!");
        getFileConfiguration().addDefault("NotifyAboutMentions.Title.Subtitle", "&fCheck your &9Discord&f.");
        getFileConfiguration().addDefault("NotifyAboutMentions.Message.Enabled", false);
        getFileConfiguration().addDefault("NotifyAboutMentions.Message.Text", "&9DiscordUtils &7/&f You have been mentioned in &9Discord&f.");
        getFileConfiguration().addDefault("NotifyAboutMentions.Sound.Enabled", true);
        getFileConfiguration().addDefault("NotifyAboutMentions.Sound.Type", "ENTITY_EXPERIENCE_ORB_PICKUP");
        getFileConfiguration().addDefault("NotifyAboutMentions.Sound.Volume", 1);
        getFileConfiguration().addDefault("NotifyAboutMentions.Sound.Pitch", 1);
        getFileConfiguration().options().copyDefaults(true);
        getFileConfiguration().options().copyHeader(true);
        saveConfigFile();
    }
}
