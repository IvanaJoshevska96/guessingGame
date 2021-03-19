import java.util.Random;
import java.util.Scanner;

public class Game {
	 public static void guessGame() {
		 Scanner sc=new Scanner(System.in);
		 Random rnd=new Random();
		 int rndNum=rnd.nextInt(11);
		 int attempts=0;
		 int myNum;
		final int maxAttempts=3;
		do {
			 System.out.println("Enter a number between 0 to 10: ");
			 myNum=sc.nextInt();
			if(myNum == rndNum) {
				System.out.println("Bravo");
			}else {
				System.out.println("Try again");
			}
			 
		}while(myNum != rndNum && ++attempts < maxAttempts );
		if(attempts == maxAttempts) {
			System.out.println("You lost,number is "+rndNum);	
		}
	 }	
	}
	


