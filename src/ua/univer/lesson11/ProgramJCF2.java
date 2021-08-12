package ua.univer.lesson11;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Ship{
    private String name;
    private int x;
    private int y;

    public Ship(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Objects.equals(name, ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", hash="+hashCode()+
                '}';
    }
}
public class ProgramJCF2 {
    public static void main(String[] args) {
        BigDecimal bd;
        HashMap hashMap;
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        Ship s1 = new Ship("Odessa",1,1);
        Ship s2 = new Ship("Odessa",1,2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1);
        s1.setX(2);
        System.out.println(s1);

        Set<Ship> ships = new HashSet<>();
        ships.add(s1);
        ships.add(s2);

        System.out.println(ships);

        System.out.println(ships.contains(new Ship("Odessa",0,0)));
        Map<Integer, String> map = new LinkedHashMap<>();
        Map<Integer, String> syncMap = Collections.synchronizedMap(map);

        map.put(1,"a");
        map.put(5,"b");
        map.put(17,"c");

        System.out.println(map);



    }
}
