#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    srand(time(NULL));

    int nombre_cache = rand() % 101;  // Valeur aléatoire entre 0 et 100.
    int nombre_essais = 0;
    int nombre_joueur;

    printf("C'est un nombre entre 1 et 100 lequel ?\n");

    /* '!=' signifie n'est pas égal à/est différent de.
     * La boucle exécute donc le programme tant que ne nombre proposé
     * par le joueur n'est pas égal au nombre caché.
     */
    while (nombre_joueur != nombre_cache)
    {
        scanf("%d", &nombre_joueur);

        nombre_essais++;
        printf("essai(s) : %d\n", nombre_essais);

        if (nombre_joueur == nombre_cache)
        {
        printf("gagne");
        }
        else
        {
            if (nombre_joueur < nombre_cache)
            {
                printf("trop petit\n");
            }
            else
            {
                printf("trop grand\n");
            }
        }
    }

    return 0;
}