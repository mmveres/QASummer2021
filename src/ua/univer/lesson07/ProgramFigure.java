package ua.univer.lesson07;
class YellowFlower implements ColorAble{

    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public void setColor(String color) {
        throw new IllegalArgumentException("Yellow can't change Color");
    }
}
public class ProgramFigure {
    public static void printColor(ColorAble colorAble){
        System.out.println(colorAble.getColor());

        System.out.println(ColorAble.BLACK);
    }
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        ColorPoint cp1 = new ColorPoint(3,3,"red");

        Point [] points = new Point[4];
        points[0] = p1;
        points[1] = cp1;
        points[2] = new Point(4,4);
        points[3] = new Point3D(6,7,8);

        for (Point p : points) {
            System.out.println(p);
        }

        Line l1 = new Line(p1,points[2]);
        Line l2 = new Line(7,7,8,8);
        Line l3 = new Line(new Point(9,9), new Point(10,10));

        ColorLine cl1 = new ColorLine(new Point(11,11), new Point(12,12),"green");
        ColorLine cl2 = new ColorLine(l2,"green");

        System.out.println(l1);
        System.out.println(l2);

        Line [] lines = {l1,l2,l3,cl1,cl2};
        for (var l: lines) {
            System.out.println(l);
        }
        System.out.println("**************************");
        AbstactFigure [] figures = {p1,cp1,l1,cl1};
        for (var obj: figures) {
            System.out.println(obj);
        }
        ColorAble [] colors = {cp1,cl1, new YellowFlower(), new ColorAble() {
            private  String color;
            @Override
            public String getColor() {
                return color;
            }

            @Override
            public void setColor(String color) {
                this.color = color;
            }
        }};
        for(var colorObj: colors){
            printColor(colorObj);
        }
    }
}
