public class VolumeOfCylinder {
	final static double PI = 3.141592;
	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("Not enough arguments.");
			return;
		} else if (args.length > 2) {
			System.out.println("Too many arguments.");
			return;
		}
		double r = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);

		if (r < 0) {
			System.out.println("Radius cannot be negative.");
			return;
		}
		if (h < 0) {
			System.out.println("Height cannot be negative.");
			return;
		}

		double v = PI * r * r * h;
		// there is no exponent operator in java
		// so we just multiply by r twice :)

		System.out.printf("The volume of the cylinder is %.2f.%n", v);

	}
}