package euler_solved;

public class p024 {
	public static void main(String[] args){
		int[] digits ={0,1,2,3,4,5,6,7,8,9};
		int onDigit=0;
		int sDigit=1;
		int total=0;
		while(total<999999){
			if (sDigit>9||total+factorial(9-onDigit)>999999){
				onDigit++;
				sDigit=onDigit+1;
			}
			else{
				total+=factorial(9-onDigit);
				int temp=digits[onDigit];
				digits[onDigit]=digits[sDigit];
				digits[sDigit]=temp;
				sDigit++;
			}
		}
		for(int i=0;i<10;i++){
			System.out.print(digits[i]);
		}
	}

	public static int factorial(int num){
		int curr=num;
		int mult=1;
		while(curr>1){
			mult*=curr;
			curr--;
		}
		return mult;
	}
}

