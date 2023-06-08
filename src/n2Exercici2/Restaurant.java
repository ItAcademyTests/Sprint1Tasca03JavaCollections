package n2Exercici2;

import java.util.Comparator;

public class Restaurant implements Comparable<Restaurant>, Comparator<Restaurant> {

    private String nom;
    private int puntuacio;

    public Restaurant() {
    }

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + nom + '\'' +
                ", puntuacio=" + puntuacio +
                '}';
    }

    @Override
    public int compareTo(Restaurant o) {
        return this.puntuacio - o.puntuacio;
    }

    @Override
    public int compare(Restaurant o1, Restaurant o2) {
        var descripcioA = o1.getNom();
        var descripcioB = o2.getNom();
        return descripcioA.compareTo(descripcioB);
    }
}
