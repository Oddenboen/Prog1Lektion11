package opgave01;

public class Books {
    public static void main(String[] args) {
        Book FIT = new Book("Organization", "Niels", 237, 2022);
       /* FIT.title = "Organization";
        FIT.author = "Niels";
        FIT.pages = 237;
        FIT.releaseYear = 2022; */

        Book javaProg = new Book("Intro to java", "Y. Daniel Liang", 1240,2025);
        /*javaProg.title = "Intro to java";
        javaProg.author = "Y. Daniel Liang";
        javaProg.pages = 1240;
        javaProg.releaseYear = 2025; */

        Book test = new Book();
        System.out.println("Titel: " + FIT.title + "\nForfatter: " + FIT.author + "\nSidetal: " + FIT.pages + "\nUdgivelses år: " + FIT.releaseYear);
        System.out.println("Titel: " + javaProg.title + "\nForfatter: " + javaProg.author + "\nSidetal: " + javaProg.pages + "\nUdgivelses år: " + javaProg.releaseYear);
        System.out.println("Titel: " + test.title + "\nForfatter: " + test.author + "\nSidetal: " + test.pages + "\nUdgivelses år: " + test.releaseYear);

    }

}
