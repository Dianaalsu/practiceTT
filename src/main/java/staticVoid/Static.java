package staticVoid;

public class Static {
//    Переменный
//    Мейн
//    Метод
//    Статический блоки

    // Статическая переменная
    static int count = 0;

    // Статический метод
    static int multiply(int a, int b) {
        return a * b;
    }


    static int num;
    // Статический блок инициализации
    static {
        num = 10;
        System.out.println("Статический блок выполнен, значение num: " + num);
    }

    public static void main(String[] args) {
        System.out.println("Метод main выполнен");
    }
}

