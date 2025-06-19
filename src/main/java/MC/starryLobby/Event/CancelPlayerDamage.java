package MC.starryLobby.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class CancelPlayerDamage implements Listener {
    @EventHandler
    public void PlayerComboDamage(EntityDamageByEntityEvent event){
        if (event.getDamager().hasPermission("starrylobby.damage")){
            event.setDamage(event.getFinalDamage());
        }
        else {
            event.setCancelled(true);
        }
    }
}
