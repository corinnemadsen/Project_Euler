package euler_solved;

import java.io.*;
import java.util.*;

public class p042 {
	public static int[] triangularNums = new int[100];
	public static void main(String[] args){
		for(int i=0;i<50;i++){
			triangularNums[i]=(i+1)*(i+2)/2;
		}
		File f = new File("words.txt");
		int totalTriangular=0;
		try{
			Scanner sc=new Scanner(f);
			String words=sc.next();
			sc.close();
			int currPos=0;
			int currTotal=0;
			while(currPos<words.length()){
				if((int)(words.charAt(currPos))==44){
					currPos++;
				}
				else if((int)(words.charAt(currPos))==34){
					if(currTotal!=0){
						if(isTriangular(currTotal)){
							totalTriangular++;
						}
						currTotal=0;
					}
					currPos++;
				}
				else{
					currTotal+=(int)(words.charAt(currPos))-64;
					currPos++;
				}
			}
		}
		catch(FileNotFoundException e){
			System.out.println("words.txt was not found.");
		}
		System.out.println(totalTriangular);
	}
	
	public static boolean isTriangular(int x){
		int i=0;
		while(x>=triangularNums[i]){
			if(x==triangularNums[i]){
				return true;
			}
			i++;
		}
		return false;
	}
}

