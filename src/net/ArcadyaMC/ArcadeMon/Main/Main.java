package net.ArcadyaMC.ArcadeMon.Main;

import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.ArcadyaMC.ArcadeMon.API.Trainer;

public class Main extends JavaPlugin{
	
	private static Main main;
	private static ArrayList<Trainer> trainers;
	
	@Override
	public void onEnable() {
		Bukkit.getLogger().log(Level.INFO, "Pokemonplugin wird gestartet, ihr Hurensöhne");
		Main.trainers = new ArrayList<>();
	}
	
	@Override
	public void onDisable() {
		Bukkit.getLogger().log(Level.INFO, "Pokemonplugin wird gestoppt, ihr Hurensöhne");
	}
	
	@Override
	public void onLoad() {
		Bukkit.getLogger().log(Level.INFO, "Pokemonplugin wird geladen, ihr Hurensöhne");
		Main.main = this;
		createConfiguration();
	}
	
	private void createConfiguration() {
		
	}
	
	public static Main getInstance() {
		return main;
	}
	
	public static ArrayList<Trainer> getTrainers() {
		return trainers;
	}
	
	public static Trainer getOnlineTrainer(UUID uuid) {
		for(Trainer t : trainers) {
			if(t.getP().getUniqueId().equals(uuid)) {
				return t;
			}
		}
		return null;
	}
}
