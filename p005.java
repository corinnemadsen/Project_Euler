
package euler;

public class p005 {
	public static void main(String[] args){
		int leastMultiple=1;
		for(int i=2;i<=20;i++){	
			leastMultiple=lcm(leastMultiple,i);
		}
		System.out.println(leastMultiple);
	}
	
	public static int lcm(int x,int y){
		int multiple=Math.max(x, y);
		int m=multiple;
		while(m%x!=0 || m%y!=0){
			m+=multiple;
		}
		return m;
	}
}