package chainOfResponsability;

/**
 *
 * @author Weslei
 */
public class EmployeeManager extends Employee{
    public EmployeeManager(Employee upper) {
        listCustomerService.add(TypeCustomerServiceManagerial.getTypeCustomerServiceManagerial());
        setEmployeeUp(upper);
    }
    
    public String getJobDescription() {
        return "Gerente";
    }
}
