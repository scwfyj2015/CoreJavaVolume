package arrayList;

import java.util.ArrayList;

import equals.Employee;

public class ArrayListTest {
	public static void main(String[] args){
		
		//两边均使用元素对象类型有些繁琐，可以省去右边的类型参数。
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("Carl Cracker", 76000, 1987,12,15));
		staff.add(new Employee("Harray Hacker", 50000, 1989,10,1));
		staff.add(new Employee("Tony Tester", 50000, 1990,3,10));
		
		for(Employee e:staff){
			e.raiseSalary(5);
		}
		
		
		for(Employee e: staff){
			System.out.println("name="+e.getName()+
					", salary="+e.getSalary()+", hiryday="+e.getHireDay());
		}
	}
}
