package net.ArcadyaMC.ArcadeMon.Main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	private Main main;

	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public void onLoad() {
		this.main = main;
	}
	
	public Main getInstance() {
		return this.main;
	}

}
