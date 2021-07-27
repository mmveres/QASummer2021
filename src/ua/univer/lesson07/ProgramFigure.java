package ua.univer.lesson07;

public class ProgramFigure {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point cp1 = new ColorPoint(3,3,"red");

        Point [] points = new Point[4];
        points[0] = p1;
        points[1] = cp1;
        points[2] = new Point(4,4);
        points[3] = new Point3D(6,7,8);

        for (Point p : points) {
            System.out.println(p);
        }
    }
}
