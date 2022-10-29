/**
 * @author Gokalp on 10/7/22
 */public class Main {
     public static void main(String[] args) {
          /*
          int num1 = 10;
          int num2 = 20;

          num1 = num2;
          num2 = 100;

          System.out.println(num1);


          int[] nums = {1, 2, 3};
          int[] nums1 = {10, 20, 30};

          nums=nums1;

          nums1[0]=1000;
          System.out.println(nums[0]);

          System.out.println("***********************");
          CreditManagerr creditManager = new CreditManagerr();
          creditManager.calculate();
          creditManager.save();

          Customer customer = new Customer();
          customer.setId(1);
          customer.setCity("Ankara");


          Company company = new Company();
          company.setTaxNumber("100");
          company.setCompanyName("OutplayDigital");
          company.setId(100);

          CustomerManager customerManager1 = new CustomerManager(new Person());

          Person person = new Person();
          person.setFirstName("Gokalp");
          person.setLastName("Celik");
          person.setNationalIdentity("123");

          Customer c1 = new Customer();
          Customer c2 = new Person();
          Customer c3 = new Company();

          CustomerManager customerManager = new CustomerManager(customer);
          customerManager.save();
          customerManager.delete();
          */

          CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
          customerManager.giveCredit();

     }
}
