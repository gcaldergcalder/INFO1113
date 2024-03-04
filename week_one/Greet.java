import java.util.Scanner;

public class Greet {
    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        scan.close();
    }
}