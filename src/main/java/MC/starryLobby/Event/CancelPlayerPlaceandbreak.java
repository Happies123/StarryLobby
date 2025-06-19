package MC.starryLobby.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;

public class CancelPlayerPlaceandbreak implements Listener {
    @EventHandler
    public void CancelPlayerPlace(BlockPlaceEvent event){
        if (!event.getPlayer().hasPermission("starrylobby.place")){
            event.setCancelled(true);
        }

    }
    @EventHandler
    public void CancelPlayerBreak(BlockBreakEvent event){
        if (!event.getPlayer().hasPermission("starrylobby.break")){
            event.setCancelled(true);
        }
    }


}
