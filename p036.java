package euler_solved;

public class p036 {
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<1000000;i++){
			if(isPalindrome(Integer.toString(i))&&isPalindrome(toBinary(i))){
				sum+=i;
			}
		}
		System.out.println(sum);
	}

	public static boolean isPalindrome(String s){
		for(int i=0; i<=s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				return false;
			}
		}
		return true;
	}

	public static String toBinary(int x){
		int curr=x;
		String b = "";
		while(curr>0){
			b=(curr%2)+b;
			curr/=2;
		}
		return b;
	}
}

