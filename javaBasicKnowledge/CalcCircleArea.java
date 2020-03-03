package javaBasicKnowledge;

import java.util.Scanner;

public class CalcCircleArea {
    public static void main(final String[] args) {
        System.out.println("This is my breakpoint!");
        final Scanner scanner = new Scanner(System.in);
        System.out.println("请输入半径： ");
        final double radius = scanner.nextDouble();
        final double area = 3.14 * radius * radius;
        System.out.println("圆的面积是： " + area);
    }
}