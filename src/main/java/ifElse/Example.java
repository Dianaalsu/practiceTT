package ifElse;

public class Example {
    public static void main(String[] args) {
    //diana
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " является четным числом.");
        } else {
            System.out.println(number + " является нечетным числом.");
        }
//--------------------------------------------------------------------------------
        int score = 75;
        if (score >= 90) {
            System.out.println("Отличный результат");
        } else if (score >= 70) {
            System.out.println("Хороший результат");
        } else if (score >= 50) {
            System.out.println("Средний результат");
        } else {
            System.out.println("Низкий результат");
        }
//------------------------------------------------------------------------------------
        int x = 10;
        if (x>5){
            if (x<15){
                System.out.println("х находиться в диапазоне от 5 до 15");
            }
        }else{
            System.out.println("x меньше или равно 5");
        }
//----------------------------------------------------------------------------------------
        int x2 = 10;
        String result = (x>5) ? "x больше 5 " : "х меньше или равно 5";
        System.out.println(result);
    }

}


