
package euler;

public class p006 {
	public static void main(String[] args){
		int sum=0;
		int sumSquares=0;
		for(int i=1; i<=100;i++){
			sum+=i;
			sumSquares+=i*i;
		}
		int squareSum=sum*sum;
		int difference=squareSum-sumSquares;
		System.out.println(difference);
	}
	
}