import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Double initialInvestment;
        System.out.println("Welcome to our investment earning Java program! This program is designed to help you calculate how long it will take for your initial investment to grow to your goal investment amount with a fixed interest rate. Please follow the prompts to enter your investment amounts and see the results. If you have any questions or need assistance, feel free to ask!\n");
        do{
            System.out.println("Enter your initial investment amount");
            initialInvestment = input.nextDouble();
            System.out.println("Enter your goal investment amount.");
            Double goalInvestment = input.nextDouble();
            Double rate= 7.0;
            int years = 1;
            while (initialInvestment <= goalInvestment) {
                Double totalInterest = initialInvestment * rate * years / 100.0;
                initialInvestment = initialInvestment + totalInterest;
                System.out.printf("Interest amount for year %d: $ %.2f%n", years, totalInterest);
                years++;
            }
            System.out.println("Do you want to calculate another investment earning? Y for yes and N for no;");
            String userInput = input.next();
            char ans = userInput.charAt(0);
            if(ans=='Y'|| ans=='y'){
                continue;}
            else{
                break;}


        }while(!(initialInvestment<0)&& initialInvestment.toString().matches("-?\\d+(\\.\\d+)?"));



    }
}
