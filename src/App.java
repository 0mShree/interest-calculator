import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Interest Calculator ===");

        System.out.print("\nPrincipal: ");
        int principal = sc.nextInt();
        System.out.print("Time (in year): ");
        int time = sc.nextInt();
        System.out.print("Interest Rate: ");
        int rate = sc.nextInt();

        int interestPerYear = (principal * time * rate) / 100;

        System.out.println("\nEnd Balance: " + (principal + interestPerYear));
        System.err.println("Total Interest: " + interestPerYear);
        System.out.println("Interest Per Month: " + (interestPerYear / 12));

        sc.close();
    }
}