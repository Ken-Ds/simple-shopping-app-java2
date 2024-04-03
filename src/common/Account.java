package common;

import java.io.Serializable;

public class Account implements Serializable {

    private int id;
    private  String username;

    private String password;

    private Cart cart;

    public Account(int id, String username, String password, Cart cart) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.cart = cart;
    }
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return password;
    }

    public Cart getCart(){
        return cart;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setCart(Cart cart){
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", cart=" + cart +
                '}';
    }
}
