package templateMethod;

/**
 *
 * @author Weslei
 */
public class CommonCustomerOrder extends Order{
    double discount = 0.1;
    public double getDiscount(){
        return discount;
    }
}
