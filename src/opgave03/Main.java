package opgave03;

public class Main {
    public static void main(String[] args) {
        Rectangle one = new Rectangle(20, 10);
        Rectangle two = new Rectangle(3, 4);

        System.out.println(one.getArea() + " " + one.getPerimeter());
        System.out.println(two.getArea() + " " + two.getPerimeter());
    }
}
