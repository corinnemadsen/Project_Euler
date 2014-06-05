package euler;

import java.math.BigInteger;

public class p015 {
	public static void main(String[] args){
		//Of the 40 steps taken, 20 must be down so we just need to compute 40 choose 20
		BigInteger Combination=BigInteger.valueOf(1);
		for(int i=21;i<=40;i++){
			Combination=Combination.multiply(BigInteger.valueOf(i));
		}
		for(int i=1;i<=20;i++){
			Combination=Combination.divide(BigInteger.valueOf(i));
		}
		System.out.println(Combination);
	}
}

