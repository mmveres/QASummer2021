package ua.univer.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Country {
    private String name;
    private double square;
    private int population;

    public Country(String name, double square, int population) {
        this.name = name;
        this.square = square;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", population=" + population +
                '}';
    }
}

@FunctionalInterface
interface MyOp<T> {
    T operation(T x, T y);
}

class MySum implements MyOp<Double> {

    @Override
    public Double operation(Double x, Double y) {
        return x + y;
    }
}

public class Program {
    public static void main(String[] args) {
        MyOp<Double> sum = (x, y) -> x + y;
        double result = sum.operation(2.0, 3.0);
        System.out.println(result);


        Country[] countries = {
                new Country("A", 110, 1200),
                new Country("C", 100, 1100),
                new Country("B", 120, 1300)};
        Arrays.sort(countries, (o1, o2) -> (int) (o1.getSquare()- o2.getSquare()));
        Arrays.sort(countries, Comparator.comparingInt(Country::getPopulation));
        System.out.println(Arrays.toString(countries));
        List.of(countries).forEach(
                country ->{
                    System.out.println(country);
                }
        );
    }
}
