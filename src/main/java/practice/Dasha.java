package practice;

public interface Dasha {
    public static final String NAME = "Diana";
    default void watchFilm(){
        System.out.println("Смотрю фильмы в ютубе");
    }
    private void sentFoto(){
        System.out.println("Отпрвлено фото");
    }
    static void bluetooth(){
        System.out.println("Выключить блютуз");
    }
    public static String onlineShoping(String name, int price){
        return name+price;
    }

}
