package MC.starryLobby.Event;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerVoidSetback implements Listener {
    @EventHandler
    public void PlayerVoidSetback(PlayerMoveEvent event){
        World world = event.getPlayer().getWorld();
        Location spawn = new Location(world, 27, 47, -1, -88, 0.0f);
        if (event.getPlayer().getLocation().getY() < 20){
            event.getPlayer().teleport(spawn);
        }
    }
}
