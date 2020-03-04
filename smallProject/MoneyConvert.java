package smallProject;

import java.util.Scanner;

public class MoneyConvert{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your amount of money: ");
        double money = input.nextDouble();
        //handle dollar part
        int myDollar = (int)money;
        int numOfTenDollar = myDollar / 10;
        int numOfTwoDollar = (myDollar % 10) / 2;
        int numOfOneDollar = myDollar % 10 - numOfTwoDollar * 2;
        //handle cent part 
        int myCent = ((int)(money * 100)) % 100;
        System.out.println("Mycent: " + myCent);
        int numOfTwentyfiveCent = myCent / 25;
        int numOfTenCent = myCent % 25 / 10;
        int numOfOneCent = myCent % 25 - numOfTenCent * 10;
        System.out.println("Ten Dollar: " + numOfTenDollar);
        System.out.println("Two Dollar: " + numOfTwoDollar);
        System.out.println("One Dollar: " + numOfOneDollar);
        System.out.println("Twentyfive Cent: " + numOfTwentyfiveCent);
        System.out.println("Ten cent: " + numOfTenCent);
        System.out.println("One cent: " + numOfOneCent);
    }
}