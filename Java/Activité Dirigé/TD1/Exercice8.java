import java.util.*;

/**
 * Sujet de l'exercice : 
 * Écrivez un programme Java pour permuter deux variables.
 * 
 * Exemple :
 * a = 1
 * b = 2
 * 
 * Sortie prévue :
 * Avant l’échange : a = 1, b = 2
 * Après l’échange : a = 2, b = 1
 */

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        
        System.out.println("Avant l'échange : a = " + a + ", b = " + b);
        
        c = a;
        a = b;
        b = c;
        
        // XOR swap algorithm
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        
        System.out.println("Après l'échange : a = " + a + ", b = " + b);
    }
}
