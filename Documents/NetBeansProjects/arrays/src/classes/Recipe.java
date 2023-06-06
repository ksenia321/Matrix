/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Student
 */
public class Recipe {
    private Ingredient[] ingridients;
    private Developer developer;
    private int summaryCost;

    public Recipe(Ingredient[] ingridients, Developer developer, int summaryCost) {
        this.ingridients = ingridients;
        this.developer = developer;
        this.summaryCost = summaryCost;
    }

    public Ingredient[] getIngridients() {
        return ingridients;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public int getSummaryCost() {
        return summaryCost;
    }

    public void setIngridients(Ingredient[] ingridients) {
        this.ingridients = ingridients;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public void setSummaryCost(int summaryCost) {
        this.summaryCost = summaryCost;
    }
    
    
}
