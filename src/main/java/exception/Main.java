package exception;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("Это мое собственное исключение");
        }catch (MyCustomException e){
            System.out.println("Произошло исключение: " + e.getMessage());
        }
        finally {
            System.out.println("Выполнен finally");
        }
    }
}
