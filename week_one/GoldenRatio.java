import java.util.Scanner;
import java.lang.Math;

public class GoldenRatio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b;
		System.out.print("Enter two numbers: ");
		try {
			a = scan.nextDouble();
			b = scan.nextDouble();
            scan.close();
		} catch (Exception e) {
			System.out.println("\nInvalid input.");
			return;
		}
		System.out.println();
        
		double max_a = Math.max(a, b);
		double min_b = Math.min(a, b);

		String r1 = String.format("%.3f", ((max_a + min_b) / max_a));
		String r2 = String.format("%.3f",(max_a/min_b));
		boolean flag = (r1.equals(r2));


		if (flag) {
			System.out.println("Golden ratio!");
		} else {
			System.out.println("Maybe next time.");
		}
        
	}
}