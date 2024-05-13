package oop;

public class Dantist extends Doctor  {
    public Dantist(String name, int age, String colour) {
        super(name, age, colour);
    }

    @Override
    void work() {
        System.out.println("");
    }


    @Override
    public String lechit() {
        return "better";
    }



}
