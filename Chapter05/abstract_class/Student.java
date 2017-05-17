package abstract_class;

public class Student extends Person{

	private String major;
	
	public Student(String n, String m) {
		// TODO Auto-generated constructor stub
		super(n);
		major = m;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "a student majoring in " + major;
	}
}
