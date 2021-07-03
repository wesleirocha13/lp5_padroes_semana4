package chainOfResponsability;

/**
 *
 * @author Weslei
 */
public class EmployeeSupervisor extends Employee{
    public EmployeeSupervisor(Employee upper) {
        listCustomerService.add(TypeCustomerServiceOperational.getTypeCustomerServiceOperational());
        setEmployeeUp(upper);
    }
    
    public String getJobDescription() {
        return "Supervisor";
    }
}
