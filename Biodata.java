import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Halo, boleh tau nama kamu? ");
        String nama = input.nextLine();

        System.out.print("Hai " + nama + ", sekarang masukin NIM kamu ya: ");
        String nim = input.nextLine();

        System.out.println("\nMakasih banyak, " + nama + "!");
        System.out.println("NIM kamu: " + nim + ". Have a nice day!");

        input.close();
    }
}
