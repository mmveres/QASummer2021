package ua.univer.lesson03;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramArray {
    public static void main(String[] args) {

        int n = 1234567890;
    //    int [] mas = fillMassCyfraOfValue(n);
    //    printMas(mas);

   //     int[] arr = fillMassFromConsole();
   //     printMas(arr);

        int [] arr1 = {1,2,3,4,5,5,67,87};

        for (int i = 0; i < arr1.length / 2; i++) {
           int temp = arr1[i];
           arr1[i] =  arr1[arr1.length-1-i];
           arr1[arr1.length-1-i] =temp;
        }
        System.out.println(Arrays.toString(arr1));
        printMas(arr1);

    }

    private static int[] fillMassFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        if (size == 0) return null;
        int [] arr= new int[size];
        int count =0;
        while(true) {
//            if (count == arr.length) {
//                System.out.println("Array is full");
//                break;
//            }
            if (count == arr.length) {
                arr = arrCopyAndGrowCapacity(arr);
            }
            if (count == arr.length)
                arr = Arrays.copyOf(arr,arr.length*2);

            System.out.println("Enter value");
            arr[count] = sc.nextInt();
            count++;
            System.out.println("Enter again [y]");
            String answer = sc.next();
            if (!(answer.equals("y") || answer.equals("Y"))) break;
        }
        return arr;
    }

    private static int[] arrCopyAndGrowCapacity(int[] arr) {
        int [] temp = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    private static int [] fillMassCyfraOfValue(int n) {
        int [] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = n %10;
            n = n /10;
        }
        return mas;
    }

    private static void printMas(int[] mas) {
        if (mas == null) throw new IllegalArgumentException();
        for (int i = 0; i < mas.length; i++) {
            System.out.println("mas["+i+"]="+ mas[i]);
        }
    }
}
