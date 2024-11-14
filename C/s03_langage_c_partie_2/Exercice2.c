#include <stdio.h>
#include <windows.h>

void Echanger(int *_min, int *_max)
{
    int aux;

    aux = *_min;
    *_min = *_max;
    *_max = aux;
}

int main()
{
    SetConsoleOutputCP(65001);

    int premier_nombre;
    int deuxieme_nombre;

    printf("Saisir deux nombres :\n");
    scanf("%d", &premier_nombre);
    scanf("%d", &deuxieme_nombre);

    if (premier_nombre > deuxieme_nombre) {
        Echanger(&premier_nombre, &deuxieme_nombre);
    }

    printf("%d est inférieur ou égal à %d", premier_nombre, deuxieme_nombre);

    return 0;
}