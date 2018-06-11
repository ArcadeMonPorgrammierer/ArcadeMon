package net.ArcadyaMC.ArcadeMon.API;

import java.util.ArrayList;

import org.bukkit.Material;

import net.ArcadyaMC.ArcadeMon.Enums.Pokemom.PokeEnum;
import net.ArcadyaMC.ArcadeMon.Enums.Pokemom.PokeType;

public class Pokemon {
	private int init;
	private String name;
	private int ver;
	private int angr;
	private int spezver;
	private int spetzangr;
	private int kp;
	private int maxkp;
	private int level;
	private double exp;
	int ID;
	private ArrayList<PokeType> type;
	private Material material;
	
	//Ein Pokemonobjekt mit Parameter erstellen, 1 Typ
	public Pokemon(PokeType type1, int ID, String name, int init, int def, int att, int spezdef, int spetzatt, int kp, int maxkp, int level, double exp) {
		this.init = init;
		this.ID = ID;
		this.name = name;
		this.ver = def;
		this.angr = att;
		this.spezver = spezdef;
		this.spetzangr = spetzatt;
		this.kp = kp;
		this.maxkp = maxkp;
		this.level = level;
		this.exp = exp;
		//ToDo getMaterialByID
		
		this.type = new ArrayList<>();
		type.add(type1);
	}
	
	//Ein Pokemonobjekt nach den Standartwerden erstellen
	public Pokemon(PokeEnum poke) {
		this.init = poke.getInit();
		this.name = poke.getDE();
		this.ver = poke.getVer();
		this.angr = poke.getAngr();
		this.spezver = poke.getSpez();
		this.spetzangr = poke.getSpez();
		//KP
		//MaxKP
		//Level
		this.ID = poke.getID();
		this.material = poke.getMaterial();
		
		
		this.type = new ArrayList<>();
		this.type.add(poke.getTyp1());
		this.type.add(poke.getTyp2());
		this.exp = 0;
	}
}
