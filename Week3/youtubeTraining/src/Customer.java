public class Customer {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public Customer() {
        System.out.println("Constructor of the Customer");
    }

    public Customer(int id, String city) {
        this.id = id;
        this.city = city;
    }

}
