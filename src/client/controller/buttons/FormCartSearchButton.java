package client.controller.buttons;

import client.view.form.FormCart;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import static server.model.ParseGson.searchProductInUserCartClient;

public class FormCartSearchButton implements ActionListener {
    private FormCart formCart;
    public FormCartSearchButton(FormCart formCart){
        this.formCart = formCart;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = formCart.returnName();
        String username = formCart.returnName();
        List<JsonObject> matchingProducts = searchProductInUserCartClient(username, name);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(matchingProducts));

    }
}
