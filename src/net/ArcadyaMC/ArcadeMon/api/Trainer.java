package net.ArcadyaMC.ArcadeMon.api;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class Trainer {
	private Player p;
	private ArrayList<Pokemon> team;
	private double richmoneycash;
	
	//Trainer mit erstellen. Unendlich Pokemon können übergeben werden
	public Trainer(Player p, double money, Pokemon... poke) {
		this.p = p;
		this.richmoneycash = money;
	
	//Nur die ersten 6 übergebenen Pokemon werden beachtet
		for(int i = 0; i < 5; i++) {
			team.add(poke[i]);
		}
		//Arbeitsspeicher sparen
		poke = null;
		System.gc();
	}

	public Player getP() {
		return p;
	}

	public void setP(Player p) {
		this.p = p;
	}

	public ArrayList<Pokemon> getTeam() {
		return team;
	}

	public void setTeam(ArrayList<Pokemon> team) {
		this.team = team;
	}

	public double getRichmoneycash() {
		return richmoneycash;
	}

	public void setRichmoneycash(double richmoneycash) {
		this.richmoneycash = richmoneycash;
	}
}
