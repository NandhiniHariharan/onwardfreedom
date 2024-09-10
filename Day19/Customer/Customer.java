package Customer;

import Store.Product;

public class Customer {
    public static void main(String args[]){
        Product product1=new Product();
        product1.productName="Soap";
        product1.price=45;
        System.out.println("The Product Name is: "+product1.productName);
        System.out.println("The Product Price is: "+product1.price);
    }
}
