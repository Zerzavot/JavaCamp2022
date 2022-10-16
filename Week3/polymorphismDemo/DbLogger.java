package polymorphismDemo;

public class DbLogger extends BaseLogger{
    @Override
    public void log(String message){
        System.out.println("Logged to db: "+message);
    }
}
