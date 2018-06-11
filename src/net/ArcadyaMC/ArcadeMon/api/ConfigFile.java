package net.ArcadyaMC.ArcadeMon.api;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class ConfigFile {
	
	File file;
	YamlConfiguration config;
	
	public ConfigFile(String name, String path) {
		this.file = new File(path, name);
		new YamlConfiguration();
		config = YamlConfiguration.loadConfiguration(file);
		config.options().copyDefaults(true);
	}
	
	public void create() {
		if(!file.exists()) {
			try {
				file.createNewFile();
				config.save(file);
			} catch (IOException e) {
				Bukkit.getLogger().log(Level.WARNING, "Datei konnte nicht erstellt werden");
				e.printStackTrace();
			}
		}
	}
	
	public void set(String path, Object o) {
		config.addDefault(path, o);
		try {
			config.save(file);
		} catch (IOException e) {
			Bukkit.getLogger().log(Level.WARNING, "Konfiguration konnte nicht gespeichet werden");
			e.printStackTrace();
		}
	}
	
	public Integer getInt(String path) {
		return config.getInt(path);
	}
	
	public String getString(String path) {
		return config.getString(path);
	}
	
	public Double getDouble(String path) {
		return config.getDouble(path);
	}
	
	public boolean getBoolean(String path) {
		return config.getBoolean(path);
	}
	
	public ItemStack getItemStack(String path) {
		return config.getItemStack(path);
	}
	
	public List<?> getList(String path) {
		return config.getList(path);
	}
	
	public Vector getVector(String path) {
		return config.getVector(path);
	}
	
	public void setFile(File file) {
		this.file = file;
		config = YamlConfiguration.loadConfiguration(file);
	}
	
	public File getFile() {
		return this.file;
	}
	
	public YamlConfiguration getCfg() {
		return this.config;
	}
}
