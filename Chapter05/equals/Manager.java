package equals;

public class Manager extends Employee {

	private double bonus;
	public Manager(String n, double s, int year, int month, int day) {
		super(n, s, year, month, day);
		// TODO Auto-generated constructor stub
		bonus = 0;
	}
	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		double basesalary = super.getSalary();
		return basesalary + bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ",bonus:"+bonus;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode()+17* new Double(bonus).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!super.equals(obj))
			return false;
		Manager other =(Manager)obj;
		return this.bonus == other.bonus;
	}

}
