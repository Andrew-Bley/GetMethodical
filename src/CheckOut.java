import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cost = 0;

        System.out.println("What is the cost of the item?");
        cost = in.nextDouble();

        double maxCost = SafeInputs.getRangedDouble(in, "What is the cost of the item? ",  1,  10);
        String repeat = SafeInputs.getYNConfirm(in, "Too much,Would you like to try again?");
    }
}
