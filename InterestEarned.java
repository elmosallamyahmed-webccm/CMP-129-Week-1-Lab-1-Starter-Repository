import java.util.Scanner;
public class InterestEarned {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("What is the amount in $ currently in your savings account?");
        double principal = hello.nextDouble();
        System.out.println("What is your interest rate in % form?");
        double ratePercent = hello.nextDouble();
        double interestRate = ratePercent/100;
        System.out.println("What is the number of times the interest is compounded?");
        double timesCompounded = hello.nextDouble();
        double currentAmount = principal + Math.pow((1+(interestRate/timesCompounded)), timesCompounded);
        double interest = currentAmount - principal;
        System.out.printf("%-30s %.2f%%%n", "Interest Rate:", ratePercent );
        System.out.printf("%-30s %d%n", "Times Compounded:", (int) timesCompounded);
        System.out.printf("%-30s $%.2f%n", "Principal:", principal);
        System.out.printf("%-30s $%.2f%n", "Interest:", interest);
        System.out.printf("%-30s $%.2f%n", "Amount in Savings:", currentAmount);
        hello.close();
    }
}
