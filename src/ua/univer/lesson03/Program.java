package ua.univer.lesson03;

public class Program {
    static  int count = 0;
    private static int fib(int n) {
        System.out.println(count++);
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }
    private static int fibIter(int n) {
        if (n < 2) return 1;
        int x = 1;
        int y = 1;
        int z = 0;
        for (int i = 2; i < n+1; i++) {
            z = y+x;
            x = y;
            y = z;
            System.out.println(count++);
        }
        return z;
    }
    public static void main(String[] args) {
        count = 0;
        fib(10);
        count= 0;
        fibIter(10);
    }
}
