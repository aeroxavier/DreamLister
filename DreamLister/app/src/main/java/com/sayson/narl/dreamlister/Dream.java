package com.sayson.narl.dreamlister;

/**
 * Created by Lran on 10/10/2017.
 */

public class Dream {
    private byte[] image;
    private int id;
    private String name;
    private String description;
    private String price;


    public Dream(byte[] image, int id, String name,String description, String price) {
        this.image = image;
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;

    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
