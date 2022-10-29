/**
 * @author Gokalp on 10/9/22
 */public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.firstName = "";

        Employee employee = new Employee();
        employee.firstName = "";

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.bestEmployee();
        employeeManager.add();

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
    }
}
