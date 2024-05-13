package forEach;

public class ForEach {
    public static void main(String[] args) {
        int[]numbers = {1,2,3,4,5};

        for (int number : numbers){ //Вытащит все элементы
            System.out.println(number);

        }
        int[]numbers2 = {1,2,3,4,5}; //Вытащит последний элемент
        System.out.println(numbers2[numbers2.length - 1]);


        int[] numbers3 = {1, 2, 3, 4, 5};
        int middleIndex = numbers3.length / 2; // Получаем индекс посередине массива
        System.out.println(numbers3[middleIndex]);

    }

}
