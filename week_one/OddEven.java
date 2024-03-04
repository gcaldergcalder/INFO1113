import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        try {
            n = scan.nextInt();
            scan.close();
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
            return;
        }

        String parity = (n % 2 == 0) ? "even" : "odd";

        System.out.println("The number " + n + " is " + parity + ".");

    }
}