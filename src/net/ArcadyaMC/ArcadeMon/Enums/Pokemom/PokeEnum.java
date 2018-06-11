package net.ArcadyaMC.ArcadeMon.Enums.Pokemom;

import java.util.Random;

import org.bukkit.Material;

public enum PokeEnum {
	
	p1(1, "Bisasam", "Bulbasaur", PokeType.pflanze, PokeType.gift, Material.APPLE, 0,10,12,11,10),
	p2(2, "Bisaknosp", "Ivysaur",PokeType.pflanze, PokeType.gift, Material.STONE_SWORD, 0,19,21,20,19),
	p3(3, "Bisaflor", "Venusaur",PokeType.pflanze, PokeType.gift, Material.ARROW, 0, 28,30,29,28),
	p4(4, "Glumanda", "Charmander", PokeType.feuer, PokeType.leer, Material.COOKED_BEEF, 0,11,10,12,10),
	p5(5, "Glutexo", "Charmeleon",PokeType.feuer, PokeType.leer, Material.RAW_BEEF, 0,20,20,21,19),
	p6(6, "Glurak", "Charizard",PokeType.feuer, PokeType.flug, Material.WOOD_HOE, 0,29,29,30,28),
	p7(7, "Schiggy", "Squirtle",PokeType.wasser, PokeType.leer, Material.WOOD_SWORD, 0,9,13,12,10),
	p8(8, "Schillok", "Wartortle",PokeType.wasser, PokeType.leer, Material.BONE, 0,18,22,21,19),
	p9(9, "Turtok", "Blastoise",PokeType.wasser, PokeType.leer, Material.WOOD_PICKAXE, 0,27,31,30,28),
	p10(10, "Raupy", "Caterpie", PokeType.käfer, PokeType.leer, Material.BOOK, 0,7,8,9,8),
	p11(11,"Safcon", "Metapod",PokeType.käfer, PokeType.leer, Material.BOOK_AND_QUILL, 0,16,17,18,17),
	p12(12,"Smettbo", "Butterfree",PokeType.käfer, PokeType.flug, Material.WRITTEN_BOOK, 0,25,24,25,24),
	p13(13,"Hornliu", "Weedle",PokeType.pflanze, PokeType.gift, Material.BOWL, 0,9,7,8,9),
	p14(14,"Kokuna", "Kakuna",PokeType.pflanze, PokeType.gift, 	Material.BREAD, 0,18,16,17,18),
	p15(15,"Bibor", "Beedrill" ,PokeType.pflanze, PokeType.gift, Material.BREWING_STAND_ITEM, 0,27,25,26,27),
	p16(16,"Taubsi", "Pidgey",PokeType.normal, PokeType.flug, Material.CLAY_BRICK, 0,9,10,14,7),
	p17(17,"Tauboga", "Pidgeotto",PokeType.normal, PokeType.flug,Material.BUCKET, 0,18,19,23,16),
	p18(18,"Tauboss", "Pidgeot",PokeType.normal, PokeType.flug,Material.WOOD_SWORD, 0,27,28,32,25),
	p19(19,"Rattfratz", "Rattata",PokeType.normal, PokeType.leer, Material.MILK_BUCKET, 0,10,8,10,11),
	p20(20,"Rattikarl", "Raticate",PokeType.normal, PokeType.leer, Material.WATER_BUCKET, 0,25,23,25,26),
	p21(21,"Habitak", "Spearow",PokeType.normal, PokeType.flug, Material.CAKE, 0,10,10,13,9),
	p22(22,"Ibitak", "Fearow",PokeType.normal, PokeType.flug, Material.CARROT_ITEM, 0,25,25,28,24),
	p23(23,"Rettan", "Ekans",PokeType.gift, PokeType.leer, Material.WOOD_AXE, 0,10,9,12,10),
	p24(24,"Arbok", "Arbok",PokeType.gift, PokeType.leer, Material.CARROT_STICK, 0,25,24,27,25),
	p25(25,"Pikachu", "Pikachu",PokeType.elektro, PokeType.leer, Material.CAULDRON_ITEM, 0,9,10,13,13),
	p26(26,"Raichu", "Raichu",PokeType.elektro, PokeType.leer,Material.CHAINMAIL_BOOTS, 0,24,25,28,28),
	p27(27,"Sandan", "Sandshrew",PokeType.boden, PokeType.leer,Material.CHAINMAIL_CHESTPLATE, 0,9,11,8,10),
	p28(28,"Sandamer", "Sandslash",PokeType.boden, PokeType.leer,Material.CHAINMAIL_HELMET, 0,24,26,23,25),
	p29(29,"NidoranW", "NidoranW",PokeType.gift, PokeType.leer,Material.CHAINMAIL_LEGGINGS, 0,11,10,12,10),
	p30(30,"Nidorina", "Nidorina",PokeType.gift, PokeType.leer, Material.COAL, 1,20,19,21,19),
	p31(31,"Nidoqueen", "Nidoqueen",PokeType.gift, PokeType.boden, Material.COOKED_CHICKEN, 0,26,28,30,28),
	p32(32,"NidoranM", "NidoranM",PokeType.gift, PokeType.leer, Material.RAW_CHICKEN, 0,11,10,12,10),
	p33(33,"Nidorino", "Nidorino",PokeType.gift, PokeType.leer, Material.CLAY_BALL, 0,20,19,21,19),
	p34(34,"Nidoking", "Nidoking",PokeType.gift, PokeType.boden, Material.WOOD_SPADE, 0,26,28,30,28),
	p35(35,"Piepi", "Clefairy", PokeType.fee, PokeType.leer,Material.COAL, 0,10,12,11,13),
	p36(36,"Pixi", "Clefable", PokeType.fee, PokeType.leer,	Material.REDSTONE_COMPARATOR, 0,25,27,26,28),
	p37(37,"Vulpix", "Vulpix", PokeType.feuer, PokeType.leer,Material.COMPASS, 0,9,11,14,12),
	p38(38,"Vulnona", "Ninetales", PokeType.feuer, PokeType.leer,Material.COOKIE, 0,24,26,29,27),
	p39(39,"Pummeluff", "Jigglypuff", PokeType.normal, PokeType.fee, Material.DIAMOND, 0,10,12,11,13),
	p40(40,"Knuddeluff", "Wigglytuff",PokeType.normal, PokeType.fee,Material.DIAMOND_AXE, 0,25,27,26,27),
	p41(41, "Zubat", "Zubat",PokeType.gift, PokeType.flug,Material.DIAMOND_BOOTS, 0,10,9,12,11),
	p42(42,"Golbat", "Golbat",PokeType.gift, PokeType.flug,Material.DIAMOND_CHESTPLATE, 0,25,24,27,26),
	p43(43,"Myrapla", "Oddish",PokeType.pflanze, PokeType.gift,Material.DIAMOND_HELMET, 0,10,9,11,13),
	p44(44,"Duflor", "Gloom",PokeType.pflanze, PokeType.gift,Material.DIAMOND_HOE, 0,19,18,20,22),
	p45(45,"Giflor", "Vileplume",PokeType.pflanze, PokeType.gift,Material.DIAMOND_BARDING, 0,27,26,29,31),
	p46(46,"Paras", "Paras",PokeType.käfer, PokeType.pflanze,Material.DIAMOND_LEGGINGS, 0,10,12,9,10),
	p47(47,"Parasek", "Parasect",PokeType.käfer, PokeType.pflanze,Material.DIAMOND_PICKAXE, 0,25,27,28,25),
	p48(48,"Bluzuk", "Venonat",PokeType.käfer, PokeType.gift,Material.DIAMOND_SPADE, 0,10,11,12,12),
	p49(49,"Omot", "Venomoth",PokeType.käfer, PokeType.gift,Material.DIAMOND_SWORD, 0,25,26,27,27),
	p50(50,"Digda", "Diglett",PokeType.boden, PokeType.leer,Material.INK_SACK, 13,11,10,12,10),
	p51(51,"Digdri", "Dugtrio",PokeType.boden, PokeType.leer,Material.INK_SACK, 14,26,25,27,25),
	p52(52,"Mauzi", "Meowth",PokeType.normal, PokeType.leer,Material.RECORD_4, 0,11,10,11,10),
	p53(53,"Snobilikat", "Persian",PokeType.normal, PokeType.leer,Material.INK_SACK, 9,26,25,26,25),
	p54(54,"Enton", "Psyduck",PokeType.wasser, PokeType.leer,Material.INK_SACK, 12,10,11,9,12),
	p55(55,"Entoron", "Golduck",PokeType.wasser, PokeType.leer,Material.INK_SACK, 10,25,26,24,27),
	p56(56,"Menki", "Mankey",PokeType.kampf, PokeType.leer,Material.RECORD_7, 0,13,10,11,10),
	p57(57,"Rasaff", "Primeape",PokeType.kampf, PokeType.leer,Material.INK_SACK, 11,28,25,26,25),
	p58(58,"Fukano", "Growlithe",PokeType.feuer, PokeType.leer,Material.INK_SACK, 4,10,10,10,13),
	p59(59,"Arkani", "Arcanine",PokeType.feuer, PokeType.leer,Material.INK_SACK, 6,25,25,25,28),
	p60(60,"Quapsel", "Poliwag",PokeType.wasser, PokeType.leer,Material.INK_SACK, 8,10,11,10,12),
	p61(61,"Quaputzi", "Poliwhirl",PokeType.wasser, PokeType.leer,Material.INK_SACK, 5,19,20,19,21),
	p62(62,"Quappo", "Poliwrath",PokeType.wasser, PokeType.kampf,Material.INK_SACK, 1,28,29,28,30),
	p63(63,"Abra", "Abra",PokeType.psycho, PokeType.leer,Material.INK_SACK, 2,9,10,9,13),
	p64(64,"Kadabra", "Kadabra",PokeType.psycho, PokeType.leer,Material.EGG, 0,18,19,18,22),
	p65(65,"Simsala", "Alakazam",PokeType.psycho, PokeType.leer,Material.WOOD_PICKAXE, 0,27,28,27,31),
	p66(66,"Machollo", "Machop",PokeType.kampf, PokeType.leer,Material.EYE_OF_ENDER, 0,12,10,11,10),
	p67(67,"Maschock", "Machoke",PokeType.kampf, PokeType.leer,Material.ENDER_PEARL, 0,21,19,20,19),
	p68(68,"Machomei", "Machamp",PokeType.kampf, PokeType.leer,	Material.EXP_BOTTLE, 0,30,28,29,28),
	p69(69,"Knofensa", "Bellsprout",PokeType.pflanze, PokeType.gift,Material.FEATHER, 0,10,11,10,12),
	p70(70,"Ultrigaria", "Weepinbell",PokeType.pflanze, PokeType.gift,Material.FIREBALL, 0,19,20,19,21),
	p71(71,"Sarzenia", "Victreebel",PokeType.pflanze, PokeType.gift,Material.FIREWORK, 0,28,29,28,30),
	p72(72,"Tentacha", "Tentacool",PokeType.wasser, PokeType.gift,Material.FIREWORK_CHARGE, 0,9,10,11,12),
	p73(73,"Tentoxa", "Tentacruel",PokeType.wasser, PokeType.gift, Material.RECORD_3, 0,24,25,26,27),
	p74(74,"Kleinstein", "Geodude",PokeType.stein, PokeType.boden,Material.RAW_FISH,2,12,10,12,10),
	p75(75,"Georok", "Graveler",PokeType.stein, PokeType.boden,Material.COOKED_FISH, 0,21,19,21,19),
	p76(76,"Geowaz", "Golem",PokeType.stein, PokeType.boden, Material.RAW_FISH,0,30,28,30,28),
	p77(77,"Ponita", "Ponyta",PokeType.feuer, PokeType.leer,Material.RAW_FISH, 3,10,11,12,12),
	p78(78,"Gallopa", "Rapidash",PokeType.feuer, PokeType.leer,Material.COOKED_FISH,1,25,26,27,27),
	p79(79,"Flegmon", "Slowpoke",PokeType.wasser, PokeType.psycho, Material.RECORD_5, 0,10,10,11,13),
	p80(80,"Lahmus", "Slowbro",PokeType.wasser, PokeType.psycho,Material.RECORD_6, 0,25,25,26,28),
	p81(81,"Magnetilo", "Magnemite",PokeType.elektro, PokeType.leer,Material.FLINT, 0,10,10,11,13),
	p82(82,"Magneton", "Magneton",PokeType.elektro, PokeType.leer, Material.FLINT_AND_STEEL, 0,25,25,26,28),
	p83(83,"Porenta", "Farfetchd",PokeType.normal, PokeType.flug, Material.FLOWER_POT_ITEM, 0,24,25,26,24),
	p84(84,"Dodu", "Dodu",PokeType.normal, PokeType.flug,Material.GHAST_TEAR,0,12,10,13,10),
	p85(85,"Dodri", "Dodrio",PokeType.normal, PokeType.flug,Material.GLOWSTONE_DUST,0,27,25,28,25),
	p86(86,"Jurob", "Seel",PokeType.wasser, PokeType.leer,Material.GOLD_AXE,0, 11,10,10,13),
	p87(87,"Jugong", "Dewgong",PokeType.wasser, PokeType.eis,Material.GOLD_BOOTS,0,26,25,26,28),
	p88(88,"Sleima", "Grimer",PokeType.gift, PokeType.leer,Material.GOLD_CHESTPLATE,0,10,10,11,12),
	p89(89,"Sleimok", "Muk",PokeType.gift, PokeType.leer,Material.GOLD_HELMET,0,25,25,26,27),
	p90(90,"Muschas", "Shellder",PokeType.wasser, PokeType.leer,Material.GOLD_HOE,0,10,11,11,12),
	p91(91,"Austos", "Cloyster",PokeType.wasser, PokeType.eis,Material.GOLD_BARDING,0,25,26,26,27),
	p92(92,"Nebulak", "Gastly",PokeType.geist, PokeType.gift,Material.GOLD_INGOT,0,9,10,11,12),
	p93(93,"Alpollo", "Haunter",PokeType.geist, PokeType.gift,Material.GOLD_LEGGINGS,0,18,19,20,21),
	p94(94,"Gengar", "Ectoplasma",PokeType.geist, PokeType.gift,Material.GOLD_NUGGET,0,27,28,29,30),
	p95(95,"Onix", "Onix",PokeType.stein, PokeType.boden,Material.GOLD_PICKAXE,0,20,24,21,20),
	p96(96,"Traumato", "Drowzee",PokeType.psycho, PokeType.leer,Material.GOLD_SPADE,0,11,12,10,13),
	p97(97,"Hypno", "Hypno", PokeType.psycho, PokeType.leer,Material.GOLD_SWORD,0,26,27,25,28),
	p98(98,"Krabby", "Krabby",PokeType.wasser, PokeType.leer,Material.SULPHUR,0,9,13,11,11),
	p99(99,"Kingler", "Kingler",PokeType.wasser, PokeType.leer,	Material.HOPPER,0,24,28,26,26),
	p100(100,"Voltobal", "Voltorbe",PokeType.elektro, PokeType.leer,Material.IRON_AXE,0,10,12,11,13),
	p101(101,"Lektrobal", "Electrode",PokeType.elektro, PokeType.leer,Material.IRON_BOOTS,0,25,27,26,28),
	p102(102,"Owei", "Exeggcute",PokeType.pflanze, PokeType.psycho,Material.IRON_CHESTPLATE,0,11,10,11,13),
	p103(103,"Kokowei", "Exeggutor",PokeType.pflanze, PokeType.psycho,Material.IRON_HELMET,0,26,25,26,28),
	p104(104,"Tragosso", "Cubone",PokeType.boden, PokeType.leer,Material.IRON_HOE,0,12,10,11,10),
	p105(105,"Knogga", "Marowak",PokeType.boden, PokeType.leer,Material.IRON_BARDING,0,27,25,26,25),
	p106(106,"Kicklee", "Hitmonlee",PokeType.kampf, PokeType.leer,Material.IRON_INGOT,0,27,25,26,27),
	p107(107,"Nokchan", "Hitmonchan",PokeType.kampf, PokeType.leer,Material.IRON_LEGGINGS,0,25,27,26,28),
	p108(108,"Schlurp", "Lickitung",PokeType.normal, PokeType.leer,Material.IRON_PICKAXE,0,22,26,28,26),
	p109(109,"Smogon", "Knoffing",PokeType.gift, PokeType.leer,Material.IRON_SPADE,0,10,11,12,13),
	p110(110,"Smogmog", "Weezing",PokeType.gift, PokeType.leer,Material.IRON_SWORD,0,25,26,27,28),
	p111(111,"Rihorn", "Rhyhorn",PokeType.boden, PokeType.stein,Material.ITEM_FRAME,0,13,12,13,14),
	p112(112,"Rizeros", "Rhydon",PokeType.boden, PokeType.stein,Material.LEASH,0,28,27,28,29),
	p113(113,"Chaneira", "Chansey",PokeType.normal, PokeType.leer,Material.LEATHER,0,23,31,27,21),
	p114(114,"Tangela", "Tangela",PokeType.pflanze, PokeType.leer,Material.LEATHER_BOOTS,0,24,25,24,27),
	p115(115,"Kangama", "Kangaskhan",PokeType.normal, PokeType.leer,Material.LEATHER_HELMET,0,27,26,28,27),
	p116(116,"Seeper", "Horsea",PokeType.wasser, PokeType.leer,Material.LEATHER_CHESTPLATE,0,10,11,11,12),
	p117(117,"Seemon", "Seadra",PokeType.wasser, PokeType.leer,Material.LEATHER_LEGGINGS,0,25,26,26,27),
	p118(118,"Goldini", "Goldeen",PokeType.wasser, PokeType.leer,Material.MAGMA_CREAM,0,10,11,11,12),
	p119(119,"Golking", "Seaking",PokeType.wasser, PokeType.leer,Material.MELON,0,25,26,26,27),
	p120(120,"Sterndu", "Staryu",PokeType.wasser, PokeType.leer,Material.SPECKLED_MELON,0,11,12,10,11),
	p121(121,"Starmie", "Starmie",PokeType.wasser, PokeType.psycho,Material.MUSHROOM_SOUP,0,26,27,25,26),
	p122(122, "Pantimos", "MrMime", PokeType.psycho, PokeType.fee,Material.COOKED_MUTTON,0,27,25,27,30),
	p123(123, "Sichlor", "Scyther", PokeType.käfer, PokeType.flug,Material.NAME_TAG,0,26,26,28,27),
	p124(124, "Rossana", "Jynx", PokeType.eis, PokeType.psycho,Material.NETHER_STAR,0,21,27,30,30),
	p125(125, "Elektek", "Electabuzz", PokeType.elektro, PokeType.normal,Material.RECORD_8,0,24,24,27,30),
	p126(126, "Magmar", "Magmar", PokeType.feuer, PokeType.leer,Material.NETHER_BRICK_ITEM,0,26,25,24,31),
	p127(127, "Pinsir", "Pinsir", PokeType.käfer, PokeType.leer,Material.PAINTING,0, 28,26,24,23),
	p128(128, "Tauros", "Tauros", PokeType.normal, PokeType.leer,Material.PAPER,0,29,25,25,24),
	p129(129, "Karpador", "Magikarp", PokeType.wasser, PokeType.leer,Material.GRILLED_PORK,0,12,11,11,12),
	p130(130, "Garados", "Gyarados", PokeType.wasser, PokeType.flug,Material.PORK,0,27,26,26,27),
	p131(131, "Lapras", "Lapras", PokeType.wasser, PokeType.eis, Material.POTATO_ITEM,0, 27,25,24,26),
	p132(132, "Ditto", "Ditto", PokeType.normal, PokeType.leer,Material.BAKED_POTATO,0, 24,23,24,27),
	p133(133, "Evoli", "Eevee", PokeType.normal, PokeType.leer,	Material.POISONOUS_POTATO,0, 11,12,14,13),
	p134(134, "Aquana", "Vaporeon", PokeType.wasser, PokeType.leer,Material.PRISMARINE_CRYSTALS,0,26,27,29,28),
	p135(135, "Blitza", "Jolteon", PokeType.elektro, PokeType.leer,Material.PRISMARINE_SHARD,0, 26,27,29,28),
	p136(136, "Flamara", "Flareon", PokeType.feuer, PokeType.leer,Material.QUARTZ,0, 26,27,29,28),
	p137(137, "Porygon", "Porygon", PokeType.normal, PokeType.leer,Material.SUGAR,0,24,26,27,26),
	p138(138, "Amonitas", "Omanyte", PokeType.stein, PokeType.wasser,Material.COOKED_RABBIT,0,13,14,12,11),
	p139(139, "Amoroso", "Omastar", PokeType.stein, PokeType.wasser,Material.RABBIT_FOOT,0,28,29,27,26),
	p140(140, "Kabuto", "Kabuto", PokeType.stein, PokeType.wasser,Material.RABBIT_HIDE,0,13,14,12,11),
	p141(141, "Kabutops", "Kabutops", PokeType.stein, PokeType.wasser,Material.RABBIT,0,28,29,27,26),
	p142(142, "Aerodactyl", "Aerodactyl",PokeType.stein, PokeType.flug,Material.RABBIT_STEW,0,27,30,27,26),
	p143(143, "Relaxo", "Snorlax", PokeType.normal, PokeType.leer,Material.RECORD_11,0,26,27,28,28),
	p144(144, "Arktos", "Articuno", PokeType.eis, PokeType.flug,Material.RECORD_12,0,31,32,31,34),
	p145(145, "Zapdos", "Zapdos", PokeType.elektro, PokeType.flug,Material.SEEDS,0,31,32,31,34),
	p146(146, "Lavados", "Moltres", PokeType.feuer, PokeType.flug,Material.EMERALD,0,31,32,31,34),
	p147(147, "Dratini", "Dratini", PokeType.drache, PokeType.leer,Material.SADDLE,0,12,14,11,13),
	p148(148, "Dragonir", "Dragonair", PokeType.drache, PokeType.leer,Material.SHEARS,0,21,23,20,22),
	p149(149, "Dragoran", "Dragonite", PokeType.drache, PokeType.flug,Material.SNOW_BALL,0,30,32,29,31),
	p150(150, "Mewtu", "Mewtwo", PokeType.psycho, PokeType.leer,Material.STICK,0,35,30,31,37),
	p151(151, "Mew", "Mew", PokeType.psycho, PokeType.leer,Material.STONE_AXE,0,35,32,30,36);

	
	int id;
	String de;
	String eng;
	PokeType type1;
	PokeType type2;
	Material m;
	int mSub;
	int angr;
	int ver;
	int init;
	int spez;
	
