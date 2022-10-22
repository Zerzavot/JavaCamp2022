package interfaces;

public class CustomerManager {

    private iCustomerDal customerDal;

    public CustomerManager(iCustomerDal customerDal){
        this.customerDal=customerDal;
    }

    public void add(){
        //is kodlari
        // add icinde parametre gonderilir

        customerDal.add();
    }
}
