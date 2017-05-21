package staticinnerClass;

public class StaticInnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] d = new double[20];
		for(int i=0; i<d.length; ++i){
			d[i] = Math.random();
		}
		
		ArrayAlg.Pair p = ArrayAlg.minmax(d);
		
		System.out.println("min = " + p.getSecond());
		System.out.println("max = " + p.getFirst());
		
	}

}
