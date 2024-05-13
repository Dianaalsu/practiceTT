package methods;

public interface Class {
    default void A(){
        System.out.println("первый");
    }
    public static void B(){
        System.out.println("второй");
    }
    private void C(){
        System.out.println("третий"); //Не вызывается
    }
//    public63 void D(){
//        System.out.println(); //Не можем создать внутри интерфейса
//    }

}


