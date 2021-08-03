package ua.univer.lesson09;
class Inspector {
    public <T> void inspect(T t) {
        System.out.println(t.getClass().getName());
    }
}

public class ProgramInspector {
    public static void main(String[] args) {
        Inspector i = new Inspector();
        String s = "Hello";
        int x = 1;
        i.inspect(x);
        i.<String>inspect(s);
        i.inspect(1.0);
        i.inspect(i);
    }
}
