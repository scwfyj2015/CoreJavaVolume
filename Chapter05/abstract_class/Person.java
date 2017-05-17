package abstract_class;

public abstract class Person {
	//抽象方法充当着占位的角色
public abstract String getDescription();
	private String name;
	
	public Person(String n) {
		// TODO Auto-generated constructor stub
		name = n;
	}
	
	public String getName() {
		return name;
	}
}
