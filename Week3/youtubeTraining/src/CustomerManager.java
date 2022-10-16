public class CustomerManager {
    private Customer customer;
    private CreditManager creditManager;


    public CustomerManager(Customer customer, CreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager; //interface
    }

    public void save() {
        System.out.println("Customer saved: " + customer.getId());
    }

    public void delete() {
        System.out.println("Customer deleted:");
    }

    public void giveCredit() {
        creditManager.calculate();
        System.out.println("Credit given");
    }
}
