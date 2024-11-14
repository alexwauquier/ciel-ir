#include <stdio.h>

int main()
{
    int i = 1;

    /* La boucle while vérifie d'abord la condition (i < 10) puis exécute son code
     * (afficher i et ajouter 1 à i) tant que la condition est vérifiée.
     */
    while (i < 10) {
        printf("%d\n", i);
        i = i + 1;
    }

    return 0;
}