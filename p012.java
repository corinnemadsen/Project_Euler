package euler;


public class p012 {
	public static void main(String[] args){
		int n=1;
		int prevDivisors=1;
		int currDivisors=2;
		while(true){
			n++;
			int triangularNum = n*(n+1)/2;
			prevDivisors=currDivisors;
			if((n+1)%2==0){			
				currDivisors=numDivisors((n+1)/2);
			}
			else{
				currDivisors=numDivisors(n+1);
			}
			if(prevDivisors*currDivisors>500){
				System.out.println(triangularNum);
				return;
			}
		}
	}
	public static int numDivisors(int x){
		int count = 0;
		for(int i=1;i<=x/2;i++){
			if(x%i==0){
				count++;
			}
		}
		return count+1;
	}

}

