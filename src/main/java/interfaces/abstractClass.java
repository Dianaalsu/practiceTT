package interfaces;

public class abstractClass {
    //Абстрактный класс это-то есть не может быть использован
    // для создания объектов напрямую), а служит в основном для
    // создания шаблонов или базовых классов для других классов.

    //Абстрактные методы
    abstract class Shape {
        abstract double area(); // Абстрактный метод, который должен быть реализован в подклассах
    }

    //Обычные методы
    abstract class Vehicle {
        abstract void start(); // Абстрактный метод

        void stop() { // Конкретный метод
            System.out.println("Vehicle stopped.");
        }
    }
    //поля, переменные
    abstract class Animal {
        String name; // Поле

        abstract void sound(); // Абстрактный метод
    }
    //Конструкторы
    abstract class Person {
        String name;
        int age;

        Person(String name, int age) { // Конструктор
            this.name = name;
            this.age = age;
        }

        abstract void display(); // Абстрактный метод
    }
    //Внутренние классы или интерфейсы
//    abstract class Database {
//        abstract void connect(); // Абстрактный метод
//
//        static class MySQL extends Database { // Внутренний класс
//            @Override
//            void connect() {
//                System.out.println("Connected to MySQL database.");
//            }
//        }
//    }
    //Статические методы или свойства
//    abstract class MathOperations {
//        static double PI = 3.14159; // Статическое свойство
//
//        static double circleArea(double radius) { // Статический метод
//            return PI * radius * radius;
//        }
//
//        abstract double squareArea(double side); // Абстрактный метод
//    }




}
