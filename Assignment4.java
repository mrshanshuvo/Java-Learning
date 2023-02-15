import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int phonePrice = 1800; // 1800 euros
            int numberOfInstallment, installmentPerMonth;

            System.out.print("Number of installments? ");
            // get number of installments from user
            numberOfInstallment = input.nextInt();

            // calculate installment amount for per month
            installmentPerMonth = phonePrice / numberOfInstallment;
            

            System.out.println("Monthly installment Amount: " + installmentPerMonth + " euros");
        }
    }
}
