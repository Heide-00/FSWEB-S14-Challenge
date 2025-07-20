package org.example.models;

public class Burger {

    private String name;

    public Burger(String name){
        this.name=name;
    }

    public void itemizeHamburger(){

    }

    public String getName() {
        return name;
    }

    public void addExtra(String item){
        System.out.println(item + " eklendi.");
    }

    public void addSauce(String sauce){
        System.out.println(sauce + " sosu eklendi.");
    }
}
