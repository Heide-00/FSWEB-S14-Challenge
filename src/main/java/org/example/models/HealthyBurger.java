package org.example.models;

public class HealthyBurger extends Hamburger {

    private String breadRollType;
    private String meatType = "Tofu";
    private double price;

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;


    @Override
    public double getPrice() {
        double totalPrice = this.price;

        if (healthyExtra1Name != null) totalPrice += healthyExtra1Price;
        if (healthyExtra2Name != null) totalPrice += healthyExtra2Price;
        return totalPrice;
    }

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name,"Tofu",price,breadRollType);
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }


    @Override
    public double itemizeHamburger() {
        double totalPrice = this.price;

        System.out.println("\nSağlıklı Hamburger:");
        System.out.println("- Et türü       : " + meatType);
        System.out.println("- Ekmek türü    : " + breadRollType);
        System.out.println("- Baz fiyat     : $" + price);

        if (healthyExtra1Name != null) {
            System.out.println("  Ekstra 1      : " + healthyExtra1Name + " ($" + healthyExtra1Price + ")");
            totalPrice += healthyExtra1Price;
        }

        if (healthyExtra2Name != null) {
            System.out.println(" Ekstra 2      : " + healthyExtra2Name + " ($" + healthyExtra2Price + ")");
            totalPrice += healthyExtra2Price;
        }

        System.out.println(" Toplam Fiyat  : $" + totalPrice);
        return totalPrice;
    }

}