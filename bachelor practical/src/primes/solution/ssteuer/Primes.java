package primes.solution.ssteuer;

import java.util.List;

public class Primes {
	
	public List<Integer> getPrimes(int start, int end){
		
		return null;
	}
	
	public static boolean isPrime(int number){
		double tmp = Math.sqrt(number);
		
		for (int i = 3; i < tmp; i+=2) {
			if(number % i == 0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int i = 23;
		System.out.println(i + " is " + (Primes.isPrime(i) ? "" : "not ") + "a prime");
	}
}