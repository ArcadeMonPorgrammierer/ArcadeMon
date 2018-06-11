package net.ArcadyaMC.ArcadeMon.api;

import java.io.Serializable;
import java.util.ArrayList;

public class Team implements Serializable{
	

	private ArrayList<Pokemon> team;

	public Team(Pokemon...poke) {
		//Nur die ersten 6 übergebenen Pokemon werden beachtet
		for(int i = 0; i < 5; i++) {
			team.add(poke[i]);
		}
		poke = null;
	}
}
