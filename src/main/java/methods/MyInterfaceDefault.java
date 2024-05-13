package methods;

public interface MyInterfaceDefault {
    void abstractMethods();
    default void defaultMethod(){
        System.out.println("Это дефолтный метод");
    }
}
