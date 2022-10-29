/**
 * @author Gokalp on 10/7/22
 */
public class CustomerManager {
    private Customer customer;
    private CreditManager creditManager;


    public CustomerManager(Customer customer, CreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void save() {
        System.out.println("Customer saved:" );
    }

    public void delete() {
        System.out.println("Customer deleted:");
    }

    public void giveCredit() {
        creditManager.calculate();
        System.out.println("Credit given");
    }
}
