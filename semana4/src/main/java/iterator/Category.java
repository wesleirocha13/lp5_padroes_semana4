package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Weslei
 */
public class Category implements Iterable<Product>{
    private List<Product> products = new ArrayList<Product>();

    public Category(Product... products) {
        this.products = Arrays.asList(products);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
