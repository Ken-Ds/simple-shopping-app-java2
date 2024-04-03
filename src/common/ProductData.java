package common;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ProductData {
    @SerializedName("data")
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        @SerializedName("product")
        private List<Product> productList;

        public List<Product> getProductList() {
            return productList;
        }

        public void setProductList(List<Product> productList) {
            this.productList = productList;
        }
    }

    public static class Product {
        @SerializedName("id")
        private String id;

        @SerializedName("name")
        private String name;

        @SerializedName("price")
        private String price;

        @SerializedName("description")
        private String description;

        @SerializedName("status")
        private String status;
        @SerializedName("quantity")
        private String quantity;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getStatus() {
            return status;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }
}
