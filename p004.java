
package euler;

public class p004 {
	public static void main(String[] args){
		int maxPalindrome=0;
		for(int a=999;a>0;a--){
			for(int b=a;b>0;b--){
				int c=a*b;
				if(c>maxPalindrome&&isPalindrome(c)){
					maxPalindrome=c;
				}
			}	
		}
		System.out.println(maxPalindrome);
	}
	
	public static boolean isPalindrome(int x){
		String num = Integer.toString(x);
		if(num.length()%2==1){
			return false;
		}
		for(int i=0;i<num.length()/2;i++){
			if(num.charAt(i)!=num.charAt(num.length()-i-1)){
				return false;
			}
		}
		return true;
	}
}