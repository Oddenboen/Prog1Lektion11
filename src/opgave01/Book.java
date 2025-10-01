package opgave01;

class Book {
    String title;
    String author;
    int pages;
    int releaseYear;

    public Book() {
        this("no Title", "no Author", -1, -1);
    }

    public Book(String title, String author, int pages, int releaseYear) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

}
