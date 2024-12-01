#include <stdio.h>

int main()
{
    int f;
    int x;

    printf("Entrer la valeur de x : ");
    scanf("%d", &x);

    f = (2*x + 3) * (3*x*x + 2);
    printf("L'image de %d par la fonction f est %d", x, f);

    return 0;
}
