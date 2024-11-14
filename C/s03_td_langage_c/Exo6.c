#include <stdio.h>

int main()
{
    int nombre;
    int est_pair;

    printf("Entrez un nombre : ");
    scanf("%d", &nombre);
    getchar();

    est_pair = nombre % 2;

    if (est_pair == 0)
    {
        printf("1");  // Nombre pair
    }
    else
    {
        printf("0");  // Nombre impaire
    }

    return 0;
}