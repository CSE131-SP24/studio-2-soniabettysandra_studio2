package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("What's your start amount?");
		int startAmount = in.nextInt();
		System.out.println("What's the win chance?");
		double winChance = in.nextDouble();
		System.out.println("What's your win limit?");
		int winLimit = in.nextInt();
		System.out.println("What's the total number of similuations?");
		int totalSimulations = in.nextInt();
		int win = 0;
		int ruin = 0;
		for(int i = 1; i <= totalSimulations; i++) {
			int cnt = 0;
			int x = startAmount;
			while (x > 0 && x < winLimit) {
				cnt++;
				if(Math.random() < winChance) {
					x ++;
				}
				else {
					x --;
				}
			}
			if (x == 0) {
				ruin++;
				System.out.println("Simulation " + i + ": " + cnt + " LOSE");
				
			}
			else {
				win++;
				System.out.println("Simulation " + i + ": " + cnt + " WIN");
			}

		}
		System.out.println("Losses: " + ruin + " Simulations: " + totalSimulations);
		double ruinRate = (double) ruin / totalSimulations;
		double a = (1-winChance) / winChance;
		double expectedRuinRate = (Math.pow(a, startAmount) - Math.pow(a, winLimit)) / (1-Math.pow(a,winLimit));
		System.out.println("Ruin Rate from Simulations: " + ruinRate);
		System.out.println("Expected Ruin Rate: " + expectedRuinRate);
		
	}

}
