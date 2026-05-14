public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0.");
        }
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public void printInfo() {
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
        System.out.println("-------------------");
    }
}
