package abstract_class;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = new Person[2];
		people[0] = new Student("langlang", "sutdent");
		people[1] = new Employee("haha", 1.23, 2014,2,12);
		
		for(Person p:people){
			System.out.println(p.getName()+" : "+p.getDescription());
		}
	}

}
