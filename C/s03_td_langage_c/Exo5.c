#include <stdio.h>

int main()
{
    int premier_nombre;
    int deuxieme_nombre;
    int troisieme_nombre;

    printf("Entrez trois entiers :\n");
    scanf("%d", &premier_nombre);
    getchar();
    scanf("%d", &deuxieme_nombre);
    getchar();
    scanf("%d", &troisieme_nombre);
    getchar();

    if (premier_nombre > deuxieme_nombre && premier_nombre > troisieme_nombre)
    {
        printf("La plus grande valeur est %d.", premier_nombre);
    }
    else
    {
        if (deuxieme_nombre > troisieme_nombre)
        {
        printf("La plus grande valeur est %d.", deuxieme_nombre);
        }
        else
        {
        printf("La plus grande valeur est %d.", troisieme_nombre);
        }
    }
    
    return 0;
}