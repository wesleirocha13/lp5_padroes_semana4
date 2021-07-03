package templateMethod;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class CommonCustomerOrderTest {

    @Test
    public void testGetDiscountSubscriberCustomer() {
        CommonCustomerOrder order = new CommonCustomerOrder();
        order.setId(1);
        order.setValue(100);
        assertEquals(90.0, order.getFinalValue(), 0.001);
    }
}
