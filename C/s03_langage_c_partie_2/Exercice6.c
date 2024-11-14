#include <stdio.h>
#include <windows.h>
#define LONGUEUR 8  // Définit une longueur constante pour le tableau

int main() 
{
    SetConsoleOutputCP(65001);

    int somme = 0;
    float moyenne_olympique = 0.0;
    int tab[LONGUEUR];

    // Saisie des valeurs dans le tableau
    printf("Saisissez 8 valeurs entières :\n");
    for (int i = 0; i < LONGUEUR; i++) {
        printf("Valeur %d : ", i + 1);
        scanf("%d", &tab[i]);
    }

    int min = tab[0];
    int max = tab[0];

    // Calcul de la somme des valeurs du tableau et recherche des valeurs minimales et maximales
    for (int i = 0; i < LONGUEUR; i++) {
        if (tab[i] < min) {
            min = tab[i];
        } else if (tab[i] > max) {
            max = tab[i];
        }
        somme += tab[i];
    }

    moyenne_olympique = (float)(somme - min - max) / (float)(LONGUEUR - 2);
    // (float) permet de forcer la conversion en nombre à virgule

    printf("La moyenne olympique est : %.2f", moyenne_olympique);

    return 0;
}