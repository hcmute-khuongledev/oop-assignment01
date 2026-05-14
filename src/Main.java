
public class Main {
    public static void main(String[] args) {
        books();
        rectangles();
        circles();
    }

    private static void circles() {
        double totalArea = 0;
        Circle[] circles = {
            new Circle(1),
            new Circle(2),
            new Circle(3),
            new Circle(4),
            new Circle(5)
        };

        System.out.println("==== Circles ====");
        for (Circle circle : circles) {
            circle.printInfo();
            totalArea += circle.area();
        }

        System.out.printf("Total area: %.2f%n", totalArea);

    }

    private static void rectangles() {
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(7, 7);

        System.out.println("==== Rectangles ====");
        rectangle1.printInfo();
        rectangle2.printInfo();
    }

    private static void books() {
        Book[] books = {
            new Book("OOP", "HCMUTE", 500000, true),
            new Book("Math1", "HCMUTE", 600000, true),
            new Book("Physics1", "HCMUTE", 750000, true),
            new Book("OOP2", "HCMUTE", 750000, false)
        };

        System.out.println("==== Books ====");
        for (Book book : books) {
            book.printInfo();
        }

        books[0].applyDiscount(10);
        books[1].applyDiscount(20);
        books[2].applyDiscount(15);
        books[3].applyDiscount(0);

        System.out.println("==== Books after discount ====");
        for (Book book : books) {
            book.printInfo();
        }
    }
}