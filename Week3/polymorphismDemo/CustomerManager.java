package polymorphismDemo;

public class CustomerManager {
    private BaseLogger _baseLogger;

    public CustomerManager(BaseLogger baseLogger){
        this._baseLogger=baseLogger;
    }
    public void add(){
        System.out.println("Customer added");
        _baseLogger.log("Inside of add method");
    }
}
