import java.util.*;

/**
 * Sujet de l'exercice : 
 * Écrivez un programme Java qui prend trois nombres en entrée pour calculer et afficher la moyenne des nombres.
 * 
 * Exemple :
 * Entrer le premier nombre : 4
 * Entrer le deuxième nombre : 2
 * Entrer le troisième nombre : 6
 * 
 * Sortie prévue :
 * La moyenne est 4
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer le premier nombre : ");
        int nombre1 = scanner.nextInt();
        
        System.out.print("Entrer le deuxième nombre : ");
        int nombre2 = scanner.nextInt();
        
        System.out.print("Entrer le troisième nombre : ");
        int nombre3 = scanner.nextInt();
        
        scanner.close();
        
        System.out.print("La moyenne est ");
        System.out.println((nombre1 + nombre2 + nombre3) / 3);
    }
}
