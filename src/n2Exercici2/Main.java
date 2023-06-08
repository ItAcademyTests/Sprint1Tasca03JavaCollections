package n2Exercici2;

import n2Exercici2.exception.ExcepcioRestaurantExistent;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static TreeSet<Restaurant> restaurants = new TreeSet<>();

    public static void main(String[] args) {

        var restaurant1 = crearRestaurant("This is the Restaurant A", 6);
        var restaurant2 = crearRestaurant("Aquest es el Restaurant B", 8);
        var restaurant3 = crearRestaurant("Este es el Restaurant C", 5);
        afegirRestaurant(restaurant1);
        afegirRestaurant(restaurant2);
        afegirRestaurant(restaurant3);

        // Imprimir los Restaurant ordenats per puntuacio
        for (Restaurant restaurant : restaurants) {
            System.out.println("Nom: " + restaurant.getNom() + ", Puntuacio: " + restaurant.getPuntuacio());
        }

        var comparadorRestaurants = new Restaurant();

        var restaurantsOrdenats = new TreeSet<>(comparadorRestaurants);
        restaurantsOrdenats.add(restaurant1);
        restaurantsOrdenats.add(restaurant2);
        restaurantsOrdenats.add(restaurant3);

        System.out.println();
        // Imprimir los Restaurant ordenats per nom
        for (Restaurant restaurant : restaurantsOrdenats) {
            System.out.println("Nom: " + restaurant.getNom() + ", Puntuacio: " + restaurant.getPuntuacio());
        }

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
            return; // Salir del método si se lanza una excepción
        }
        restaurants.add(restaurant);
    }
}
