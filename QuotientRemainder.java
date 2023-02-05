package com.bl.basicprogram;

import java.util.Scanner;

public class QuotientRemainder
{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int divident = num.nextInt();

        System.out.print("Enter divisor: ");
        int dsor = num.nextInt();

        System.out.println("Quotient is : " + divident / dsor);
        System.out.println("Remainder is : " + divident % dsor);
    }
}
