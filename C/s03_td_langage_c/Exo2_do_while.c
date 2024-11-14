#include <stdio.h>

int main()
{
    int i = 1;
    i = 10;

    printf("\n");

    /* La boucle do while exécute d'abord son code (afficher i et l'incrémenter) 
     * et après vérifie la condition (i < 21).
     */
    do {
        printf("%d\n", i);
        i++;
    } while (i < 21);

    return 0;
}