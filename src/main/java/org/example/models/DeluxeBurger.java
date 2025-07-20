package org.example.models;

public class DeluxeBurger extends Hamburger{
private String cips;
private String drink;
private double price;

    public DeluxeBurger() {
        super("Deluxe","Beef",19.10,"White");
        this.cips = "CURVY";
        this.drink = "COKE";
        this.price=19.10;
    }

    @Override
    public void addExtra(String item){
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addSauce(String sauce){
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    public double getPrice() {
        return price;
    }
}
