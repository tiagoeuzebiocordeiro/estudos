package app;
import app.entities.Rent;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rent[] rents = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ":");

            System.out.print("Name: ");
            sc.nextLine(); // buffer cleaner
            String name = sc.nextLine();

            System.out.print("E-mail: ");
            String email = sc.next();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            rents[roomNumber] = new Rent(name, email);
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println(i + ": " + rents[i]);
            }
        }
        sc.close();
    }
}