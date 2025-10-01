package opgave02;

public class Softdrink {
    String name;
    int engery;
    int portionSize;

    public Softdrink(String name, int engery, int portionSize) {
        this.name = name;
        this.engery = engery;
        this.portionSize = portionSize;
    }

    public static double averageSize(Softdrink[] drinks) {
       int sum = 0;
        for (int i = 0; i < drinks.length; i++) {
            sum += drinks[i].portionSize;
        }
        return sum/drinks.length;
    }

    public static int totalEnergi(Softdrink[] drinks) {
        int sum = 0;
        for (int i = 0; i < drinks.length; i++) {
            sum += drinks[i].engery;
        }
        return sum;
    }

    public static void print(Softdrink[] drinks) {
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i].toString());
        }
    }

    public String toString() {
        return "Navn: " + name + " Energi: " + engery + " Størrelse i cL: " + portionSize;
    }
}
