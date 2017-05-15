package Chapter04;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day) {
		// TODO Auto-generated constructor stub
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month, day-1);
		hireDay = calendar.getTime();
	}
	
	public String getName() {
		return name;
	}
	
	public Date getHireDay() {
		return hireDay;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent /100;
		salary += raise;
	}
}
