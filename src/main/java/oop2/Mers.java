package oop2;

public class Mers extends Car {

    public Mers(String name, String colour, int numberCar, int size) {
        super(name, colour, numberCar, size);

    }

    @Override
    public boolean run() {
        System.out.println("Не бить");
        return false;
    }

    @Override
    public String runing() {
        return "Не ругаться";
    }

}
