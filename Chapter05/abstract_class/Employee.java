package abstract_class;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person{
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day) {
		// TODO Auto-generated constructor stub
		super(n);
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month, day-1);
		hireDay = calendar.getTime();
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
	
	public String getDescription(){
		return String.format("an employee with a salary of $%.2f",salary);
	}
}
