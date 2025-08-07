package com.app.introduccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Dishes with ("Coffee", "milk"): (late)
// dishes wihout ("milk", "coffee"): (limonade)

public class Solution {
    public static void main(String args[]){
        Menu menu = new Menu();
        menu.addDish(new Dish("Expresso", Arrays.asList("coffee"), 2));
        menu.addDish(new Dish("Latte", Arrays.asList("coffee", "milk"), 3));
        menu.addDish(new Dish("Chai", Arrays.asList("tea", "milk"), 5));
        menu.addDish(new Dish("Lemonade", Arrays.asList("Lemon", "sugar"), 5));

        List<String> ingredients = List.of("coffee", "milk");
        menu.printMenu(ingredients);
    }
}

class Menu {

    private List<Dish> dishes;

    public Menu(){
        dishes = new ArrayList<>();
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public List<Dish> getDishes(){
        return dishes;
    }

    public void printMenu(List<String> ingredients){
        for(Dish dish :dishes){
            dish.getIngredients().forEach( e->{
                if(ingredients.contains(e)){
                    System.out.println("Existe: " + dish.getName());
                }else{
                    System.out.println("No existe: " +  dish.getName());
                }
            });
        }
    }
}

class Dish{
    private String name;
    private List<String> ingredients;
    private int price;

    public Dish(String name, List<String> ingredients, int price){
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public Dish(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public List<String> getIngredients(){
        return this.ingredients;
    }

    public int getPrice(){
        return this.price;
    }

}

