package array;

public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        //Массив с пустыми ячейками
        int[]numbers = new int[5];
        //System.out.println(numbers[0]);
        //1)Для инициализации каждного элемента
        numbers[0] = 10;
        numbers[1]= 20;
        //2)инициализация с помощью for
        for (int i=0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        //Массив с непустыми ячейками
        int [] num = {1,2,3};
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
