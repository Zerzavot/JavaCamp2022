package classesWithAttributes;

public class Main {
    public static void main(String[] args) {

        Product product=new Product();
        product.setName("Notebook");
        product.setId(1);
        product.setDescription("Asus Zenbook");
        product.setPrice(13000);
        product.setStock(4);

        ProductManager productManager=new ProductManager();
        productManager.add(product);
        System.out.println(product.getDescription());

        Product product2=new Product(2,"Laptop","Lenovo Thinkpad",12000,6);


        productManager.add(product2);
        System.out.println(product2.getDescription());
    }
}
