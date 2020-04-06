package monstersfactory;

import monsters.*;

public abstract class MonsterFactory {

	public static Criature getMonster(Monster tipo) {
		switch (tipo) {
		case Ghouls:
			return new Ghouls("Ghouls / Necrófago", 5, 7, 3, "Cemitério");
		case Djinn:
			return new Djinn("Djin / Gênio", 8, 9, 10, "Não possui um terreno.");
		case Silvano:
			return new Silvano("Silvano / Humanóide com Chifres", 5, 7, 3, "Fazendas");
		case Kikimora:
			return new Kikimora("Kikimora / Insectoide", 7, 8, 3, "Pântano");
		case Dopplers:
			return new Dopplers("Dopplers / Relictos ou Metamorfos", 5, 7, 6, "Não possui terreno.");
		}
		
		return null;
	}

}
