package objectclass;

public class ObjectClass {
     private String name;
     private int age;

    public ObjectClass() {
        super();         // super(); - Это означает вызов конструктора суперкласса(object)
    }


    @Override
    public int hashCode() {  //hashCode() текущего класса, возвращая хэш-код, вычисленный в суперклассе.
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) { // equals() текущего класса, просто вызывая реализацию
                                        // сравнения объектов из суперкласса.
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {   // метод clone() текущего класса, используя стандартный механизм клонирования,
                                 // предоставляемый суперклассом, для создания копии объекта.
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable { //Этот метод используется для выполнения дополнительных действий
                                                 // перед удалением объекта из памяти сборщиком мусора.
        super.finalize();
    }

    public ObjectClass(String name, int age){
         this.name = name;
         this.age = age;

     }
}




