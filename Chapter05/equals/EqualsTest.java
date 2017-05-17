package equals;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee alice1 = new Employee("Alice adams", 75000, 1987, 12, 15);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice adams", 75000, 1987, 12, 15);
		Employee bob = new Employee("Bob Brandson", 59000, 1989, 10, 1);
		
		System.out.println("alias1=alias2:"+(alice1 == alice2));
		System.out.println("alias1=alias3:"+(alice1 == alice3));
		System.out.println("alias1.equals(alias3):"+(alice1.equals(alice3)));
		System.out.println("alias1.equals(bob):"+(alice1.equals(bob)));
		
		Manager crel = new Manager("Carl Cracker", 50000, 1990, 12, 3);
		Manager boss = new Manager("Carl Cracker", 50000, 1990, 12, 3);
		boss.setBonus(4000);
		
		System.out.println("boss.toString():"+boss);
		System.out.println("carl.equals(boss):"+(crel.equals(boss)));
		
		System.out.println("alias1.hashcode:"+alice1.hashCode());
		System.out.println("alias3.hashcode:"+alice3.hashCode());
		System.out.println("bob.hashcode:"+bob.hashCode());
		System.out.println("boss.hashcode:"+boss.hashCode());
	}

}
