package interfaces;

public abstract class Car {
    private String name;
    private String dital;
    private String one;
    final int INT = 1;
    public void Spersk(){
        System.out.println("Speak");
    }

    public void Car() {
        System.out.println("BMW");
    }
    public static void staticMethod() {
        System.out.println("This is a static method in AbstractClass.");
    }

    public Car(String name, String dital, String one) {
        this.name = name;
        this.dital = dital;
        this.one = one;
    }

    public String getName() {
        return name;
    }

    public String getDital() {
        return dital;
    }

    public String getOne() {
        return one;
    }

    public int getINT() {
        return INT;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDital(String dital) {
        this.dital = dital;
    }

    public void setOne(String one) {
        this.one = one;
    }
}
