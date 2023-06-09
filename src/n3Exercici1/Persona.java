package n3Exercici1;

import java.util.Comparator;
import java.util.Scanner;

public class Persona implements Comparator<Persona> {

    private String nom;
    private String cognom;
    private String DNI;

    public Persona() {
    }

    public Persona(String nom, String cognom, String DNI) {
        this.nom = nom;
        this.cognom = cognom;
        this.DNI = DNI;
    }

    public int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== MENÚ =====");
        System.out.println("1.- Introduir persona.");
        System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
        System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
        System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");
        System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
        System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
        System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
        System.out.println("0.- Sortir.");
        System.out.println("Escull una opcio!");
        return sc.nextInt();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }

    @Override
    public int compare(Persona o1, Persona o2) {
        var nomA = o1.getNom();
        var nomB = o2.getNom();
        return nomA.compareTo(nomB);
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getDNI() {
        return DNI;
    }
}
