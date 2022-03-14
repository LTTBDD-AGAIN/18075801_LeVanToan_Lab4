package com.example.a18075801_levantoan_lab4_listviewexample.model;

public class Item {
    private int id;
    private String name;
    private String shopName;

    public Item(int id, String name, String shopName) {
        this.id = id;
        this.name = name;
        this.shopName = shopName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
