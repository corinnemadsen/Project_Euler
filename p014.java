package euler;

public class p014 {
	//an array to hold already computed chain length values
	public static int[] cLength = new int[1000000];
	
	public static void main(String[] args){
		cLength[0]=1;
		int maxInteger=0;
		int maxChainLength=0;
		for(int i=1; i<1000000; i++){
			int currChainLength=chainLength(i);
			if(currChainLength>maxChainLength){
				maxChainLength=currChainLength;
				maxInteger=i;
			}
		}
		System.out.println(maxInteger);
	}
	
	public static int chainLength(int x){
		long curr=x;
		int count=0;
		while(curr>999999 || cLength[(int) curr-1]==0){
			if(curr%2==0){
				curr=curr/2;
			}
			else{
				curr=3*curr+1;
			}
			count++;
		}
		count+=cLength[(int) curr-1];
		cLength[x-1]=count;
		return count;
	}
}

