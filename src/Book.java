public class Book {
    String author;
    String title;
    String description;
    int pages;

    public String toString(){
        return "Author: " + author + "\n" +
                "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "Pages: " + pages;
    }
    public Boolean compare(Book book){
        if (this.author == book.author &&
                this.title == book.title &&
                this.description == book.description &&
                this.pages == book.pages) {
            return true;
        }else {
            return false;
        }
    }

}
