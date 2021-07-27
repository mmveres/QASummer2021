package ua.univer.lesson07;

public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
        this.z = 1;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x ="+ super.getX() +
                ", y ="+ super.getY() +
                ", z =" + this.getZ() +
                "} ";
    }
}
