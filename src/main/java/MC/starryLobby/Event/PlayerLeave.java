package MC.starryLobby.Event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {
    @EventHandler
    public void PlayerLeaveMessage(PlayerQuitEvent event){
        event.setQuitMessage(null);
        event.setQuitMessage(ChatColor.GREEN + "玩家 " + ChatColor.WHITE + event.getPlayer().getName() + ChatColor.GREEN + "离开了服务器");
    }
}
