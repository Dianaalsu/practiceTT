package interfaces;

public class Person implements Info{ //implements ключевое слово Интерфейс
    public String name; //Создали переменную
    public Person(String name){ //Создали конструктор с параметрами чтобы
                               // в других классах создать обьект и вызвать через название метода(Н:sleep)
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    public void showInfo(){ //В классе Info был создан абстрактный метод,
        System.out.println("Name is "+this.name);

    }
}
