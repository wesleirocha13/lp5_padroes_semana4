package templateMethod;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class SubscriberCustomerOrderTest {
    
    @Test
    public void testGetDiscountSubscriberCustomer() {
        SubscriberCustomerOrder order = new SubscriberCustomerOrder();
        order.setId(1);
        order.setValue(100);
        assertEquals(70.0, order.getFinalValue(), 0.001);
    }
    
}
