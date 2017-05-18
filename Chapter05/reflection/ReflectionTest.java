package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;


public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		if(args.length >0) name = args[0];
		else{
			Scanner in = new Scanner(System.in);
			System.out.print("enter class name :(e.g. java.util.Date):");
			name = in.next();
		}
		
		try{
			Class cl = Class.forName(name);
			Class supercL = cl.getSuperclass();
			
			String modifier = Modifier.toString(cl.getModifiers());
			if(modifier.length()>0) System.out.println(modifier + " ");
			System.out.print("class "+name);
			if(supercL!=null && supercL!=Object.class){
				System.out.print("extends "+supercL.getName());
			}
			
			System.out.print("\n\n");
			printConstructors(cl); 
			System.out.println();
			printMethods(cl);
			System.out.println();
			printFields(cl);
			System.out.println();
			
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.exit(0);
	}

	private static void printFields(Class cl) {
		// TODO Auto-generated method stub
		Constructor[] constructors = cl.getDeclaredConstructors();
		for(Constructor c:constructors)
		{
			String name = c.getName();
			System.out.print(" ");
			String modifier = Modifier.toString(cl.getModifiers());
			if(modifier.length()>0) System.out.println(modifier + " ");
			System.out.print("name"+"(");
			
			Class[]  paramTypes = c.getParameterTypes();
			for(int j=0; j<paramTypes.length; ++j){
				if(j>0){
					System.out.print(",");
					System.out.print(paramTypes[j].getName());
				}
				System.out.print(");");
			}		
		}
	}

	private static void printMethods(Class cl) {
		// TODO Auto-generated method stub
		Method[] method = cl.getDeclaredMethods();
		for(Method m:method){
			Class refType = m.getReturnType();
			String name = m.getName();
			
			System.out.println(" ");
			String modifier = Modifier.toString(m.getModifiers());
			if(modifier.length()>0) System.out.println(modifier + " ");
			System.out.print(refType.getName() + " "+name+"(");
			Class[]  paramTypes = m.getParameterTypes();
			for(int j=0; j<paramTypes.length; ++j){
				if(j>0){
					System.out.print(",");
					System.out.print(paramTypes[j].getName());
				}
				System.out.print(");");
			}	
			
		}
	}

	private static void printConstructors(Class cl) {
		// TODO Auto-generated method stub
		Field[]  fields = cl.getDeclaredFields();
		for(Field f:fields){
			Class type = f.getType();
			String name = f.getName();
			System.out.print(" ");
			String modifier = Modifier.toString(f.getModifiers());
			if(modifier.length()>0) System.out.println(modifier + " ");
			System.out.print(type.getName() + " "+name+"(");
		}
		
	}

}
