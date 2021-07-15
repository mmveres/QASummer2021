package ua.univer.lesson04;

import ua.univer.lesson04.util.MethodUtil;
import ua.univer.lesson04.util.MyAB;

import java.util.Arrays;


public class ProgramMethod {

    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("Before swap a ="+a+", b= "+b);
        MethodUtil.swap(a,b);
        System.out.println("After swap a ="+a+", b= "+b);
        int [] arr =new int[]{a,b};
        System.out.println("Before swap arr ="+ Arrays.toString(arr));
        MethodUtil.swap(arr);
        System.out.println("After swap arr ="+ Arrays.toString(arr));
        MethodUtil.add1elem(arr);
        System.out.println("After add1elem arr ="+ Arrays.toString(arr));
        arr = MethodUtil.getAdd1elem(arr);
        System.out.println("After getadd1elem arr ="+ Arrays.toString(arr));

        MyAB myAB = new MyAB();
        myAB.a = 30;
        myAB.b = 45;
        MethodUtil.swap(myAB);
        System.out.println("After swap myAB a ="+ myAB.a+", b ="+myAB.b);
        Math.abs(a);
    }
}
