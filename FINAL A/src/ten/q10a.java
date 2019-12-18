package ten;
import java.util.Scanner;
import ten.advmaths.*;

public class q10a {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("ENTER A NUMBER:");
			int n = in.nextInt();
			trigno.trig(n);
			System.out.println("ENTER THE LIMIT:");
			n = in.nextInt();
			triplets.tri(n);
	}
}