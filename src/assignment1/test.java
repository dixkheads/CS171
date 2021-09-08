package assignment1;

public class test 
{
	public static void main(String[] args) throws Exception
	{
		LinearEquation sample = new LinearEquation(2, 3, 4, 6, 5, 11);
		System.out.println(sample.getA());
		System.out.println(sample.getB());
		System.out.println(sample.getC());
		System.out.println(sample.getD());
		System.out.println(sample.getE());
		System.out.println(sample.getF());
		System.out.println(sample.isSolvable());
		System.out.println(sample.getX());
		System.out.println(sample.getY());
	}

}
