package templateMethod;

/**
 *
 * @author Weslei
 */
public class SubscriberCustomerOrder extends Order{
    double discount = 0.3;
    public double getDiscount(){
        return discount;
    }
}
