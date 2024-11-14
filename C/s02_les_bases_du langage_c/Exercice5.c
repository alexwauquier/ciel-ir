#include <stdio.h>
#include <windows.h>

int main()
{
    SetConsoleOutputCP(65001);

    char let;

    printf("Entrer un caractère : ");
    scanf("%c", &let);  // Lit un caractère et le stocke dans 'let'
    getchar();  // Permet de corriger le problème avec la touche 'entrée'

    printf("Votre caractère est %c", let);

    return 0;
}