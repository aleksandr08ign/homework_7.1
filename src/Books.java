public class Books {

    String book;
    int year;
    Author author;

    public Books(String book, int year, Author author) {
        this.book = book;
        this.year = year;
        this.author = author;
    }

    public String getBook() {
        return book;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
