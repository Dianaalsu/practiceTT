package collections;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Set<String> cars = new LinkedHashSet<>();
        cars.add("mers");
        cars.add("mers");
        cars.add("bmb");
        cars.add("audi");
        cars.remove("bmb");
        System.out.println(cars);//Для выборки элемента
        System.out.println(cars.contains("toyota"));
        System.out.println(cars.size());


        for (String element : cars) {
            if (element.equals("bmb")) {
                System.out.println(element);
                break;
            }
        }



                LinkedList<String> flowers = new LinkedList<>();
                flowers.add("Роза");
                flowers.add("Пионы");
                flowers.add("Гортензия");
                flowers.add("Роза");

                flowers.addFirst("СпрейРозы"); //Добавляет с начало
                flowers.addLast("Тюльпан"); //Добавляет к концу
                System.out.println(flowers);

                boolean containsRose = flowers.contains("Рак"); //Сравнение обьекта
                System.out.println(containsRose);

                boolean isEmpty = flowers.isEmpty(); //Проверка на пустоту
                System.out.println(isEmpty);

                System.out.println(flowers.get(1)); //Получит элемент по индексу

                System.out.println(flowers.size()); //Получит размер элемента

                System.out.println(flowers.set(1, "Liliya")); //Заменяет существующий элемент

                System.out.println(flowers.remove(2));


            }

        }
