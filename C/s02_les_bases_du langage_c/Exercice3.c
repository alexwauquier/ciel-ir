#include <stdio.h>
#include <windows.h>

int main()
{
    SetConsoleOutputCP(65001);

    // Déclaration et initialisation des variables
    char prenom[20] = "Bob";  
    char nom[20] = "Le Bricoleur";
    int age = 20;
    char lycee[20] = "Baggio";  // Tableau de caractères pouvant stocker 20 caractères
    
    // Affichage des informations
    printf("- Prénom : %s\n", prenom);
    printf("- Nom : %s\n", nom);
    printf("- Âge : %d\n", age);  // Affiche l'âge en récupérant la valeur dans la variable 'age'
    printf("- Lycée : %s\n", lycee);
    // '%s' pour afficher une chaîne de caractères et '%d' pour afficher un entier

    return 0;
}