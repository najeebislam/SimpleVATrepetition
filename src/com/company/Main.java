package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (1 == 1) {
            Scanner input = new Scanner(System.in);
            double VAT = 1.2;
            System.out.println("Enter a cash amount.");
            double cashAmount = input.nextDouble();
            cashAmount = cashAmount * VAT;
            double roundCashAmount = Math.round(cashAmount * 100) / 100D;
            System.out.println(roundCashAmount);
        }
    }
}
