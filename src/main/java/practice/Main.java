package practice;

public class Main {
    public static void main(String[] args) {
        Phone.game();
        iPhone pro15 = new iPhone("iPhone","iphone12pro","blue");
        pro15.call();
        pro15.internetWifi();
        pro15.takeFotoCheck();
        System.out.println(pro15.sendMessage("Привет", "хорошо"));
        System.out.println(pro15.sendMessage("Привет", "Private"));

        Samsung galaxy = new Samsung("samsung", "A50","black");
        galaxy.watchFilm();
        Dasha.bluetooth();
        Dasha.onlineShoping("Кофта", 500);

        iPhone samsung = new iPhone("w","w","w");
        samsung.publicMethod();
        samsung.protectedMethod();
        iPhone.staticMethod();
        samsung.returnMethod();
        samsung.privateMethod2();




    }
}
