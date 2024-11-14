#include <stdio.h>
#include <windows.h>

int main()
{
    SetConsoleOutputCP(65001);

    int premier_nombre;
    int deuxieme_nombre;

    printf("Quel est votre premier entier ?\n");
    scanf("%d", &premier_nombre);
    getchar();

    printf("Quel est votre deuxième entier ?\n");
    scanf("%d", &deuxieme_nombre);
    getchar();

    if (premier_nombre < deuxieme_nombre)
    {
        printf("%d\n", premier_nombre);
        printf("%d\n", deuxieme_nombre);
    }
    else
    {
        printf("%d\n", deuxieme_nombre);
        printf("%d\n", premier_nombre);
    }

    return 0;
}