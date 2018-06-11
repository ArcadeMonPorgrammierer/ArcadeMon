package net.ArcadyaMC.ArcadeMon.main;

import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.ArcadyaMC.ArcadeMon.api.ConfigFile;
import net.ArcadyaMC.ArcadeMon.api.Trainer;

public class Main extends JavaPlugin{
	
	private static Main main;
	private static ArrayList<Trainer> trainers;
	
	private static ConfigFile mysql;
	
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
		mysql = new ConfigFile("mysql.yml", "plugins/");
		mysql.set("enable", false);
		mysql.set("hostname", "localhost");
		mysql.set("username", "root");
		mysql.set("password", "wtf");
		mysql.set("port", 3306);
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
	
	public static ConfigFile getMySQLConfiguration() {
		return mysql;
	}
}
