package reCapDemoClasses;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager();
        customerManager.Add();
        customerManager.Remove();

        Transaction transaction=new Transaction();
        int result=transaction.Multiply(3,4);
        System.out.println(result);
    }
}
