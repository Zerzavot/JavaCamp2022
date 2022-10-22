package abstractDemo2;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data came from Sql Server");
    }
}
