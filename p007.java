package euler;


public class p007 {
	public static void main(String[] args){
		//It's easiest to start with an odd prime, so I'm starting with the second prime number, 3.
		int pCount=2;
		int currPrime=3;
		
		while(pCount<10001){
			int jump=2;
			while(!isPrime(currPrime+jump)){
				jump+=2;
			}
			currPrime+=jump;
			pCount++;
		}
		
		
		System.out.println(currPrime);
	}
	
	public static boolean isPrime(int x){
		//Only odd numbers need to be tested since I've already counted the only even prime.
		for(int j=3;j<=Math.sqrt(x);j+=2){
			if(x%j==0){
				return false;
			}
		}
		return true;
	}

}

