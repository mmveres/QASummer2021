package ua.univer.lesson09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Car implements Comparable<Car>, NameAble {
    private String name;
    private int year;
    private double price;

    public Car(String name, int year, double price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if (this.getYear() == o.getYear()) {
            return this.getName().compareTo(o.getName());
        }
        return this.getYear() - o.getYear();
    }
}

class SortCarByName implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortCarByPrice implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}

class SortByPrice implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Car && o2 instanceof Car)
            return (int) (((Car) o1).getPrice() - ((Car) o2).getPrice());
        else
            throw new IllegalArgumentException();
    }
}

public class ProgramCompare {
    public static void main(String[] args) {
        int[] mas = {14, 25, 3, 41, 5};
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        Car[] cars = {
                new Car("Ford2", 5, 10000),
                new Car("Ford1", 5, 15000),
                new Car("BMW", 3, 15000),
                new Car("AUDI", 7, 9000),
        };

        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, new SortCarByName());
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (o1, o2) ->  o1.getName().compareTo(o2.getName()));
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparing(Car::getName));
        System.out.println(Arrays.toString(cars));

//        ArrayList<String> list = new ArrayList<>();
//        list.add(1);// int = new Integer()
//        list.add("Hi");
//        list.add(new Car("a",1,2));
//        list.add(new Object());
    }
}
