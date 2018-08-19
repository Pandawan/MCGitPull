package io.github.pandawan.mcgitpull;

import org.bukkit.plugin.java.JavaPlugin;

public class MCGitPull extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
