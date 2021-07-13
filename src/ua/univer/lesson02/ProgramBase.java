package ua.univer.lesson02;

public class ProgramBase {

    public static int findMax(int x, int y){
        return x > y ? x : y;
    }

    public static void main(String[] args) {
      //  System.out.println(""+1+2);
      //  System.out.println(1+2+"");
        int x = 1;
        int y = 2;
        double z= 1.0*x/y;
     //   System.out.println(z);
        int mymax = findMax(findMax(findMax(1,3),5),2);
        System.out.println(mymax);
        long l = 3_000_000_000l;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        float f1 = 1.0030000000000000000000000000000000000000100001f;
        float f2 = 1.0050000000000000000000000000000000000000100002f;
        System.out.println(Math.abs(f1-f2)<0.1);

//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Float.MIN_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);

        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

    }
}
