/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Student
 */
public class Ingredient {
    private String name;
    private int selfPrice;

    public Ingredient(String name, int selfPrice) {
        this.name = name;
        this.selfPrice = selfPrice;
    }

    public String getName() {
        return name;
    }

    public int getSelfPrice() {
        return selfPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSelfPrice(int selfPrice) {
        this.selfPrice = selfPrice;
    }
    
}
