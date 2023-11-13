import java.time.LocalDate;

public class Product {
    private final int id;
    private final String type;
    private double price;
    private LocalDate createDate;
    private boolean discountAvailable;

    public Product(int id, String type, double price, boolean discountAvailable, LocalDate createDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discountAvailable = discountAvailable;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public boolean isDiscountAvailable() {
        return discountAvailable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", created=" + createDate +
                ", discountAvailable=" + discountAvailable +
                ", products=" +
                '}';
    }
}
