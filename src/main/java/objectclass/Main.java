package objectclass;
import interfaces.Person;

public class Main {
    public static void main(String[] args) {
        //Метод toString()
        Person man = new Person("Danil");
        System.out.println(man.toString());
        //Метод hashCode();
        System.out.println(man.hashCode());
        System.out.println(man.getClass());
        System.out.println(man.name.equals("Danil"));

        class Person {
            String name;
            Person(String name){
                this.name = name;
            }

            @Override
            public String toString(){
                return "Person" + name;
            }
//            @Override
//            public int hashCode(){
//                return 2*name.hashCode() + 5;
//            }
        }
    }
}
