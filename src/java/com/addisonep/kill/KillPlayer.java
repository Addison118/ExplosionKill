package com.solarburst.addisonep;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ExplosionKill extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been enabled!");
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("kill")) {
			 
			Player target = sender.getWorld().getPlayer(args[0]);
			float explosionPower = 4F;
			//Checks if player is online
			if(target == null) {
				sender.sendMessage(args[0] + " is not online!");
				return true;
			}
			target.getWorld().createExplosion(target.getLocation(), explosionPower);
			target.setHealth(0.0D);
			
			
			return true;
			
		}
		
		return false;
		
	}
	
}
