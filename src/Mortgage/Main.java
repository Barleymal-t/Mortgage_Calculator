package Mortgage;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    /*public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle: ");
        float P = sc.nextFloat();
        System.out.print("Annual Interest Rate: ");
        float r = (sc.nextFloat()/100/12);
        //String R = NumberFormat.getPercentInstance().format(r);
        //System.out.println(r);
        System.out.print("Period(Years): ");
        float n = sc.nextFloat()*12;
        double m = P*(r*Math.pow((1+r),n)/(Math.pow((1+r),n)-1));
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(m));

    }*/
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        float principal;
        while (true){
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextFloat();
            if (principal <= 1000 || principal >= 1000000)
            System.out.println("Enter a number between 1000 and 1000000");
            else
                break;
            }
        float annualInterest;
        while (true){
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest <=0 || annualInterest >= 30)
                System.out.println("Enter a number between 0 and 30");
            else
                break;
        }
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float years;
        while (true){
            System.out.print("Period(Years): ");
            years = scanner.nextFloat();
            if (years <= 1 || years >= 30)
                System.out.println("Enter a number between 1 and 30");
            else
                break;
        }
        float numberOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthlyInterest * Math.pow((1+monthlyInterest),numberOfPayments))
                / (Math.pow((1+monthlyInterest), numberOfPayments) - 1);
        String Mortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + Mortgage);


    }
}
