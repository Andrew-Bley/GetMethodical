import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        int NonDecNumber;
        double DecNumber;

        Scanner in = new Scanner(System.in);

        NonDecNumber = SafeInputs.getInt(in, "What is your favorite non decimal number?");
        DecNumber = SafeInputs.getDouble(in, "What is your favorite decimal number");

        System.out.println("");
        System.out.println("\nYour favorite non decimal number is: " + NonDecNumber);
        System.out.println("\nYour favorite decimal number is: " + DecNumber);
    }
}