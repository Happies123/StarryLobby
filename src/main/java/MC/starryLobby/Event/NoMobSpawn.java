package MC.starryLobby.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class NoMobSpawn implements Listener {
    @EventHandler
    public void NoMobSpawn(CreatureSpawnEvent event) {
        event.setCancelled(true);
    }
}
