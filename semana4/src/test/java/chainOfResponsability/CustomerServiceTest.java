package chainOfResponsability;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class CustomerServiceTest {
    
    EmployeeAttendant attendant;
    EmployeeSupervisor supervisor;
    EmployeeManager manager;

    @Before
    public void setUp() {        
        manager = new EmployeeManager(null);   
        supervisor = new EmployeeSupervisor(manager);
        attendant = new EmployeeAttendant(supervisor);                 
    }

    @Test
    public void mustReturnAttendantForCommonService() {
        assertEquals("Atendente", attendant.serveCustomer(new CustomerService(TypeCustomerServiceComum.getTypeCustomerServiceComum())));
    }
    
    @Test
    public void mustReturnSupervisorForOperationalService() {
        assertEquals("Supervisor", attendant.serveCustomer(new CustomerService(TypeCustomerServiceOperational.getTypeCustomerServiceOperational())));
    }
    
    @Test
    public void mustReturnAttendantForManagerialService() {
        assertEquals("Gerente", attendant.serveCustomer(new CustomerService(TypeCustomerServiceManagerial.getTypeCustomerServiceManagerial())));
    }
    
    @Test
    public void mustReturnWithoutServiceForBoardOfDirectorsService() {
        assertEquals("Sem atendimento", attendant.serveCustomer(new CustomerService(TypeCustomerServiceBoardOfDirectors.getTypeCustomerServiceBoardOfDirectors())));
    }
    
    
}
