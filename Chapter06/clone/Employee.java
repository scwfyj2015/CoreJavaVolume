package clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double d) {
		// TODO Auto-generated constructor stub
		name =n;
		salary = d;
		hireDay = new Date();
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//call Object.clone()
		Employee cloned = (Employee)super.clone();
		//clone mutable fields
		cloned.hireDay = (Date) hireDay.clone();
		return cloned;
	}
	
	public void setHireDay(int year, int month, int day) {
		Date newHireDay = new GregorianCalendar(year, month-1, day).getTime();
		
		hireDay.setTime(newHireDay.getTime());
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee:name="+name+",salary="+salary+",hireday="+hireDay;
	}
	
}
