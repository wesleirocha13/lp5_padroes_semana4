package chainOfResponsability;

/**
 *
 * @author Weslei
 */
public class TypeCustomerServiceOperational implements TypeCustomerService{
    private static TypeCustomerServiceOperational typeCustomerServiceOperational = new TypeCustomerServiceOperational();

    private TypeCustomerServiceOperational() {};
    
    public static TypeCustomerServiceOperational getTypeCustomerServiceOperational() {
        return typeCustomerServiceOperational;
    }
}
