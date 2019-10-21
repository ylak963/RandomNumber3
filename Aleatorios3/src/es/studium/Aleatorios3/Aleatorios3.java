package es.studium.Aleatorios3;

import java.util.Random;

public class Aleatorios3 {

	public static void main(String[] args)
	{
		{
			Random rnd = new Random();
			int i,x;

			for(i=1; i<10;i++)
			{
				//Saca numeros entre 1 y 6
				x=rnd.nextInt(6)+1;
				System.out.println(x);
			}
		}

	}

}
