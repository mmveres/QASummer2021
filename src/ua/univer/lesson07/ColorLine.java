package ua.univer.lesson07;

public class ColorLine extends Line implements ColorAble{
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }
    public ColorLine(Line line, String color) {
        super(line);
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
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", start=" + start +
                ", end=" + end +
                "} ";
    }
}
