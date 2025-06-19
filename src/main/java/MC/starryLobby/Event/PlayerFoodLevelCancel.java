package MC.starryLobby.Event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class PlayerFoodLevelCancel implements Listener {
    @EventHandler
    public void FoodLevel(FoodLevelChangeEvent event){
        if (event.getEntity() instanceof Player){
            event.setCancelled(true);
        }
    }
}
