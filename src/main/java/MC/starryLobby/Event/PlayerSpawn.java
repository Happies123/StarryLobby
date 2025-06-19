package MC.starryLobby.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.spigotmc.event.player.PlayerSpawnLocationEvent;

public class PlayerSpawn implements Listener {
    @EventHandler
    public void PlayerSpawn(PlayerSpawnLocationEvent event){
        event.getSpawnLocation().setX(27);
        event.getSpawnLocation().setY(47);
        event.getSpawnLocation().setZ(-1);
        event.getSpawnLocation().setYaw(-88);
        event.getSpawnLocation().setPitch(0.0f);




    }
}
