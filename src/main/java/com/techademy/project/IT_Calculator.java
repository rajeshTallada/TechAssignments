package com.techademy.project;
import java.util.Scanner;

public class IT_Calculator {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Taxable Income: $ ");
        double taxableIncome = sc.nextDouble();
        sc.close();
        double taxRate;
        if (taxableIncome <= 25000) {
            taxRate = 0.0;
        } else if (taxableIncome <= 50000) {
            taxRate = 0.10;
        } else if (taxableIncome <= 75000) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }
        double taxPaidPerYear = taxRate*taxableIncome;
        double taxPayablePerMonth = taxPaidPerYear / 12;
        System.out.println("Tax Paid in a Year: $ " + taxPaidPerYear);
        System.out.println("Tax Paid in a Month: $ " + taxPayablePerMonth); 
    }

}
