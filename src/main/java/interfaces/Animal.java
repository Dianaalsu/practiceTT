package interfaces;

public class Animal implements Info{
    public int id; //Создали переменную
    public Animal(int id){ //Создали конструктор с параметрами чтобы
                          // в других классах создать обьект и вызвать через название метода(Н:sleep)
        this.id = id;
    }
     public void sleep(){
         System.out.println("I'm sleeping");
     }
     public void showInfo(){
         System.out.println("It is"+this.id);
     }
}
