package MC.starryLobby.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class CancelPlayerAction implements Listener {
    @EventHandler
    public void Nether(PlayerPortalEvent event){
        event.setCancelled(true);
    }
}
