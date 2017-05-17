package equals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day ) {
		// TODO Auto-generated constructor stub
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		hireDay = calendar.getTime();
	}
	
	public Date getHireDay() {
		return hireDay;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//a quick test to see if the objects are identical
		if(this == obj){
			return true;
		}
		
		//must return false if the explicit parameter is null
		if(obj == null){
			return false;
		}
		
		//if classes don't match ,they can't be equal
		if(getClass()!=obj.getClass()){
			return false;
		}
		
		//now we know otherObject is a non-null Employee
		Employee other = (Employee)obj;
		
		//test whether the fields have identical values
		return (Objects.equals(name, other.name) 
				&& salary == other.salary && Objects.equals(hireDay, other.salary));
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return Objects.hash(name, salary, hireDay);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	//	return super.toString();
		return getClass().getName() + "[name="+name+",salary="+salary+",hireday="+hireDay;
	}
}










