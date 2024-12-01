import java.util.*;

/**
 * Sujet de l'exercice : 
 * Écrivez un programme Java qui prend deux nombres en entrée et affichez le produit de deux nombres.
 * 
 * Exemple :
 * Entrer le premier nombre : 2
 * Entrer le deuxième nombre : 3
 * 
 * Sortie prévue :
 * 2 x 3 = 6
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer le premier nombre : ");
        int nombre1 = scanner.nextInt();
        
        System.out.print("Entrer le deuxième nombre : ");
        int nombre2 = scanner.nextInt();
        
        scanner.close();
        
        System.out.print(nombre1 + " x " + nombre2 + " = " + (nombre1 * nombre2));
    }
}
