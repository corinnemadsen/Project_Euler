package euler;


public class p010 {
	public static void main(String[] args){
		long sum=0;
		for(int i=2;i<2000000;i++){
			if(isPrime(i)){
				sum+=i;
			}
		}
		
		
		System.out.println(sum);
	}
	
	public static boolean isPrime(int x){
		if(x==2){
			return true;
		}
		if(x%2==0){
			return false;
		}
		for(int j=3;j<=Math.sqrt(x);j+=2){
			if(x%j==0){
				return false;
			}
		}
		return true;
	}

}

