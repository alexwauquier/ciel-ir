#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "structure.h"  // Permet d'importer le fichier structure.h

int main()
{
    T_PERSONNE joueur1;  // Déclare une variable 'joueur1' de type 'T_PERSONNE'

    printf("Entrez le prenom du joueur : ");
    scanf("%s", joueur1.prenom);

    printf("Entrez le nom du joueur : ");
    scanf("%s", joueur1.nom);

    joueur1.score = 0;

    printf("Entrez la lettre correspondant au niveau du joueur : ");

    // Boucle do-while qui s'exécute une première fois et puis s'exécute tant qu'un caractère n'est pas écrit
    do
    {
        scanf("%c", &joueur1.niveau);
    } while(joueur1.niveau == '\n');

    printf("\n%s %s\n", joueur1.prenom, joueur1.nom);
    printf("Score : %d au niveau : %c\n\n", joueur1.score, joueur1.niveau);

    return EXIT_SUCCESS;  // Équivalent à 'return 0;'
}