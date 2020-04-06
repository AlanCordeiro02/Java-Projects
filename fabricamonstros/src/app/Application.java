package app;

import java.util.Random;

import monsters.Criature;
import monstersfactory.Monster;
import monstersfactory.MonsterFactory;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		List<Monster> enums = new ArrayList<Monster>();
		enums.add(Monster.Djinn);
		enums.add(Monster.Dopplers);
		enums.add(Monster.Ghouls);
		enums.add(Monster.Kikimora);
		enums.add(Monster.Silvano);
		
		for(int i = 0; i < 25; i++) {

			Monster monsterType = enums.get(random.nextInt(5));
			
			Criature aletoryCriature = MonsterFactory.getMonster(monsterType);
			
			System.out.println(aletoryCriature.infoMonster());
		}
		
	}

}
