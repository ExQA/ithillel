import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterManager {
    private static final String PRODUCT_TYPE = "Book";

    public static final List<Product> products;

    public FilterManager(List<Product> products) {
        this.products = products;
    }

    public static  List<Product> FilteredByPrice(int price) {
        return products.stream()
                .filter(p -> p.getType().equals("Book"))
                .filter(p -> p.getPrice() > price)
                .collect(Collectors.toList());
    }

    public List<Product> ApplyingDiscount(List<Product> products) {
        return products.stream()
                .filter(p -> p.getType().equals(PRODUCT_TYPE))
                .filter(p -> p.isDiscountAvailable())
                .map(p -> {
                    p.setPrice(p.getPrice() - p.getPrice() * 0.1);
                    return p;
                })
                .collect(Collectors.toList());
    }

    public Product getCheapestProduct() {
        return products.stream()
                .filter(p -> p.getType().equals("Book"))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("Product type " + PRODUCT_TYPE + "wasn't found"));
    }

    public List<Product> getThreeProducts () {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreateDate))
                .limit(3)
                .collect(Collectors.toList());
    }

    public static double totalPrice () {
        return products.stream()
                .filter(p -> p.getCreateDate().getYear() == new Date().getYear())
                .filter(p -> p.getType().equals(PRODUCT_TYPE))
                .filter(p -> p.getPrice() < 75.0)
                .mapToDouble(Product::getPrice)
                .reduce(Double::sum)
                .orElseThrow(() -> new RuntimeException("Cannot find " + PRODUCT_TYPE));
    }

    public static Map<String, List<Product>> groupByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
