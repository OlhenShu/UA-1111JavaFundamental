package softserve.javacourse.rachynskyi.edu04.practicaltask.task4;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class Product {
    protected static List<Product> productList = new ArrayList<>();
    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        Product.productList.add(this);
    }

    public static void getMostExpensiveItems() {
        if (productList.size() == 0) {
            System.out.println("List of Products is empty");
        } else {
            String name = productList.get(0).name;
            double price = productList.get(0).price;
            for (Product product : productList) {
                if (price < product.price) {
                    name = product.name;
                    price = product.price;
                }
            }
            System.out.println("The most expensive product is " + name + " with price " + price + "$");
        }
    }

    public static void getItemsWithBiggestQuantity() {
        if (productList.size() == 0) {
            System.out.println("List of Products is empty");
        } else {
            String name = productList.get(0).name;
            int quantity = productList.get(0).quantity;
            for (Product product : productList) {
                if (quantity < product.quantity) {
                    name = product.name;
                    quantity = product.quantity;
                }
            }
            System.out.println("The product with biggest quantity is " + name + " with count " + quantity);
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("iPhone", 1299.99, 100);
        Product product2 = new Product("Xiaomi", 1000.00, 50);
        Product product3 = new Product("Meizu", 999.00, 60);
        Product product4 = new Product("Nokia", 1100.00, 20);
        System.out.println(productList);

        getMostExpensiveItems();
        getItemsWithBiggestQuantity();
    }
}
