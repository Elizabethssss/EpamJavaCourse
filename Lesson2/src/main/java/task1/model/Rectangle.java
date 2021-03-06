package task1.model;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(String shapeColor, double a, double b) {
        super(shapeColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString() + ", a = " + a + ", b = " + b;
    }

    @Override
    public double calcArea() {
        return a * b;
    }

    @Override
    public String draw() {
        return this.toString();
    }

    public static Shape parseShape(String input) {
        String[] tokens = input.split(", ");
        return new Rectangle(tokens[0], Double.parseDouble(tokens[1]),
                Double.parseDouble(tokens[2]));
    }
}
