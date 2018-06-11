package net.ArcadyaMC.ArcadeMon.Enums.Attack;



public enum AttackEnum {

	Pfund(AttackType.normal, AttackKlasse.physisch, 40, 100, 35, AttackKat.st�rke),
	Karateschlag(AttackType.kampf, AttackKlasse.physisch, 50, 100, 25, AttackKat.st�rke),
	Duplexhieb(AttackType.normal, AttackKlasse.physisch, 15, 85, 10, AttackKat.putzigkeit),
	Kometenhieb(AttackType.normal, AttackKlasse.physisch, 18, 85, 15, AttackKat.st�rke),
	Megahieb(AttackType.normal, AttackKlasse.physisch, 80, 85, 20, AttackKat.st�rke),
	Zahltag(AttackType.normal, AttackKlasse.physisch, 40, 100, 20, AttackKat.klugheit),
	Feuerschlag(AttackType.feuer, AttackKlasse.physisch, 75, 100, 15, AttackKat.st�rke),
	Eishieb(AttackType.eis, AttackKlasse.physisch, 75, 100, 15, AttackKat.sch�nheit),
	Donnerschlag(AttackType.elektro, AttackKlasse.physisch, 75, 100, 15, AttackKat.coolness),
	Kratzer(AttackType.normal, AttackKlasse.physisch, 40, 100, 35, AttackKat.st�rke),
	Klammer(AttackType.normal, AttackKlasse.physisch, 55, 100, 30, AttackKat.st�rke),
	Guillotine(AttackType.normal, AttackKlasse.physisch, 100000, 30, 5, AttackKat.coolness),
	Klingensturm(AttackType.normal, AttackKlasse.spezial, 80, 100, 10, AttackKat.coolness),
	Schwerttanz(AttackType.normal, AttackKlasse.status, 0, 0, 20, AttackKat.sch�nheit),
	Zerschneider(AttackType.normal, AttackKlasse.physisch, 50, 95, 30, AttackKat.coolness),
	Windsto�(AttackType.flug, AttackKlasse.spezial, 40, 100, 35, AttackKat.klugheit),
	Fl�gelschlag(AttackType.flug, AttackKlasse.physisch, 60, 100, 35, AttackKat.coolness),
	WirbelwindKlammer(AttackType.normal, AttackKlasse.status, 0, 0, 20, AttackKat.klugheit),
	Fliegen(AttackType.flug, AttackKlasse.physisch, 90, 95, 15, AttackKat.klugheit),
	Klammergriff(AttackType.normal, AttackKlasse.physisch, 15, 85, 20, AttackKat.st�rke),
	Slam(AttackType.normal, AttackKlasse.physisch, 80, 75, 20, AttackKat.st�rke),
	Rankenhieb(AttackType.pflanze, AttackKlasse.physisch, 45, 100, 25, AttackKat.coolness),
	Stampfer(AttackType.normal, AttackKlasse.physisch, 65, 100, 20, AttackKat.st�rke),
	Doppelkick(AttackType.kampf, AttackKlasse.physisch, 30, 100, 30, AttackKat.coolness),
	Megakick(AttackType.normal, AttackKlasse.physisch, 120, 75, 5, AttackKat.coolness),
	Sprungkick(AttackType.kampf, AttackKlasse.physisch, 100, 95, 10, AttackKat.coolness),
	Fegekick(AttackType.kampf, AttackKlasse.physisch, 60, 85, 15, AttackKat.coolness),
	Sandwirbel(AttackType.boden, AttackKlasse.status, 0, 100, 15, AttackKat.putzigkeit),
	Kopfnuss(AttackType.normal, AttackKlasse.physisch, 70, 100, 15, AttackKat.st�rke),
	Hornattacke(AttackType.normal, AttackKlasse.physisch, 65, 100, 25, AttackKat.coolness),
	Furienschlag(AttackType.normal, AttackKlasse.physisch, 15, 85, 20, AttackKat.coolness),
	Hornbohrer(AttackType.normal, AttackKlasse.physisch, 100000, 30, 5, AttackKat.coolness),
	Tackle(AttackType.normal, AttackKlasse.physisch, 50, 100, 35, AttackKat.st�rke),
	Bodyslam(AttackType.normal, AttackKlasse.physisch, 85, 100, 15, AttackKat.st�rke),
	Wickel(AttackType.normal, AttackKlasse.physisch, 15, 90, 20, AttackKat.st�rke),
	Bodycheck(AttackType.normal, AttackKlasse.physisch, 90, 85, 20, AttackKat.st�rke),
	Fuchtler(AttackType.normal, AttackKlasse.physisch, 120, 100, 10, AttackKat.st�rke),
	Risikotackle(AttackType.normal, AttackKlasse.physisch, 120, 100, 15, AttackKat.st�rke),
	Rutenschlag(AttackType.normal, AttackKlasse.status, 0, 100, 30, AttackKat.putzigkeit),
	Giftstachel(AttackType.gift, AttackKlasse.physisch, 15, 100, 35, AttackKat.klugheit),
	Duonadel(AttackType.k�fer, AttackKlasse.physisch, 25, 100, 20, AttackKat.coolness),
	Nadelrakete(AttackType.k�fer, AttackKlasse.physisch, 25, 95, 20, AttackKat.coolness),
	Silberblick(AttackType.normal, AttackKlasse.status, 0, 100, 30, AttackKat.coolness),
	Biss(AttackType.normal, AttackKlasse.physisch, 60, 100, 25, AttackKat.st�rke),
	Heuler(AttackType.normal, AttackKlasse.status, 0, 100, 40, AttackKat.putzigkeit),
	Br�ller(AttackType.normal, AttackKlasse.status, 0, 0, 20, AttackKat.coolness),
	Gesang(AttackType.normal, AttackKlasse.status, 0, 55, 15, AttackKat.putzigkeit),
	Superschall(AttackType.normal, AttackKlasse.status, 0, 55, 20, AttackKat.klugheit),
	Ultraschall(AttackType.normal, AttackKlasse.spezial, 20, 90, 20, AttackKat.coolness),
	Aussetzer(AttackType.normal, AttackKlasse.status, 0, 100, 20, AttackKat.klugheit),
	S�ure(AttackType.gift, AttackKlasse.spezial, 40, 100, 30, AttackKat.klugheit),
	Glut(AttackType.feuer, AttackKlasse.spezial, 40, 100, 25, AttackKat.putzigkeit),
	Flammenwurf(AttackType.feuer, AttackKlasse.spezial, 90, 100, 15, AttackKat.sch�nheit),
	Wei�nebel(AttackType.eis, AttackKlasse.status, 0, 0, 30, AttackKat.sch�nheit),
	Aquaknarre(AttackType.wasser, AttackKlasse.spezial, 40, 100, 25, AttackKat.putzigkeit),
	Hydropumpe(AttackType.wasser, AttackKlasse.spezial, 110, 80, 5, AttackKat.sch�nheit),
	Surfer(AttackType.wasser, AttackKlasse.spezial, 90, 100, 15, AttackKat.sch�nheit),
	Eisstrahl(AttackType.eis, AttackKlasse.spezial, 90, 100, 10, AttackKat.sch�nheit),
	Blizzard(AttackType.eis, AttackKlasse.spezial, 110, 70, 5, AttackKat.sch�nheit),
	Psystrahl(AttackType.psycho, AttackKlasse.spezial, 65, 100, 20, AttackKat.sch�nheit),
	Blubbstrahl(AttackType.wasser, AttackKlasse.spezial, 65, 100, 20, AttackKat.sch�nheit),
	Aurorastrahl(AttackType.eis, AttackKlasse.spezial, 65, 100, 20, AttackKat.sch�nheit),
	Hyperstrahl(AttackType.normal, AttackKlasse.spezial, 150, 90, 5, AttackKat.coolness),
	Schnabel(AttackType.flug, AttackKlasse.physisch, 35, 100, 35, AttackKat.coolness),
	Bohrschnabel(AttackType.flug, AttackKlasse.physisch, 80, 100, 20, AttackKat.coolness),
	�berroller(AttackType.kampf, AttackKlasse.physisch, 80, 80, 25, AttackKat.coolness),
	Fu�kick(AttackType.kampf, AttackKlasse.physisch, 50, 100, 20, AttackKat.st�rke),
	Konter(AttackType.kampf, AttackKlasse.physisch, 0, 100, 20, AttackKat.st�rke),
	Geowurf(AttackType.kampf, AttackKlasse.physisch, 60, 100, 20, AttackKat.st�rke),
	St�rke(AttackType.normal, AttackKlasse.physisch, 80, 100, 15, AttackKat.st�rke),
	Absorber(AttackType.pflanze, AttackKlasse.spezial, 20, 100, 25, AttackKat.klugheit),
	Megasauger(AttackType.pflanze, AttackKlasse.spezial, 40, 100, 15, AttackKat.klugheit),
	Egelsamen(AttackType.pflanze, AttackKlasse.status, 0, 90, 10, AttackKat.klugheit),
	Wachstum(AttackType.normal, AttackKlasse.status, 0, 0, 20, AttackKat.sch�nheit),
	Rasierblatt(AttackType.pflanze, AttackKlasse.physisch, 55, 95, 25, AttackKat.coolness),
	Solarstrahl(AttackType.pflanze, AttackKlasse.spezial, 120, 100, 10, AttackKat.coolness),
	Giftpuder(AttackType.gift, AttackKlasse.status, 0, 75, 35, AttackKat.klugheit),
	Stachelspore(AttackType.pflanze, AttackKlasse.status, 0, 75, 30, AttackKat.klugheit),
	Schlafpuder(AttackType.pflanze, AttackKlasse.status, 0, 75, 15, AttackKat.klugheit),
	Bl�ttertanz(AttackType.pflanze, AttackKlasse.spezial, 120, 100, 10, AttackKat.sch�nheit),
	Fadenschuss(AttackType.k�fer, AttackKlasse.status, 0, 95, 40, AttackKat.klugheit),
	Drachenwut(AttackType.drache, AttackKlasse.spezial, 40, 100, 10, AttackKat.coolness),
	Feuerwirbel(AttackType.feuer, AttackKlasse.spezial, 35, 85, 15, AttackKat.sch�nheit),
	Donnerschock(AttackType.elektro, AttackKlasse.spezial, 40, 100, 30, AttackKat.coolness),
	Donnerblitz(AttackType.elektro, AttackKlasse.spezial, 90, 100, 15, AttackKat.coolness),
	Donnerwelle(AttackType.elektro, AttackKlasse.status, 0, 100, 20, AttackKat.coolness),
	Donner(AttackType.elektro, AttackKlasse.spezial, 110, 70, 10, AttackKat.coolness),
	Steinwurf(AttackType.stein, AttackKlasse.physisch, 50, 90, 15, AttackKat.st�rke),
	Erdbeben(AttackType.boden, AttackKlasse.physisch, 100, 100, 10, AttackKat.st�rke),
	Geofissur(AttackType.boden, AttackKlasse.physisch, 100000, 30, 5, AttackKat.st�rke),
	Schaufler(AttackType.boden, AttackKlasse.physisch, 80, 100, 10, AttackKat.st�rke),
	Toxin(AttackType.gift, AttackKlasse.status, 0, 90, 10, AttackKat.klugheit),
	Konfusion(AttackType.psycho, AttackKlasse.spezial, 50, 100, 25, AttackKat.klugheit),
	Psychokinese(AttackType.psycho, AttackKlasse.spezial, 90, 100, 10, AttackKat.klugheit),
	Hypnose(AttackType.psycho, AttackKlasse.status, 0, 60, 20, AttackKat.klugheit),
	Meditation(AttackType.psycho, AttackKlasse.status, 0, 0, 40, AttackKat.sch�nheit),
	Agilit�t(AttackType.psycho, AttackKlasse.status, 0, 0, 30, AttackKat.coolness),
	Ruckzuckhieb(AttackType.normal, AttackKlasse.physisch, 40, 100, 30, AttackKat.coolness),
	Raserei(AttackType.normal, AttackKlasse.physisch, 20, 100, 20, AttackKat.st�rke),
	Teleport(AttackType.psycho, AttackKlasse.status, 0, 0, 20, AttackKat.coolness),
	Nachtnebel(AttackType.geist, AttackKlasse.spezial, 150, 100, 15, AttackKat.klugheit),
	Mimikry(AttackType.normal, AttackKlasse.status, 0, 0, 10, AttackKat.putzigkeit),
	Kreideschrei(AttackType.normal, AttackKlasse.status, 0, 85, 40, AttackKat.klugheit),
	Doppelteam(AttackType.normal, AttackKlasse.status, 0, 0, 15, AttackKat.coolness),
	Genesung(AttackType.normal, AttackKlasse.status, 0, 0, 10, AttackKat.klugheit),
	H�rtner(AttackType.normal, AttackKlasse.status, 0, 0, 30, AttackKat.st�rke),
	Komprimator(AttackType.normal, AttackKlasse.status, 0, 0, 10, AttackKat.putzigkeit),
	Rauchwolke(AttackType.normal, AttackKlasse.status, 0, 100, 20, AttackKat.klugheit),
	Konfustrahl(AttackType.geist, AttackKlasse.status, 0, 100, 10, AttackKat.klugheit),
	Panzerschutz(AttackType.wasser, AttackKlasse.status, 0, 0, 40, AttackKat.putzigkeit),
	Einigler(AttackType.normal, AttackKlasse.status, 0, 0, 40, AttackKat.putzigkeit),
	Barriere(AttackType.psycho, AttackKlasse.status, 0, 0, 20, AttackKat.coolness),
	Lichtschild(AttackType.psycho, AttackKlasse.status, 0, 0, 30, AttackKat.sch�nheit),
	Dunkelnebel(AttackType.eis, AttackKlasse.status, 0, 0, 30, AttackKat.sch�nheit),
	Reflektor(AttackType.psycho, AttackKlasse.status, 0, 0, 20, AttackKat.klugheit),
	Energiefokus(AttackType.normal, AttackKlasse.status, 0, 0, 30, AttackKat.coolness),
	Geduld(AttackType.normal, AttackKlasse.physisch, 0, 100, 10, AttackKat.st�rke),
	Metronom(AttackType.normal, AttackKlasse.status, 0, 0, 10, AttackKat.putzigkeit),
	Spiegeltrick(AttackType.flug, AttackKlasse.status, 0, 0, 20, AttackKat.klugheit),
	Finale(AttackType.normal, AttackKlasse.physisch, 200, 100, 5, AttackKat.sch�nheit),
	Eierbombe(AttackType.normal, AttackKlasse.physisch, 100, 75, 10, AttackKat.putzigkeit),
	Schlecker(AttackType.geist, AttackKlasse.physisch, 30, 100, 30, AttackKat.putzigkeit),
	Smog(AttackType.gift, AttackKlasse.spezial, 30, 70, 20, AttackKat.st�rke),
	Schlammbad(AttackType.gift, AttackKlasse.spezial, 65, 100, 20, AttackKat.st�rke),
	Knochenkeule(AttackType.boden, AttackKlasse.physisch, 65, 85, 20, AttackKat.st�rke),
	Feuersturm(AttackType.feuer, AttackKlasse.spezial, 110, 85, 5, AttackKat.sch�nheit),
	Kaskade(AttackType.wasser, AttackKlasse.physisch, 80, 100, 15, AttackKat.st�rke),
	Schnapper(AttackType.wasser, AttackKlasse.physisch, 35, 85, 15, AttackKat.st�rke),
	Sternschauer(AttackType.normal, AttackKlasse.spezial, 60, 0, 20, AttackKat.coolness),
	Sch�delwumme(AttackType.normal, AttackKlasse.physisch, 130, 100, 10, AttackKat.st�rke),
	Dornkanone(AttackType.normal, AttackKlasse.physisch, 20, 100, 15, AttackKat.coolness),
	Umkalmmerung(AttackType.normal, AttackKlasse.physisch, 10, 100, 35, AttackKat.st�rke),
	Amnesie(AttackType.psycho, AttackKlasse.status, 0, 0, 20, AttackKat.putzigkeit),
	Psykraft(AttackType.psycho, AttackKlasse.status, 0, 80, 15, AttackKat.klugheit),
	Weichei(AttackType.normal, AttackKlasse.status, 0, 0, 10, AttackKat.putzigkeit),
	Turmkick(AttackType.kampf, AttackKlasse.physisch, 130, 90, 10, AttackKat.coolness),
	Giftblick(AttackType.normal, AttackKlasse.status, 0, 100, 30, AttackKat.st�rke),
	Traumfresser(AttackType.psycho, AttackKlasse.spezial, 100, 100, 15, AttackKat.klugheit),
	Giftwolke(AttackType.gift, AttackKlasse.status, 0, 90, 40, AttackKat.klugheit),
	Stakkato(AttackType.normal, AttackKlasse.physisch, 15, 85, 20, AttackKat.putzigkeit),
	Blutsauger(AttackType.k�fer, AttackKlasse.physisch, 20, 100, 15, AttackKat.klugheit),
	Todeskuss(AttackType.normal, AttackKlasse.status, 0, 75, 10, AttackKat.sch�nheit),
	Himmelsfeger(AttackType.flug, AttackKlasse.physisch, 140, 90, 5, AttackKat.coolness),
	Wandler(AttackType.normal, AttackKlasse.status, 0, 0, 10, AttackKat.klugheit),
	Blubber(AttackType.wasser, AttackKlasse.spezial, 40, 100, 30, AttackKat.putzigkeit),
	Irrschlag(AttackType.normal, AttackKlasse.physisch, 70, 100, 10, AttackKat.putzigkeit),
	Pilzspore(AttackType.pflanze, AttackKlasse.status, 0, 100, 15, AttackKat.sch�nheit),
	Blitz(AttackType.normal, AttackKlasse.status, 0, 100, 20, AttackKat.sch�nheit),
	Psywelle(AttackType.psycho, AttackKlasse.spezial, 150, 100, 15, AttackKat.klugheit),
	Platscher(AttackType.normal, AttackKlasse.status, 0, 0, 40, AttackKat.putzigkeit),
	S�urepanzer(AttackType.gift, AttackKlasse.status, 0, 0, 20, AttackKat.st�rke),
	Krabbhammer(AttackType.wasser, AttackKlasse.physisch, 100, 90, 10, AttackKat.st�rke),
	Explosion(AttackType.normal, AttackKlasse.physisch, 250, 100, 5, AttackKat.sch�nheit),
	Kratzfurie(AttackType.normal, AttackKlasse.physisch, 18, 80, 15, AttackKat.st�rke),
	Knochmmerang(AttackType.boden, AttackKlasse.physisch, 50, 90, 10, AttackKat.st�rke),
	Erholung(AttackType.psycho, AttackKlasse.status, 0, 100, 10, AttackKat.putzigkeit),
	Steinhagel(AttackType.stein, AttackKlasse.physisch, 75, 90, 10, AttackKat.st�rke),
	Hyperzahn(AttackType.normal, AttackKlasse.physisch, 80, 90, 15, AttackKat.coolness),
	Sch�rfer(AttackType.normal, AttackKlasse.status, 0, 100, 30, AttackKat.putzigkeit),
	Triplette(AttackType.normal, AttackKlasse.spezial, 80, 100, 10, AttackKat.sch�nheit),
	Superzahn(AttackType.normal, AttackKlasse.physisch, 80, 90, 10, AttackKat.st�rke),
	Schlitzer(AttackType.normal, AttackKlasse.physisch, 70, 100, 20, AttackKat.coolness),
	Delegator(AttackType.normal, AttackKlasse.status, 0, 100, 10, AttackKat.putzigkeit),
	Verzweifler(AttackType.normal, AttackKlasse.physisch, 50, 80, 1, AttackKat.st�rke);
	
	
	AttackType at;
	AttackKlasse ak;
	int st�rke;
	int genauigkeit;
	int AP;
	AttackKat AKa;
	
	AttackEnum(AttackType at, AttackKlasse ak, int st�rke,int genauigkeit ,int AP, AttackKat AKa){
		this.at = at;
		this.ak = ak;
		this.st�rke = st�rke;
		this.genauigkeit = genauigkeit;
		this.AP = AP;
		this.AKa = AKa;
	}
	
	public AttackType getAttackType() {
		return at;
	}
	
	public AttackKlasse getAttacklasse() {
		return ak;
	}
	
	public int getSt�rke() {
		return st�rke;
	}
	
	public int getGenauigkeit() {
		return genauigkeit;
	}
	
	public int getAP() {
		return AP;
	}
	
	public AttackKat getAttackKategorie() {
		return AKa;
	}
	
	
	
}
