package common;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.table.DefaultTableModel;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SetJTable {
    public DefaultTableModel setTable() {
        try {
            // Read the Gson file
            String content = new String(Files.readAllBytes(Paths.get("res/products.json")));

            // Parse the Gson file into a list of Product objects
            Gson gson = new Gson();
            Type type = new TypeToken<ProductData>() {
            }.getType();
            ProductData productData = gson.fromJson(content, type);
            List<ProductData.Product> productList = productData.getData().getProductList();

            Object[][] mod = new Object[productList.size()][5];

            for (int x = 0; x < productList.size(); x++) {
                ProductData.Product product = productList.get(x);
                mod[x][0] = product.getId();
                mod[x][1] = product.getName();
                mod[x][2] = product.getPrice();
                mod[x][3] = product.getStatus();
                mod[x][4] = product.getQuantity();
            }

            DefaultTableModel model = new DefaultTableModel(
                    mod,
                    new String[]{
                            "Product ID", "Name", "Price", "Status", "Quantity"
                    }
            ) {
                Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean[]{
                        false, false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };

            return model;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
