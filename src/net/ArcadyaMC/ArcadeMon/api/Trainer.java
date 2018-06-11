package net.ArcadyaMC.ArcadeMon.api;

import org.bukkit.entity.Player;

public class Trainer {
	private Player p;
	private double richmoneycash;
	private Team team;
	
	//Trainer mit erstellen. Unendlich Pokemon können übergeben werden
	public Trainer(Player p, double money, Team team) {
		this.p = p;
		this.richmoneycash = money;
	}

	public Player getP() {
		return p;
	}

	public void setP(Player p) {
		this.p = p;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public double getRichmoneycash() {
		return richmoneycash;
	}

	public void setRichmoneycash(double richmoneycash) {
		this.richmoneycash = richmoneycash;
	}
}
