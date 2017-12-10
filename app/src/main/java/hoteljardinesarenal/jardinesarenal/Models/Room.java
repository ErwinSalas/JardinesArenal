package hoteljardinesarenal.jardinesarenal.Models;

import android.graphics.drawable.Drawable;

public class Room {
    private String name,description;
    private int maxPersons,price;
    private Drawable photo;

    public Room() {
    }

    public Room(String name, String description, int maxPersons, int price, Drawable photo) {
        this.name = name;
        this.description = description;
        this.maxPersons = maxPersons;
        this.price = price;
        this.photo = photo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public Room(String name, String description, int maxPersons) {
        this.name = name;
        this.description = description;
        this.maxPersons = maxPersons;
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

    public int getMaxPersons() {
        return maxPersons;
    }

    public void setMaxPersons(int maxPersons) {
        this.maxPersons = maxPersons;
    }
}
