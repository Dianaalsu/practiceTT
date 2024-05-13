package book;

public class Book {
    String name;
    String author;
    int pages;
    boolean isNonFiction;

    public Book(String name, String author, int pages, boolean isNonFiction) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.isNonFiction = isNonFiction;
    }
    public void printCountRows(){
        System.out.println("Количество строк в книге: " + this.pages * 40);
    }
     public void printCountRows(int countRowsOnPage){
         System.out.println("Количество строк в книге: " + this.pages * countRowsOnPage);
    }

   public void printInfo(){
       System.out.printf("%s от %s - %s", this.name, this.author,
               this.isNonFiction ? "Документальная" : "Недокументальная");
   }
}

