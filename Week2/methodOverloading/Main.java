package methodOverloading;

public class Main {
    public static void main(String[] args) {
        Transactions t1=new Transactions();
        System.out.println(t1.sum(3,5));
        System.out.println(t1.sum(2,3,4));
    }

}
