package euler_solved;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p054 {
	public static void main(String[] args){
		File f = new File("poker.txt");
		try {
			Scanner sc = new Scanner(f);
			int p1wins =0;
			while(sc.hasNext()){
				String hands = sc.nextLine();
				String[] p1 = new String[5];
				int[] p1Vals = new int[13];
				int[] p1Suits = new int[4];
				int[] p1Hand = new int[10];
				String[] p2 = new String[5];
				int[] p2Vals = new int[13];
				int[] p2Suits = new int[4];
				int[] p2Hand = new int[10];
				Scanner line = new Scanner(hands);
				for(int i=0;i<5;i++){
					p1[i]=line.next();
					if(p1[i].charAt(0)=='A'){
						p1Vals[12]++;
					}
					else if(p1[i].charAt(0)=='K'){
						p1Vals[11]++;
					}
					else if(p1[i].charAt(0)=='Q'){
						p1Vals[10]++;
					}
					else if(p1[i].charAt(0)=='J'){
						p1Vals[9]++;
					}
					else if(p1[i].charAt(0)=='T'){
						p1Vals[8]++;
					}
					else{
						p1Vals[Integer.parseInt(""+p1[i].charAt(0))-2]++;
					}
					if(p1[i].charAt(1)=='C'){
						p1Suits[0]++;
					}
					else if(p1[i].charAt(1)=='D'){
						p1Suits[1]++;
					}
					else if(p1[i].charAt(1)=='H'){
						p1Suits[2]++;
					}
					else{
						p1Suits[3]++;
					}
				}
				for(int i=0;i<5;i++){
					p2[i]=line.next();
					if(p2[i].charAt(0)=='A'){
						p2Vals[12]++;
					}
					else if(p2[i].charAt(0)=='K'){
						p2Vals[11]++;
					}
					else if(p2[i].charAt(0)=='Q'){
						p2Vals[10]++;
					}
					else if(p2[i].charAt(0)=='J'){
						p2Vals[9]++;
					}
					else if(p2[i].charAt(0)=='T'){
						p2Vals[8]++;
					}
					else{
						p2Vals[Integer.parseInt(""+p2[i].charAt(0))-2]++;
					}
					if(p2[i].charAt(1)=='C'){
						p2Suits[0]++;
					}
					else if(p2[i].charAt(1)=='D'){
						p2Suits[1]++;
					}
					else if(p2[i].charAt(1)=='H'){
						p2Suits[2]++;
					}
					else{
						p2Suits[3]++;
					}
				}
				line.close();
				//FIRST SEEING WHAT p1 HAS
				//royal flush
				if((p1Suits[0]==5||p1Suits[1]==5||p1Suits[2]==5||p1Suits[3]==5)&&p1Vals[12]==1&&p1Vals[11]==1&&p1Vals[10]==1&&p1Vals[9]==1&&p1Vals[8]==1){
					//p1 has royal flush yoooooo
					p1Hand[0]++;
				}

				//straight flush and flush
				else if((p1Suits[0]==5||p1Suits[1]==5||p1Suits[2]==5||p1Suits[3]==5)){
					int i=12;
					while(p1Vals[i]==0){
						i--;
					}
					if(i>=4&&p1Vals[i-1]==1&&p1Vals[i-2]==1&&p1Vals[i-3]==1&&p1Vals[i-4]==1){
						//p1 has straight flush
						p1Hand[1]++;
					}
					else{
						//p1 has just a flush
						p1Hand[4]++;
					}
				}

				//4 of a kind
				for(int i=0;i<13;i++){
					if(p1Vals[i]==4){
						p1Hand[2]++;
					}
				}

				//full house
				for(int i=0;i<13;i++){
					if(p1Vals[i]==3||p1Vals[i]==2){
						int x=p1Vals[i];
						for(int j=i+1;j<13;j++){
							if(x+p1Vals[j]==5){
								p1Hand[3]++;
							}
						}
					}
				}

				//straight
				int i=12;
				while(p1Vals[i]==0){
					i--;
				}
				if(i>=4&&p1Vals[i-1]==1&&p1Vals[i-2]==1&&p1Vals[i-3]==1&&p1Vals[i-4]==1){
					//p1 has straight
					p1Hand[5]++;
				}

				//3 of a kind
				for(i=0;i<13;i++){
					if(p1Vals[i]==3){
						p1Hand[6]++;
					}
				}
				//2 pairs
				for(i=0;i<13;i++){
					if(p1Vals[i]==2){
						for(int j=i+1;j<13;j++){
							if(p1Vals[j]==2){
								p1Hand[7]++;
							}
						}
					}
				}

				//1 pair
				for(i=0;i<13;i++){
					if(p1Vals[i]==2){
						p1Hand[8]++;
					}
				}
				//highest card
				p1Hand[9]++;

				//NEXT SEEING WHAT p2 HAS
				//royal flush
				if((p2Suits[0]==5||p2Suits[1]==5||p2Suits[2]==5||p2Suits[3]==5)&&p2Vals[12]==1&&p2Vals[11]==1&&p2Vals[10]==1&&p2Vals[9]==1&&p2Vals[8]==1){
					//p2 has royal flush
					p2Hand[0]++;
				}

				//straight flush and flush
				else if((p2Suits[0]==5||p2Suits[1]==5||p2Suits[2]==5||p2Suits[3]==5)){
					i=12;
					while(p2Vals[i]==0){
						i--;
					}
					if(i>=4&&p2Vals[i-1]==1&&p2Vals[i-2]==1&&p2Vals[i-3]==1&&p2Vals[i-4]==1){
						//p2 has straight flush
						p2Hand[1]++;
					}
					else{
						//p2 has just a flush
						p2Hand[4]++;
					}
				}

				//4 of a kind
				for(i=0;i<13;i++){
					if(p2Vals[i]==4){
						p2Hand[2]++;
					}
				}

				//full house
				for(i=0;i<13;i++){
					if(p2Vals[i]==3||p2Vals[i]==2){
						int x=p2Vals[i];
						for(int j=i+1;j<13;j++){
							if(x+p2Vals[j]==5){
								p2Hand[3]++;
							}
						}
					}
				}

				//straight
				i=12;
				while(p2Vals[i]==0){
					i--;
				}
				if(i>=4&&p2Vals[i-1]==1&&p2Vals[i-2]==1&&p2Vals[i-3]==1&&p2Vals[i-4]==1){
					//p2 has straight
					p2Hand[5]++;
				}

				//3 of a kind
				for(i=0;i<13;i++){
					if(p2Vals[i]==3){
						p2Hand[6]++;
					}
				}
				//2 pairs
				for(i=0;i<13;i++){
					if(p2Vals[i]==2){
						for(int j=i+1;j<13;j++){
							if(p2Vals[j]==2){
								p2Hand[7]++;
							}
						}
					}
				}

				//1 pair
				for(i=0;i<13;i++){
					if(p2Vals[i]==2){
						p2Hand[8]++;
					}
				}
				//highest card
				p2Hand[9]++;


				//now comparing the two hands
				i=0;
				while(p1Hand[i]==0&&p2Hand[i]==0){
					i++;
				}
				if(p1Hand[i]>p2Hand[i]){
					//p1 wins
					p1wins++;
				}
				else if(p1Hand[i]<p2Hand[i]){
					//p1 loses
				}
				else{
					//both have same level hand

					//straight flush
					if(i==1){
						int j=12;
						while(p1Vals[j]==0&&p2Vals[j]==0){
							j--;
						}
						if(p1Vals[j]>p2Vals[j]){
							p1wins++;
						}
					}
					//4 of kind
					if(i==2){
						int j=12;
						while(p1Vals[j]!=4&&p2Vals[j]!=4){
							j--;
						}
						if(p1Vals[j]==4){
							p1wins++;
						}
					}
					//full house
					if(i==3){
						int j=12;
						while(p1Vals[j]!=3&&p2Vals[j]!=3){
							j--;
						}
						if(p1Vals[j]==3){
							p1wins++;
						}
					}

					//flush
					if(i==4){
						int j=12;
						while(p1Vals[j]!=1&&p2Vals[j]!=1){
							j--;
						}
						if(p1Vals[j]==1&&p2Vals[j]!=1){
							p1wins++;
						}
						else if(p1Vals[j]==1&&p2Vals[j]==1){
							int k=j-1;
							while(p1Vals[k]!=1&&p2Vals[k]!=1){
								k--;}
							if(p1Vals[k]==1&&p2Vals[k]!=1){
								p1wins++;
							}
							else if(p1Vals[k]==1&&p2Vals[k]==1){
								int l=k-1;
								while(p1Vals[l]!=1&&p2Vals[l]!=1){
									l--;}
								if(p1Vals[l]==1&&p2Vals[l]!=1){
									p1wins++;
								}
								else if(p1Vals[l]==1&&p2Vals[l]==1){
									int m=l-1;
									while(p1Vals[m]!=1&&p2Vals[m]!=1){
										m--;}
									if(p1Vals[m]==1&&p2Vals[m]!=1){
										p1wins++;
									}
									else if(p1Vals[m]==1&&p2Vals[m]==1){
										int n=m-1;
										while(p1Vals[n]!=1&&p2Vals[n]!=1){
											n--;}
										if(p1Vals[n]==1&&p2Vals[n]!=1){
											p1wins++;
										}

									}


								}
							}
						}
					}
					//straight
					if(i==5){
						int j=12;
						while(p1Vals[j]!=1&&p2Vals[j]!=1){
							j--;
						}
						if(p1Vals[j]==1){
							p1wins++;
						}
					}
					//3 of kind
					if(i==6){
						int j=12;
						while(p1Vals[j]!=3&&p2Vals[j]!=3){
							j--;
						}
						if(p1Vals[j]==3){
							p1wins++;
						}
					}
					//2 pairs
					if(i==7){
						int j=12;
						while(p1Vals[j]!=2&&p2Vals[j]!=2){
							j--;
						}
						if(p1Vals[j]==2&&p2Vals[j]!=2){
							p1wins++;
						}
						else if(p1Vals[j]==2&&p2Vals[j]==2){
							int k=j-1;
							while(p1Vals[k]!=2&&p2Vals[k]!=2){
								k--;
							}
							if(p1Vals[k]==2&&p2Vals[k]!=2){
								p1wins++;
							}
							else if(p1Vals[k]==2&&p2Vals[k]==2){
								int l=12;
								while(p1Vals[l]!=2&&p2Vals[l]!=2){
									l--;
								}
								if(p1Vals[l]==1){
									p1wins++;
								}
							}
						}
					}

					//1 pair
					if(i==8){
						int j=12;
						while(p1Vals[j]!=2&&p2Vals[j]!=2){
							j--;
						}
						if(p1Vals[j]==2&&p2Vals[j]!=2){
							p1wins++;
						}
						else if(p1Vals[j]==2&&p2Vals[j]==2){
							int l=12;
							while(p1Vals[l]!=1&&p2Vals[l]!=1){
								l--;}
							if(p1Vals[l]==1&&p2Vals[l]!=1){
								p1wins++;
							}
							else if(p1Vals[l]==1&&p2Vals[l]==1){
								int m=l-1;
								while(p1Vals[m]!=1&&p2Vals[m]!=1){
									m--;}
								if(p1Vals[m]==1&&p2Vals[m]!=1){
									p1wins++;
								}
								else if(p1Vals[m]==1&&p2Vals[m]==1){
									int n=m-1;
									while(p1Vals[n]!=1&&p2Vals[n]!=1){
										n--;}
									if(p1Vals[n]==1&&p2Vals[n]!=1){
										p1wins++;
									}

								}


							}
						}
					}

					//high card
					if(i==9){
						int j=12;
						while(p1Vals[j]!=1&&p2Vals[j]!=1){
							j--;
						}
						if(p1Vals[j]==1&&p2Vals[j]!=1){
							p1wins++;
						}
						else if(p1Vals[j]==1&&p2Vals[j]==1){
							int k=j-1;
							while(p1Vals[k]!=1&&p2Vals[k]!=1){
								k--;}
							if(p1Vals[k]==1&&p2Vals[k]!=1){
								p1wins++;
							}
							else if(p1Vals[k]==1&&p2Vals[k]==1){
								int l=k-1;
								while(p1Vals[l]!=1&&p2Vals[l]!=1){
									l--;}
								if(p1Vals[l]==1&&p2Vals[l]!=1){
									p1wins++;
								}
								else if(p1Vals[l]==1&&p2Vals[l]==1){
									int m=l-1;
									while(p1Vals[m]!=1&&p2Vals[m]!=1){
										m--;}
									if(p1Vals[m]==1&&p2Vals[m]!=1){
										p1wins++;
									}
									else if(p1Vals[m]==1&&p2Vals[m]==1){
										int n=m-1;
										while(p1Vals[n]!=1&&p2Vals[n]!=1){
											n--;}
										if(p1Vals[n]==1&&p2Vals[n]!=1){
											p1wins++;
										}

									}


								}
							}
						}
					}
				}


			}
			System.out.println(p1wins);

			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("poker.txt not found");
		}

	}
}
