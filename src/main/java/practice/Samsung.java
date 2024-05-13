package practice;

public class Samsung extends Phone implements Dasha{

    public Samsung(String name, String model, String color) {
        super(name, model, color);
    }

    @Override
    void internetWifi() {
        System.out.println("Интернет");

    }
    public static final int MY_CONSTANT = 10;


}
