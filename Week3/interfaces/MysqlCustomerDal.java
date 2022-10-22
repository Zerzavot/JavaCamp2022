package interfaces;

public class MysqlCustomerDal implements iCustomerDal,iRepository{
    @Override
    public void add() {
        System.out.println("MySQL eklendi.");
    }
}
