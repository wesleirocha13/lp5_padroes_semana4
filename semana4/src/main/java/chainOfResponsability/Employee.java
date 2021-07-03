package chainOfResponsability;

import java.util.ArrayList;

/**
 *
 * @author Weslei
 */
public abstract class Employee {
    protected ArrayList listCustomerService = new ArrayList();
    private Employee employeeUp;

    public Employee getEmployeeUp() {
        return employeeUp;
    }

    public void setEmployeeUp(Employee employeeUp) {
        this.employeeUp = employeeUp;
    }
    
    public abstract String getJobDescription();
    
    public String serveCustomer(CustomerService customerService) {
        if (listCustomerService.contains(customerService.getTypeCustomerService())) {
            return getJobDescription();
        }
        else {
            if (employeeUp != null) {
                return employeeUp.serveCustomer(customerService);
            }
            else 
            {
                return "Sem atendimento";
            }
        }        
    }
}
