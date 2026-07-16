import java.util.Scanner;

public class Main {

    public static double averageGrowthRate(double[] pastRates) {
        double total = 0;
        for (double rate : pastRates) {
            total += rate;
        }
        return total / pastRates.length;
    }

    public static double predictFutureValue(double amount, double rate, int currentYear, int totalYears) {
        if (currentYear == totalYears) {
            return amount;
        }
        return predictFutureValue(amount * (1 + rate), rate, currentYear + 1, totalYears);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Financial Forecasting Tool");

        System.out.print("\nEnter current investment amount (in Rs): ");
        double amount = input.nextDouble();

        System.out.print("Enter number of past growth rates to enter: ");
        int count = input.nextInt();

        double[] pastRates = new double[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter past growth rate " + (i + 1) + " (e.g. 0.05 for 5%): ");
            pastRates[i] = input.nextDouble();
        }

        double avgRate = averageGrowthRate(pastRates);
        System.out.println("\nAverage growth rate based on past data: " + avgRate);

        System.out.print("Enter number of years to forecast: ");
        int years = input.nextInt();

        double futureValue = predictFutureValue(amount, avgRate, 0, years);
        System.out.println("\nPredicted value after " + years + " years: Rs " + futureValue);
    }
}