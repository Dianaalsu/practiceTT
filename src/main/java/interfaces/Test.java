package interfaces;

public class Test {
    public static void main(String[] args) {
//        Animal animal1 = new Animal(1); //Создали обьект
//        Person person1 = new Person("Bob");
//        animal1.sleep(); //Вызвали с помощью обьекта .
//        person1.sayHello();
        Mers mers = new Mers("e", "rul", "2");
        System.out.println(mers);

        mers.Spersk();
        Mers.staticMethod();
        mers.getName();
        System.out.println(mers.getName());





    }

}
