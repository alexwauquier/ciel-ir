import java.util.*;

/**
 * Sujet de l'exercice : 
 * Écrivez une méthode qui calcule la factorielle d’un nombre donné.
 * 
 * Le factoriel est le produit de tous les entiers positifs inférieurs ou égaux à n.
 * 
 * Exemple :
 * n = 3
 * 
 * Sortie prévue :
 * 6
 */

public class Main {
    public static int factorial(int n) {
        for (int i = n-1; i > 0; i--) {
            n = n * i;
        }
        
        return n;
    }
    
    public static void main(String[] args) {
        int f = factorial(3);
        System.out.print(f);
    }
}
