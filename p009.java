package euler;


public class p009 {
	public static void main(String[] args){

		int a=0;
		int b=0;
		int c=0;
		
		for(a=1;a<=998;a++){
			for(b=a;(a+b)<999;b++){
				c=1000-a-b;
				if(a*a+b*b==c*c){
					System.out.println(a*b*c);
					return;
				}
			}
		}
	}
}

