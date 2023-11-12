import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Book", 100, false, LocalDate.of(2022, 1, 1)));
        products.add(new Product(2, "Book", 200, true, LocalDate.of(2022, 2, 1)));
        products.add(new Product(3, "Toy", 100, false, LocalDate.of(2022, 10, 1)));
        products.add(new Product(4, "Toy", 200, true, LocalDate.of(2022, 11, 1)));

        Map<String, List<Product>> groupedProducts = FilterManager.groupByType(products);
        List<Product> findByPrice = FilterManager.FilteredByPrice(100);

        System.out.println(groupedProducts);
        System.out.println(findByPrice);

    }
}