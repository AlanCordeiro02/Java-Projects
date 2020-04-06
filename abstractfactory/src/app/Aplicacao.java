package app;

import fabricas.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import criature.Criatura;

public class Aplicacao {
	public static void main (String[]args)  {
		
		Random random = new Random();
		
		List<Osenums2> fabrica = new ArrayList<Osenums2>();
		fabrica.add(Osenums2.Construtor);
		fabrica.add(Osenums2.Insectoide);
		fabrica.add(Osenums2.Necrofalos);
		fabrica.add(Osenums2.Relictio);
		
			
		for(int i=1; i<=25; i++) {			
			
			Osenums2 tipofabrica = fabrica.get(random.nextInt(fabrica.size()));
			FabricaMae aleatoryfabrica = FabricaMae.getAleatoryfactory(tipofabrica);
			Criatura criatura = aleatoryfabrica.getRandomCriature();
			System.out.println(i + ". " +criatura.infoMonster());
		}
			
	}
	}

