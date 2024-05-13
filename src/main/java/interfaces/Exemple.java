package interfaces;

public class Exemple implements Top{

    @Override
    public void A() {
        System.out.println("B");
    }

    @Override
    public String sum(String a, String b) {
        return a+b;
    }
}
