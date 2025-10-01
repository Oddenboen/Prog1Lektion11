package opgave02;

public class Main {
    public static void main(String[] args) {
        Softdrink[] drinks = new Softdrink[3];

        drinks[0]  = new Softdrink("Pepsi Max", 0, 33);
        drinks[1] = new Softdrink("Faxe Kondi", 200, 33);
        drinks[2] = new Softdrink("Coca Cola", 800, 150);

        Softdrink.print(drinks);
        System.out.println(Softdrink.totalEnergi(drinks));
        System.out.println(Softdrink.averageSize(drinks));

    }
}
