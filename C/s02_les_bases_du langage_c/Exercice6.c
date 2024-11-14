#include <stdio.h>

// Fonction 'inverser' qui échange les valeurs de deux entiers via des pointeurs
void inverser(int *a, int *b)
{
    int z;

    z = *a;
    *a = *b;
    *b = z;
}

int main()
{
    int x = 10;
    int y = 20;

    printf("x : %d\ny : %d\n", x, y);
    inverser(&x, &y);  // Appel de la fonction 'inverser' en utilisant les adresses des variables x et y pour échanger leurs valeurs
    printf("x : %d\ny : %d\n", x, y);

    return 0;
}