//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double creditCardBalance = 5000.00;
        final double INTEREST_RATE = 0.17;
        double firstMonth = 0.00;
        double secondMonth = 0.00;

        firstMonth = creditCardBalance + creditCardBalance * INTEREST_RATE;
        secondMonth = creditCardBalance + creditCardBalance * INTEREST_RATE;

        System.out.println("Your interest with a credit card balance of: " + creditCardBalance + " and a monthly interest rate of: " + INTEREST_RATE + " is: " + firstMonth + " for one month, and: " + secondMonth + " for two months.");

    }
}