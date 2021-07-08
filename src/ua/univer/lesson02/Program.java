package ua.univer.lesson02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();
        int choice = 0;
        do {
            System.out.println("1. Sum");
            System.out.println("2. Multy");
            System.out.println("3. Divide");
            System.out.println("4. Sub");
            System.out.println("5. Count Cyfra x");
            System.out.println("6. Count Cyfra y");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            double result = getResult(x, y, choice);
            System.out.println(result);
        }while(choice != 0);

    }

    private static double getResult(int x, int y, int choice) {
        double result = 0;
        switch (choice) {
            case 0:
                System.out.println("exit");
                break;
            case 1:
                result = (x + y);
                break;
            case 2:
                result = (x * y);
                break;
            case 3:
                result = (double) x / y;
                break;
            case 4:
                result = (x - y);
                break;
            case 5:
                System.out.println("count = "+ getCount(x));
                break;
            case 6:
                System.out.println("count = "+ getCount(y));
                break;
            default:
                System.out.println("error");
        }
        return result;
    }

    private static int getCount(int x) {
        int count = 0;
        if (x==0) return 1;
        if (x<0) x = Math.abs(x);
        while (x > 0){
            x = x /10;
            count++;
        }
        return count;
    }
}
