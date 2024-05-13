package methods;

public class Test {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = "Java";
        System.out.println(str1.length());
        System.out.println(str1.charAt(2));
        System.out.println(str1.substring(1,2));
        System.out.println(str1.startsWith("a"));
        System.out.println(str1.endsWith("J"));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

    }

}
