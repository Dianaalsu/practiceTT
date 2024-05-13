package oop;

import java.util.Objects;

public abstract class Doctor {
    private String name;
    private int age;
    private String colour;

    public Doctor(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    abstract void work();

    public String lechit(){
        return "good";

    }
    public String lechit(String name){
        return name;

    }

    private void call(){
        System.out.println("I am busy");

    }
    private void call(String wok){
        System.out.println(wok);

    }

    public static int sum(){
        return 10;
    }
    public static int sum(int wook){
        return wook;
    }


    public Doctor() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && Objects.equals(name, doctor.name) && Objects.equals(colour, doctor.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colour);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
