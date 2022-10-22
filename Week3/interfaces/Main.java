package interfaces;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();

        //iCustomerDal customerDal=new MysqlCustomerDal();
        //customerDal.add();
    }
}
