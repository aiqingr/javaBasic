package javaBasicKnowledge;

import java.util.Scanner;

public class FrontBackPlus {

    public static void main(String[] args){
        float num1, num2, total1, total2;
        num1 = 1;
        num2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your testing number");
        total1 = input.nextFloat();
        total2 = input.nextFloat();
        System.out.println("The initial of total1 is " + total1);
        System.out.println("The initial of total2 is " + total2);
        total1 = ++num1;
        total2 = num2++;
        System.out.println("Now, the total1 is " + total1);
        System.out.println("Now, the total2 is " + total2);
    }
    
}