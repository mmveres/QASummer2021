package ua.univer.lesson06;

public class ProgramOOP {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        int x = -11;
        p.setX(x);

        System.out.println(p);
        Point p1 = new Point();



        Cat c = new Cat("Tom",12,7);
        System.out.println(c);

        PolyPoint pp = new PolyPoint();
        pp.add(p);
        pp.add(new Point(3,3));

        System.out.println(pp.size());
        System.out.println(pp);

    }
}
