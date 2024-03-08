public class Circle {
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor with radius parameter
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Constructor with radius and color parameters
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Getter method for area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Setter method for color
    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Create an instance of Circle using the default constructor
        Circle circle1 = new Circle();

        // Create an instance of Circle using the constructor with radius parameter
        Circle circle2 = new Circle(2.5);

        // Create an instance of Circle using the constructor with radius and color parameters
        Circle circle3 = new Circle(3.0, "blue");

        // Print the details of the circles
        System.out.println("Circle 1:");
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println();

        System.out.println("Circle 2:");
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println();

        System.out.println("Circle 3:");
        System.out.println(circle3);
        System.out.println("Area: " + circle3.getArea());
    }
}
