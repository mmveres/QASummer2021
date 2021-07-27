package ua.univer.lesson07;

public class Car {
    private String name;
    private int number;
    private Engine engine;
    static class Engine{
        private String marka;
        private String model;
        private double power;

        public Engine(String marka, String model, double power) {
            this.marka = marka;
            this.model = model;
            this.power = power;
        }
        public Engine() {
            this("A","B",100.0);
        }
        public Engine model(String model){
            this.model = model;
            return this;
        }
        public Engine marka(String marka){
            this.marka = marka;
            return this;
        }
        public Engine power(double power){
            this.power = power;
            return this;
        }
    }

    public Car(String name, int number, String marka,String model, double power) {
        this.name = name;
        this.number = number;
        this.engine = new Car.Engine().power(95);
    }
    public Car(){

    }
}
