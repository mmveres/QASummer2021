package ua.univer.lesson06;

import java.util.Arrays;

public class PolyPoint {
    private Point [] points;
    private int i;

    public PolyPoint() {
        points = new Point[3];
        i = 0;
    }
    public void add(Point p){
        if (i == points.length)
            points = Arrays.copyOf(points, points.length*2);
        points[i] = p;
        i++;
    }

    public int size(){
        return i;
    }

    @Override
    public String toString() {
        return "PolyPoint{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
