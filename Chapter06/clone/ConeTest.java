package clone;

public class ConeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Employee original = new Employee("John.Q", 50000);
			original.setHireDay(2000, 1, 23);
			Employee copy = original.clone();
			
			copy.raiseSalary(20);
			copy.setHireDay(1989, 12, 4);
			
			System.out.println("original="+original);
			System.out.println("copy="+copy);
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}

}
