import java.lang.Math;
import java.util.*;

/**
 * Sujet de l'exercice : 
 * Écrivez un programme Java pour afficher l’aire et le périmètre d’un cercle.
 * 
 * Exemple :
 * Rayon = 4.2
 * 
 * Sortie prévue :
 * Le périmètre est = 26.389378290154262
 * L’aire est = 55.41769440932395
 */

public class Main {
    public static void calculer_aire_per(double rayon) {
        System.out.println("Le périmètre est = " + (2 * Math.PI * rayon));
        System.out.println("L'aire est = " + (Math.PI * Math.pow(rayon, 2)));
    }
    
    public static void main(String[] args) {
        calculer_aire_per(4.2);
    }
}
