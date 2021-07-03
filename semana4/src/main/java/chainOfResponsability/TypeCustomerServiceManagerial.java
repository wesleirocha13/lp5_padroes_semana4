package chainOfResponsability;

/**
 *
 * @author Weslei
 */
public class TypeCustomerServiceManagerial implements TypeCustomerService{
    private static TypeCustomerServiceManagerial typeCustomerServiceManagerial = new TypeCustomerServiceManagerial();

    private TypeCustomerServiceManagerial() {};
    
    public static TypeCustomerServiceManagerial getTypeCustomerServiceManagerial() {
        return typeCustomerServiceManagerial;
    }
}
