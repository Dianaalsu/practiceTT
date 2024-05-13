package interface2;

public class MyClass implements MyInterface{

    @Override
    public void abstractMethod() {
        System.out.println("Это абстартный метод из интерфейса");
    }
    MyClass diana =new MyClass();

    public static void main(String[] args) {
        MyClass diana =new MyClass();
    }


}
