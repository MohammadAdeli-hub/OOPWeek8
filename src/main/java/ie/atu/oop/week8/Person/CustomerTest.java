package ie.atu.oop.week8.Person;

public class CustomerTest {
    public static void main(String[] args) {
        Customer first = new Customer("Ali","Galway","098763633",2003,true);
        Customer second = new Customer();
        second.setName("Ciarean");
        second.setAddress("Loughrea");
        second.setPhoneNumber("0985973947");
        second.setCustomerNumber(2984);
        second.setMailingList(false);
        System.out.println(first);
        System.out.println(second);

    }
}
