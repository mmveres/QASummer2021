package ua.univer.lesson07;

public abstract class AbstactFigure {
    private static int id;
    private int curId;
    static {
        id =100;
    }

    AbstactFigure(){
        curId = ++id;
    }

    public static int getId() {
        return id;
    }

    public int getCurId() {
        return curId;
    }

   // abstract void print();

    @Override
    public String toString() {
        return "[" +
                "curId=" + getCurId() +
                "/" + getId() +
                ']';
    }
}
