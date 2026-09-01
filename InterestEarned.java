import java.util.Scanner;
public class InterestEarned {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("What is the amount in $ currently in your savings account?");
        double principal = hello.nextDouble();
        System.out.println("What is your interest rate?");
        double interestRate = hello.nextDouble();
        System.out.println("What is the number of times the interest is compounded?");
        double timesCompounded = hello.nextDouble();
        
        
    }
    
}
