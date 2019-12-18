package ten.advmaths;
public class trigno {
	public static void trig(int x)
	{
		double temp;
		temp = Math.toRadians(x);
		System.out.println("tan(x):"+Math.tan(temp));
		System.out.println("sin(x):"+Math.sin(temp));
		System.out.println("cos(x):"+Math.cos(temp));
	}
}