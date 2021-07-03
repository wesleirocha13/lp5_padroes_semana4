package chainOfResponsability;

/**
 *
 * @author Weslei
 */
public class CustomerService {
    private TypeCustomerService typeCustomerService;

    public CustomerService(TypeCustomerService typeCustomerService) {
        this.typeCustomerService = typeCustomerService;
    }
    
    public TypeCustomerService getTypeCustomerService() {
        return typeCustomerService;
    }

    public void setTypeCustomerService(TypeCustomerService typeCustomerService) {
        this.typeCustomerService = typeCustomerService;
    }
}
