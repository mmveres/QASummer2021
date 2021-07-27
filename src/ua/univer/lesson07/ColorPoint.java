package ua.univer.lesson07;

public class ColorPoint extends Point implements ColorAble{
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorPoint{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
