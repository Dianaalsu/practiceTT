package practice;

public class iPhone extends Phone implements Dasha{
    public iPhone(String name, String model, String color) {
        super(name, model, color);

    }
    @Override
    void internetWifi() {
        System.out.println("Раздача интернета");
    }

    public void publicMethod(){  //через обьект
        System.out.println("Публичный");
    }
    private boolean privateMethod(){  //внутри класса публичный метод
        System.out.println("Приватный");
        return false;
    }
    public void privateMethod2(){ //для приватного
        System.out.println(privateMethod());
    }
    protected void protectedMethod(){ //через обьект
        System.out.println("Протектед");
    }
    public static void staticMethod(){ //через назв класса
        System.out.println("Статичный");
    }
    public String returnMethod(){ //через обьект
        return "Diana";
    }


}
