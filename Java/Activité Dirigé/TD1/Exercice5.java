import java.util.*;

/**
 * Sujet de l'exercice : 
 * Écrivez un programme Java qui prend un nombre en entrée et affiche sa table de multiplication jusqu’à 10.
 * 
 * Exemple :
 * Entrer un nombre : 5
 * 
 * Sortie prévue :
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * 5 x 4 = 20
 * 5 x 5 = 25
 * 5 x 6 = 30
 * 5 x 7 = 35
 * 5 x 8 = 40
 * 5 x 9 = 45
 * 5 x 10 = 50
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer un nombre : ");
        int nombre = scanner.nextInt();
        
        scanner.close();
        
        for (int i = 1; i < 11; i++) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        } 
    }
}
