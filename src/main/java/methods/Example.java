package methods;

public class Example {
    public static void main(String[] args) {
        String name1 = "Diana";
        String name2 = "Diana";
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        String name3 = new String("Diana").intern();  //разные обьекты в памяти
        String name4 = new String("Diana");
        String name5 = new String("Diana");          //сравнивает содержимое
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));       

    }


}
