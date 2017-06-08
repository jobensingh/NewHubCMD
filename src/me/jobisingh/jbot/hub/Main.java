package me.jobisingh.jbot.hub;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {
    @Override
    public void onEnable() {
        // You should not put an enable message in your plugin.
        // BungeeCord already does so
        getLogger().info("Server Hub to hub and lobby");
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new me.jobisingh.jbot.hub.Lobby(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new me.jobisingh.jbot.hub.Hub(this));
        getProxy().getPluginManager().registerListener(this, new Events());
    
    }
    


    
}
	
