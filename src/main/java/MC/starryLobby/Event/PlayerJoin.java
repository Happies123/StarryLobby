package MC.starryLobby.Event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void PlayerJoinMessage(PlayerJoinEvent event){
        event.setJoinMessage(null);
        event.setJoinMessage(ChatColor.GREEN + "玩家 " + ChatColor.WHITE + event.getPlayer().getName() + ChatColor.GREEN +  " 加入了大厅!");
    }
}
