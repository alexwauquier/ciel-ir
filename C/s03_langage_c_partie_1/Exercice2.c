#include <stdio.h>
#include <time.h>

int main()
{
    srand(time(NULL));
    int r = rand() % 2;

    printf("Choisissez pile ou face puis lancer\n");
    printf("Appuyer sur une touche pour continuer...");
    getchar();

    printf("%d", r);

    return 0;
}
