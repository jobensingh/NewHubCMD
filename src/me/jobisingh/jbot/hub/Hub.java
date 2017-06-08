package me.jobisingh.jbot.hub;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Hub extends Command{

    public Hub(Main This) {
        super("Hub");
        
   }

	@Override
	public void execute(CommandSender sender, String[] args) {
		if ((sender instanceof ProxiedPlayer)) {
            ProxiedPlayer p = (ProxiedPlayer)sender;
            p.connect(ProxyServer.getInstance().getServerInfo("hub"));
            
            p.sendMessage(new ComponentBuilder ("Connecting you to the hub!").color(ChatColor.BLUE).create());          

            p.connect(ProxyServer.getInstance().getServerInfo("hub"));
		
		}
	}
	
	

    
	
}
