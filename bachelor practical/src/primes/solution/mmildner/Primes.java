package primes.solution.mmildner;

import java.util.ArrayList;

public class Primes
{
	public static boolean isPrime(int number)
	{
		if (number <= 1)	// 1 ist keine Primzahl
		{
			return false;
		}
		
		for (int i = 2; i <= number / 2; ++i)
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> getPrimes(int start, int end)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = start; i < end; i++)
		{
			if (isPrime(i))
			{
				list.add(i);
			}
		}
		
		return list;
	}
}