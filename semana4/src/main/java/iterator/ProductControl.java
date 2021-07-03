package iterator;

/**
 *
 * @author Weslei
 */
public class ProductControl {
    public static int countProductsInStock(Category category) {
        int quantity = 0;
        for (Product product : category) {
            if (product.getQtdProduct() > 0) {
                quantity++;
            }
        }
        return quantity;
    }

    public static int countProductsByValue(Category category, float minPrice, float maxPrice) {
        int quantity = 0;
        for (Product product : category) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                quantity++;
            }
        }
        return quantity;
    }
}
