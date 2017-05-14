import java.util.Scanner;


public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  in = new Scanner(System.in);
		
		System.out.println("what is your name");
		String name = in.nextLine();
		
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		System.out.println("hello , "+ name + ", next year , you will be " + (age+1));
		in.close();
        System.out.println("bye");
	}

}
