#include <stdio.h>
#define NB_VAL 5  // Permet de définir une macro

int main()
{
    int ligne;
    int colonne;

    // Boucle extérieure pour les lignes
    for (ligne = 0; ligne < NB_VAL; ligne++) {

        // Boucle intérieure pour les colonnes
        for (colonne = 0; colonne < NB_VAL; colonne++) {
            printf("X ");
        }

        printf("\n");  // Retour à la ligne après chaque ligne complète
    }

    return 0;
}