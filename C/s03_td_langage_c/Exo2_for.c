#include <stdio.h>

int main()
{
    int i = 1;

    /* La boucle for initie la valeur de i à 5 puis exécute son code tant que
     * i est inférieur à 16 et incrémente la valeur de i à chaque fin de tour.
     */
    for (i = 5; i < 16; i++) {
        printf("%d\n", i);
    }

    return 0;
}
