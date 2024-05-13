package interfaces;

public interface Info {
    int MAX_Value = 100; //Внутри интерфейса можем создать константу
                        //Абстратный метод
                        //Обычный метод(дефолтные методы)
                        //Статик метод
                        //Приватный метод
                        //Константа

    void showInfo(); //Внутри интерфейса не должно быть бади(Закрывается в конце ;). Мы создали метод
    default void Se(String message ){
        System.out.println("Log " + message);
    }
    private void processInternal(){

    }

}