	PokeEnum(int id, String de, String eng, PokeType type1, PokeType type2, Material m, int mSub, int angr, int ver, int init, int spez){
		this.de = de;
		this.eng = eng;
		this.type1 = type1;
		this.type2 = type2;
		this.id = id;
		this.m = m;
		this.mSub = mSub;
		this.angr = angr;
		this.ver = ver;
		this.init = init;
		this.spez = spez;
		
	}
	public int getVer() {
		int ag = ver;
		int randomAg = new Random().nextInt(10);

		if(randomAg == 2) {
			ag++;
		}
		if(randomAg >= 8) {
			ag= ag + 2;
		}
	
		return ag;
	}
	public int getinitr() {
		int ag = init;
		int randomAg = new Random().nextInt(10);

		if(randomAg == 2) {
			ag++;
		}
		if(randomAg >= 8) {
			ag= ag + 2;
		}
	
		return ag;
	}
	public int getSpez() {
		int ag = spez;
		int randomAg = new Random().nextInt(10);

		if(randomAg == 2) {
			ag++;
		}
		if(randomAg >= 8) {
			ag= ag + 2;
		}
	
		return ag;
	}
	public int getAngr() {
		int ag = angr;
		int randomAg = new Random().nextInt(10);

		if(randomAg <= 2) {
			ag++;
		}
		if(randomAg >= 8) {
			ag= ag + 2;
		}
	
		return ag;
	}
	
	public int getSub() {
		return mSub;
	}
	
	public Material getMatterial() {
		return m;
	}
	public PokeType getTyp1() {
		return type1;
	}
	public PokeType getTyp2() {
		return type2;
	}
	public String getDE() {
		return de;
	}
	public String getEng() {
		return eng;
	}
	public Integer getID() {
		return id;
	}
}
