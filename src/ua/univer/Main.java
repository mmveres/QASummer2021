package ua.univer;

public class Main {
    /**
     * ljsklfjkldsjf
     * dslfjslkdjf
     * dlkfkjsd;fjds;kl
     * @param n1
     * @return
     */
    public static int task1(int n1) {

        if (n1 == 0) {
            return 0;
        } else if (n1 > 0) {
            return n1 * n1;
        } else return Math.abs(n1);
    }

    public static void main(String[] args) {

     //   System.out.println("Hello people");
        int expResult = 0;
        int actResult = task1(0);
     //   System.out.print(expResult == actResult);
        int x =123;
        System.out.print(x%100);
    }
}
