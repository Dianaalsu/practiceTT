package oop2;

import java.util.Objects;

public abstract class Car {
    private String name;
    private String colour;
    private int numberCar;
    private int size;

    public Car(String name, String colour, int numberCar, int size) {
        this.name = name;
        this.colour = colour;
        this.numberCar = numberCar;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean run(){
        System.out.println("Ругаться");
        return false;
    }
    public String runing(){
        return "Бегать";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberCar == car.numberCar && size == car.size && Objects.equals(name, car.name) && Objects.equals(colour, car.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colour, numberCar, size);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", numberCar=" + numberCar +
                ", size=" + size +
                '}';
    }
}
