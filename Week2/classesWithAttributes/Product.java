package classesWithAttributes;

public class Product {



    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stock;

    public Product(){
        System.out.println("Constructor");
    }

    public Product(int id, String name, String description, double price, int stock) {
        System.out.println("Constructor with parameters");
        this._id = id;
        this._name = name;
        this._description = description;
        this._price = price;
        this._stock = stock;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public int getStock() {
        return _stock;
    }

    public void setStock(int stock) {
        this._stock = stock;
    }
}
