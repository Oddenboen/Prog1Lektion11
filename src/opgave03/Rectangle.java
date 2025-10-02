package opgave03;

public class Rectangle {
    double height;
    double width;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height + width) * 2;
    }


}
