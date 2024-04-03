package common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {
    private final Account user;
    private List<Product> products;

    public Cart() {
        this.user = null; // Or provide a default user
        this.products = new ArrayList<>();
    }

    public Cart(Account user, ArrayList<Product> products) {
        this.products = products;
        this.user = user;

    }

    public Account getUser() {
        return user;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getId().equals(productId));
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        StringBuilder cartBuilder = new StringBuilder();
        cartBuilder.append("Cart: ").append(user).append(" Products: ");
        for (Product product : products) {
            cartBuilder.append("\n").append(product);
        }
        return cartBuilder.toString();
    }
}
