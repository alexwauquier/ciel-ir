#include <stdio.h>
#include <windows.h>  // Bibliothèque contenant la fonction SetConsoleOutputCP()

int main()
{
    SetConsoleOutputCP(65001);  // Permet d'afficher correctement les lettres avec accents

    printf("\t\tL'IDE\n");  // '\t' permet de faire une tabulation et '\n' un retour à la ligne
    printf("Le compilateur est complété par un environnement de développement (IDE).\n");
    printf("- Un traitement de texte spécialisé pour le code source\n");
    printf("- Un compilateur\n");
    printf("- Un débogueur\n");

    return 0;
}