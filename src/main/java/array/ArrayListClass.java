package array;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("C++");
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.remove("Python");
        System.out.println("Содержит Java? " + list.contains("Java"));

        System.out.println("Все элементы список");
        for (String element : list){
            System.out.println(element);
        }
    }
}
