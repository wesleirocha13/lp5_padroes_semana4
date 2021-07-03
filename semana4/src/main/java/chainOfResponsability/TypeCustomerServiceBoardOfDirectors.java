/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsability;

/**
 *
 * @author Weslei
 */
public class TypeCustomerServiceBoardOfDirectors implements TypeCustomerService{
    private static TypeCustomerServiceBoardOfDirectors typeCustomerServiceBoardOfDirectors = new TypeCustomerServiceBoardOfDirectors();

    private TypeCustomerServiceBoardOfDirectors() {};
    
    public static TypeCustomerServiceBoardOfDirectors getTypeCustomerServiceBoardOfDirectors() {
        return typeCustomerServiceBoardOfDirectors;
    }
}
