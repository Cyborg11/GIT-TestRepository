package primes.solution.ssteuer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import primes.origin.*;

public class PrimesTestClass 
{
	static int getInt()
	{
		int i = 0;
		BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			i = Integer.parseInt (eingabe.readLine());
		}

		catch (Exception e)
		{
			System.out.println("Fehler bei der Eingabe");
		}
		return i;
	}
		
	public static void main (String [] args)
	{
		int eingabe;
		int primeingabe;
		
		do
		{
			System.out.println("Was wollen Sie tun");
			System.out.println("1. Primzahl prüfen");
			System.out.println("2. Beenden");
			System.out.println("Bitte Zahl eingeben");
			eingabe = getInt();
			
			switch (eingabe)
			{
				case 1:
					System.out.println("Zahl zum pruefen eingeben");
					primeingabe = getInt();
					if (primes.origin.Primes.isPrime(primeingabe))
					{
						System.out.println(primeingabe + " ist eine Primzahl\n");
					}
					else
					{
						System.out.println(primeingabe + " ist keine Primzahl\n");
					}
					break;
				
				case 2:
					System.out.println("Programm beendet");
					break;
					
				default:
					System.out.println("Fehler bitte neu eingeben\n");
			}
			
		}
		while (eingabe != 2);
	
	}

}
