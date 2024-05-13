package collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        //get-для получение одного элемента
        //keySet-для получение всех ключей(123456)
        //values-для получение всех значение(Диана)
        //replace-заменить значение(Диана-Данил)
        //remove-удалить
        //clear-удаляет полностью
        //size-размер элементов
        //forEach-для перебирание всех коллекции

        java.util.Map<Integer,String> persons = new HashMap<Integer,String>();
        persons.put(123456,"Diana"); //Ключи не должны повторятся
        persons.put(654321,"Danil"); //Значение могут повторятся
        persons.put(342156,"Anara");
        System.out.println(persons.get(123456));
        System.out.println(persons.keySet());
        System.out.println(persons.values());
        System.out.println(persons.replace(123456,"Aibek"));
        System.out.println(persons.remove("Aibek"));
        System.out.println(persons.entrySet());
        System.out.println(persons.size());
        persons.clear();
        for (java.util.Map.Entry<Integer,String> entry : persons.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //Удорядочный порядок
        java.util.Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("one", 1);
        linkedHashMap.put("two",2);
        linkedHashMap.put("three",3);
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }

        //Упорядочный порядок по алфавиту
        java.util.Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("banana", 3);
        treeMap.put("apple", 1);
        treeMap.put("orange", 2);
        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }
}
