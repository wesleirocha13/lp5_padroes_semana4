package chainOfResponsability;

/**
 *
 * @author Weslei
 */
public class TypeCustomerServiceComum implements TypeCustomerService{
    private static TypeCustomerServiceComum typeCustomerServiceComum = new TypeCustomerServiceComum();

    private TypeCustomerServiceComum() {};
    
    public static TypeCustomerServiceComum getTypeCustomerServiceComum() {
        return typeCustomerServiceComum;
    }
}
