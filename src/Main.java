public class Main {
    public static void main(String[] args) {
        Book book0 = new Book();
        book0.author = "Толстой";
        book0.title = "Война и мир";
        book0.description = "Ход войны";
        book0.pages =6000;

        Book book1 = new Book();
        book0.author = "Куприн";
        book0.title = "Гранатовый браслет";
        book0.description = "рассказ о браслете";
        book0.pages =20;

        System.out.println(book0);
        if(book0.compare(book1)){
            System.out.println("Книги одинаковы");
        } else{
            System.out.println("Книги разные");
        }
    }
}
