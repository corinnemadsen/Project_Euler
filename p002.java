package euler;

public class p002 {
	public static void main(String[] args){
		int sum =0;
		int f1=1;
		int f2=2;
		int f3=3;
		
		while(f2<4000000){
			f1=f2;
			f2=f3;
			f3=f1+f2;
			if(f1%2==0){
				sum+=f1;
			}
		}
		System.out.println(sum);
	}

}