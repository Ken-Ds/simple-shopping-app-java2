package common;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String price;
    private String description;

    private String status;


    public Product( String name, String price, String description){
        this.name = name;
        this.price = price;
        this.description =description;
    }

    public Product(String id, String name, String price, String description, String status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description =description;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}




