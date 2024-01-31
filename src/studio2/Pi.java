package studio2;
import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What's total dart?");
		int totalNum = in.nextInt();
		int numCircle = 0;
		for (int i = 0; i < totalNum; i++) {
			double x = Math.random();
			double y = Math.random();
			double dis = (x-0.5)*(x-0.5) + (y-0.5)*(y-0.5);
			if((Math.sqrt(dis) <= 0.5))
				numCircle ++;
		}
		double pi = 4.0 * numCircle / totalNum;
		System.out.println("Estimation for pi: " + pi);
		
		

	}

}
