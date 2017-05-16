import java.util.Scanner;

public class Retirement{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("how much do you need to retire?");
		double goal = in.nextDouble();
		
		System.out.print("How much money will you contribute every year?");
		double payment = in.nextDouble();
		
		System.out.println("Insert rat in %:");
		double insertRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		while (balance<goal) {
			balance += payment;
			double insert = balance * insertRate /100;
			balance += insert;
			years++;
		}
		
		System.out.println("you can retire in " + years + " years.");
		in.close();
	}
}
