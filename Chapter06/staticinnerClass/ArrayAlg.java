package staticinnerClass;

public class ArrayAlg {
	public static class Pair{
		private double first;
		private double second;
		
		//在内部类不需要访问外围
		public Pair(double f, double s) {
			// TODO Auto-generated constructor stub
			first = f;
			second = s;
		}
		
		public double getFirst() {
			return first;
		}
		
		public double getSecond() {
			return second;
		}
	}
	
	public static Pair minmax(double[] values){
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		
		for(double v:values){
			if(min >v) min = v;
			if(max<v) max = v;
		}
		
		return new Pair(min, max);
	}
}
