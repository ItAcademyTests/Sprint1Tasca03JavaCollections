package n3Exercici1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static Persona persona = new Persona();
    public static List<Persona> persones = new ArrayList<>();


    public static void main(String[] args) {

        llegirFicherTxtPersona();

        int opcio;
        do {
            opcio = persona.menu();
            switch (opcio) {
                case 1:
                    IntroduirPersona();
                    break;
                case 2:
                    mostrarPersonesPerNomAscendent();
                    break;
                case 3:
                    mostrarPersonesPerNomDescendent();
                    break;
                case 4:
                    mostrarPersonesPerCognomAscendent();
                    break;
                case 5:
                    mostrarPersonesPerCognomDescendent();
                    break;
                case 6:
                    mostrarPersonesPerDniAscendent();
                    break;
                case 7:
                    mostrarPersonesPerDniDescendent();
                    break;
                case 0:
                    System.out.println("¡Adeu!");
                    break;
                default:
                    System.out.println("Opció no válida");
            }
            System.out.println();
        } while (opcio != 7);

    }

    private static List<Persona> llegirFicherTxtPersona() {
        String file = "src/n3Exercici1/Persona.txt";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                var persona = line.split(" ");
                if (line.equals("")) {
                    break;
                }
                var novaPersona = new Persona(persona[0], persona[1], persona[2]);
                persones.add(novaPersona);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return persones;
    }

    private static void IntroduirPersona() {

    }

    private static void mostrarPersonesPerNomAscendent() {
        Collections.sort(persones, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                var nom1 = o1.getNom();
                var nom2 = o2.getNom();
                return nom1.compareTo(nom2);
            }
        });
        for (Persona p : persones) {
            System.out.println(p);
        }
    }

    private static void mostrarPersonesPerNomDescendent() {
        Collections.sort(persones, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                var nom1 = o1.getNom();
                var nom2 = o2.getNom();
                return nom2.compareTo(nom1); // Ordre descendent
            }
        });
        for (Persona p : persones) {
            System.out.println(p);
        }
    }

    private static void mostrarPersonesPerCognomAscendent() {
        Collections.sort(persones, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                var cognom1 = o1.getCognom();
                var cognom2 = o2.getCognom();
                return cognom1.compareTo(cognom2); // Ordre descendent
            }
        });
        for (Persona p : persones) {
            System.out.println(p);

        }
    }

    private static void mostrarPersonesPerCognomDescendent() {
        Collections.sort(persones, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                var cognom1 = o1.getCognom();
                var cognom2 = o2.getCognom();
                return cognom2.compareTo(cognom1); // Ordre descendent
            }
        });
        for (Persona p : persones) {
            System.out.println(p);
        }
    }

    private static void mostrarPersonesPerDniAscendent() {
        Collections.sort(persones, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                var dni1 = o1.getDNI();
                var dni2 = o2.getDNI();
                return dni1.compareTo(dni2); // Ordre descendent
            }
        });
        for (Persona p : persones) {
            System.out.println(p);
        }
    }

    private static void mostrarPersonesPerDniDescendent() {
        Collections.sort(persones, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                var dni1 = o1.getDNI();
                var dni2 = o2.getDNI();
                return dni2.compareTo(dni1); // Ordre descendent
            }
        });
        for (Persona p : persones) {
            System.out.println(p);
        }
    }

}
