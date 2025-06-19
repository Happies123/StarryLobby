package MC.starryLobby.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import java.net.http.WebSocket;

public class CancelPlayerDrop implements Listener {
    @EventHandler
    public void CancelPlayerDrop(PlayerDropItemEvent event){
        if (!event.getPlayer().hasPermission("starrylobby.drop")){
            event.setCancelled(true);
        }
    }
}
