package opgave04;

public class Main {
    public static void main(String[] args) {
        Stock GME = new Stock("Game stop", 27.25, 27.41);

        System.out.println(GME.getChangeProcent() + "%");
    }
}
