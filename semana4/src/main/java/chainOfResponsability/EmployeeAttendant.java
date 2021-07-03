package chainOfResponsability;

/**
 *
 * @author Weslei
 */
public class EmployeeAttendant extends Employee{
    
    public EmployeeAttendant(Employee upper) {
        listCustomerService.add(TypeCustomerServiceComum.getTypeCustomerServiceComum());
        setEmployeeUp(upper);
    }
    
    public String getJobDescription() {
        return "Atendente";
    }
}
