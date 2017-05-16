
public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args[0].equals("-h")){
			System.out.print("hello");
		}
		//java 应用程序中的main 方法中，程序名并没有存储在args 数组中。
		else if(args[0].equals("-g")){
			System.out.print("goodbye");
		}
		
		for (int i = 1; i < args.length; i++) {
			System.out.print(" "+args[i]);
		}
		System.out.print("!!");
	}

}
