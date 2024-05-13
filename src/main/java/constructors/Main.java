package constructors;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "corolla", 2022, 25000.0);
        System.out.println("Марка:" + myCar.getBrand());
        System.out.println("Модель:" + myCar.getModel());
        System.out.println("Год выпуска:" + myCar.getYear());
        System.out.println("Цена:" + myCar.getPrice());

        myCar.setPrice(26000.0);
        System.out.println("Новая цена: $" + myCar.getPrice());
    }
}
