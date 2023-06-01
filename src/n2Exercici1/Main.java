package n2Exercici1;

import n2Exercici1.exception.ExcepcioRestaurantExistent;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static Set<Restaurant> restaurants = new HashSet<>();

    public static void main(String[] args) {

        var restaurant1 = crearRestaurant("Restaurant1", 5);
        var restaurant2 = crearRestaurant("Restaurant1", 5);
        afegirRestaurant(restaurant1);
        afegirRestaurant(restaurant2);

    }

    private static Restaurant crearRestaurant(String nom, int puntuacio) {
        return new Restaurant(nom, puntuacio);
    }

    private static void afegirRestaurant(Restaurant restaurant) {
        try {
            for (Restaurant r : restaurants) {
                if (r.getNom().equals(restaurant.getNom()) && r.getPuntuacio() == restaurant.getPuntuacio()) {
                    throw new ExcepcioRestaurantExistent("Ya existeix un restaurant amb aquestes dades.");
                }
            }
        } catch (ExcepcioRestaurantExistent e) {
            System.out.println("Error: " + e.getMessage());
        }
        restaurants.add(restaurant);
    }

}
