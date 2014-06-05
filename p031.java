package euler_solved;

public class p031 {
	public static short[] change ={200,100,50,20,10,5,2,1};

	public static void main(String[] args){
		System.out.println(recurseChange(200,0));	
	}
	public static int recurseChange(int penceLeft, int coin){
		if(coin==7||penceLeft==0){
			return 1;
		}
		int total=0;
		if(penceLeft>=change[coin]){
			total+=recurseChange(penceLeft-change[coin],coin);
		}
		total+=recurseChange(penceLeft,coin+1);
		return total;
	}
}

