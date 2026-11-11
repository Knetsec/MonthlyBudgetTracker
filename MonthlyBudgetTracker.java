import java.util.Scanner;

public class MonthlyBudgetTracker {

    // Constant: Minimum safe remaining balance
    public static final double RISK_THRESHOLD = 1000.0;

    // Method: Calculate total expenses
    public static double calculateTotalExpenses(double rent, double transport, double grocery) {
        return rent + transport + grocery;
    }

    // Method: Calculate remaining balance
    public static double calculateRemainingBalance(double monthlyIncome, double totalExpenses) {
        return monthlyIncome - totalExpenses;
    }

    // Method: Determine financial status
    public static String determineFinancialStatus(double remainingBalance) {
        if (remainingBalance < 0) {
            return "Overspending";
        } else if (remainingBalance <= RISK_THRESHOLD) {
            return "At Risk";
        } else {
            return "Financially Stable";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        double monthlyIncome;
        double rentExpense;
        double transportExpense;
        double groceryExpense;
        double totalExpenses;
        double remainingBalance;
        String financialStatus;

        // User Input
        System.out.print("Enter monthly income: R");
        monthlyIncome = scanner.nextDouble();

        System.out.print("Enter rent expense: R");
        rentExpense = scanner.nextDouble();

        System.out.print("Enter transport expense: R");
        transportExpense = scanner.nextDouble();

        System.out.print("Enter grocery expense: R");
        groceryExpense = scanner.nextDouble();

        // Calculations using methods
        totalExpenses = calculateTotalExpenses(rentExpense, transportExpense, groceryExpense);
        remainingBalance = calculateRemainingBalance(monthlyIncome, totalExpenses);
        financialStatus = determineFinancialStatus(remainingBalance);

        // Output
        System.out.println("\n===== Monthly Budget Summary =====");
        System.out.printf("Monthly Income: R%.2f%n", monthlyIncome);
        System.out.printf("Total Expenses: R%.2f%n", totalExpenses);
        System.out.printf("Remaining Balance: R%.2f%n", remainingBalance);
        System.out.println("Financial Status: " + financialStatus);

        scanner.close();
    }
}