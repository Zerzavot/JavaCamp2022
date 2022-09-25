package oop1;

public class Main {
    public static void main(String[] args) {
        String message="maturity value";

        Product product1= new Product();
        product1.setName("Delonghi");
        product1.setUnitPrice(4500);
        // set value
        /*
        product1.name="Delonghi Coffee Machine";
        product1.unitPrice=7500;
        product1.discount=7;
        product1.unitsInStock=3;
        product1.imageUrl="coffeemachine102.jpg";
        // get value
        //System.out.println(product1.name);
        */

        Product product2= new Product();
        product2.setName("Siemens");
        product2.setUnitPrice(1200);
        /*
        product2.name="Siemens Coffee Machine";
        product2.unitPrice=1200;
        product2.discount=14;
        product2.unitsInStock=45;
        product2.imageUrl="coffeemachine103.jpg";
        */

        Product product3= new Product();
        product3.setName("Beko");
        product3.setUnitPrice(9500);
        /*
        product3.name="Beko Coffee Machine";
        product3.unitPrice=9500;
        product3.discount=24;
        product3.unitsInStock=5;
        product3.imageUrl="coffeemachine104.jpg";
        */



        Product[] products={product1,product2,product3};

        for (Product product:products) {
            //System.out.println(product.name);
            //System.out.println(product.unitPrice);
            System.out.println(product.getName());
            System.out.println(product.getUnitPrice());
        }


        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(232);
        individualCustomer.setCustomerNumber("726354");
        individualCustomer.setFirstName("Ali");



        System.out.println(individualCustomer.getCustomerNumber());
        System.out.println(individualCustomer.getFirstName());

    }
}