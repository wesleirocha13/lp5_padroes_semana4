package iterator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class ProductControlTest {
    
    @Test
    public void mustCountProductsInStock() {
        
        Category category = new Category(
                new Product("Celular", 1200, 10),
                new Product("TV", 1600, 0),
                new Product("Notebook", 2200, 0),
                new Product("SmartWatch", 600, 5)
        );
        assertEquals(2, ProductControl.countProductsInStock(category));
    }
    
    @Test
    public void mustCountProductsByValue() {
        int minPrice = 1200;
        int maxPrice = 2199;
        Category category = new Category(
                new Product("Celular", 1200, 10),
                new Product("TV", 1600, 0),
                new Product("Notebook", 2200, 0),
                new Product("SmartWatch", 600, 5)
        );
        assertEquals(2, ProductControl.countProductsByValue(category, minPrice, maxPrice));
    }
    
}
