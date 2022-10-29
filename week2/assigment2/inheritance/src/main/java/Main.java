/**
 * @author Gokalp on 10/1/22
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        customer.firstName = "";
        employee.firstName = "";

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.bestEmployee();
    }
}
