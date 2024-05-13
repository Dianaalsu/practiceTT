package interface2;

public interface MyInterface {
    void abstractMethod();
    default void defaultMethod(){
        System.out.println("Это дефолтный метод интерфейса");
    }
    static void staticMethod(){
        System.out.println("Это статичный метод интерфейса");
    }
}
