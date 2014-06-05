package euler_solved;

public class p017 {
	public static void main(String[] args){
		String[] ones ={"","one","two","three","four","five","six","seven","eight","nine"};
		String[] tens={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String[] excep={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String t = "thousand";
		String h ="hundred";
		String a = "and";
		
		int totalLetters=0;
		for(int i=0;i<=1000;i++){
			int curr=i;
			int currLetters=0;
			if(curr==1000){
				currLetters+=ones[1].length()+t.length();
				curr=0;
			}
			if(curr>=100){
				currLetters+=ones[curr/100].length()+h.length();
				curr=curr%100;
				if(curr>0){
					currLetters+=a.length();
				}
			}
			if(curr>=20){
				currLetters+=tens[curr/10].length();
				curr=curr%10;
			}
			if(curr>=10){
				currLetters+=excep[curr%10].length();
				curr=0;
			}
			if(curr>0){
				currLetters+=ones[curr].length();
			}
			totalLetters+=currLetters;
		}
	System.out.println(totalLetters);	
	}
}

