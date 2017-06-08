package me.jobisingh.jbot.hub;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class Events implements Listener {

    @EventHandler
    public void onPostLogin(ChatEvent event) {
    	 if (event.getMessage().equals("/server")) {
    		 
    		 ProxiedPlayer player = (ProxiedPlayer) event.getSender();
    		 player.sendMessage("§8[§1§lJplex§8] " + "§bYou are on server: " +ChatColor.AQUA + player.getServer().getInfo().getName().toString());
    		 event.setCancelled(true);
    	 }
    	

    	
    	
    }

}