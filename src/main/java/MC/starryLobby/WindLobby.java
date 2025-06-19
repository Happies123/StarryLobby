package MC.starryLobby;

import MC.starryLobby.Event.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WindLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Loading");
        Bukkit.getPluginManager().registerEvents(new CancelPlayerDamage(),this);
        Bukkit.getPluginManager().registerEvents(new PlayerLeave(),this);
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(),this);
        Bukkit.getPluginManager().registerEvents(new CancelPlayerDamage(),this);
        Bukkit.getPluginManager().registerEvents(new CancelPlayerDrop(),this);
        Bukkit.getPluginManager().registerEvents(new CancelPlayerPlaceandbreak(),this);
        Bukkit.getPluginManager().registerEvents(new NoMobSpawn(),this);
        Bukkit.getPluginManager().registerEvents(new PlayerSpawn(),this);
        Bukkit.getPluginManager().registerEvents(new CancelPlayerAction(),this);
        Bukkit.getPluginManager().registerEvents(new PlayerVoidSetback(),this);
        Bukkit.getPluginManager().registerEvents(new PlayerFoodLevelCancel(),this);
        getLogger().info("Loaded successfully");
        getLogger().info("Plugin Author:WaterFall");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
