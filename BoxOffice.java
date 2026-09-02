import java.util.Scanner;
public class BoxOffice{
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);
        System.out.println("What is the name of the movie?");
        String movie = write.nextLine();
        System.out.println("How many adult tickets were sold?");
        double AT = write.nextDouble();
        System.out.println("How many children tickets were sold?");
        double CT = write.nextDouble();
        double gross = (AT * 10.00) + (CT * 6.00);
        double net = (gross * 0.20);
        double distributorProfit = gross - net;
        System.out.printf("%-30s %s%n", "Movie Name:", "\"" + movie + "\"");
        System.out.printf("%-30s %d%n", "Adult Tickets Sold:", (int) AT);
        System.out.printf("%-30s %d%n", "Child Tickets Sold:", (int) CT);
        System.out.printf("%-30s $%.2f%n", "Gross Box Office Profit:", gross);
        System.out.printf("%-30s $%.2f%n", "Net Box Office Profit:", net);
        System.out.printf("%-30s $%.2f%n", "Amount Paid to Distributor:", distributorProfit);
        write.close(); 
    }
}   

