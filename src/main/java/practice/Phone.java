package practice;

import java.util.Objects;

public abstract class Phone {
    private String name;
    private String model;
    private String color;

    public Phone(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(){
        System.out.println("Я могу звонить");
    }
    private void takeFoto(){
        System.out.println("Я могу сфотать");
    }
    public void takeFotoCheck(){
        takeFoto();
    }
    public String sendMessage(String hi, String HAU){
        return hi+HAU;
    }
    static void game(){
        System.out.println("Давай играть");
    }
    abstract void internetWifi();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(name, phone.name) && Objects.equals(model, phone.model) && Objects.equals(color, phone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, color);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

