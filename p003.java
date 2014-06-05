package euler;

import java.math.BigInteger;

public class p003 {
	public static void main(String[] args){
		BigInteger num= new BigInteger("600851475143");
		int maxPrimeFactor=0;
		
		//I know that all prime factors of num must be odd since its last digit is not even so I'm jumping by 2.
		//Additionally, every prime factor of num must be less than 1000000 since its square is 1 trillion and num is only about 600 billion.
		for(int i=3;i<1000000;i+=2){
			if(isPrime(i)){
				if(num.mod(new BigInteger(Integer.toString(i)))==BigInteger.ZERO){
					maxPrimeFactor=i;
				}
			}
		}
		
		
		System.out.println(maxPrimeFactor);
	}
	
	public static boolean isPrime(int x){
		//Only odd factors need to be tested since I'm only checking odd numbers as factors of num.
		for(int j=3;j<=Math.sqrt(x);j++){
			if(x%j==0){
				return false;
			}
		}
		return true;
	}

}

