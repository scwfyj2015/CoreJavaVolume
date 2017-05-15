import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteryDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("how many numbers do you need to draw?");
		int k = in.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int n = in.nextInt();
		
		int[] numbers = new int[n]; 
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		int[] result = new int[k];
		for (int i = 0; i < result.length; i++) {
			int r=(int)(Math.random()*n);
			result[i] = r;
			numbers[r] = numbers[n-1];
			--n;
			}
		
		System.out.println("before sort:");
		System.out.print(Arrays.toString(result));
		
		Arrays.sort(result);
		
		System.out.println("follow the next numbers, you will get rich:");
		for(int r:result)
		{
			System.out.println(r);
		}
	}

}
