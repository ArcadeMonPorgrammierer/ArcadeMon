package net.ArcadyaMC.ArcadeMon.API;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class Trainer {
	private Player p;
	private ArrayList<Pokemon> team;
	private double richmoneycash;
	
	//Trainer mit erstellen. Unendlich Pokemon k�nnen �bergeben werden
	public Trainer(Player p, double money, Pokemon... poke) {
		this.p = p;
		this.richmoneycash = money;
	
	//Nur die ersten 6 �bergebenen Pokemon werden beachtet
		for(int i = 0; i < 5; i++) {
			team.add(poke[i]);
		}
		//Arbeitsspeicher sparen
		poke = null;
		System.gc();
	}
}