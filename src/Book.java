import java.text.NumberFormat;
import java.util.Locale;

public class Book {
    private String name;
    private String author;
    private double price;
    private boolean inStock;

    public Book(String name, String author, double price, boolean inStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    public void printInfo() {
        System.out.println("Book name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + toVND(this.price));
        System.out.println("Status: " + (this.inStock ? "In stock" : "Out of stock"));
        System.out.println("--------------------");
    }

    public void applyDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Discount percent must be between 0 and 100.");
        }
        this.price = this.price * (1 - percent / 100);
    }

    public static String toVND(double money) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN"));
        return format.format(money);
    }

}
