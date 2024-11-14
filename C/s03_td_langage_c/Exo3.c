#include <stdio.h>
#include <windows.h>  // Bibliothèque contenant la fonction SetConsoleOutputCP()

int main()
{
    SetConsoleOutputCP(65001);

    char car;

    printf("Entrez un caractère : ");
    scanf("%c", &car);
    getchar();

    if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u' || car == 'y')
    {
        printf("C'est une voyelle.");
    }
    else
    {
        printf("C'est une consonne.");
    }

    return 0;
}