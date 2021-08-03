package ua.univer.lesson09;

import java.util.Arrays;

class Product implements NameAble {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Cat implements NameAble{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class ProgramSwap {
    public static <T extends NameAble> void swap (T c1, T c2){
       String name = c1.getName();
       c1.setName(c2.getName());
       c2.setName(name);
    }

    public static void main(String[] args) {
        Car c1 = new Car("A",1,1);
        Car c2 = new Car("B",2,2);
        swap(c1,c2);
        System.out.println(c1);
        System.out.println(c2);


        Product p1 = new Product("A",11);
        Product p2 = new Product("B",22);
        swap(p1,p2);
        System.out.println(p1);
        System.out.println(p2);

        NameAble [] nameAbles = {new Cat("Vasil"), p1};
        swap(nameAbles[0], nameAbles[1]);
        System.out.println(Arrays.toString(nameAbles));
    }
}
