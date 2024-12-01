#include <stdio.h>
#include <time.h>

int main()
{
    srand(time(NULL));

    int des_1 = rand() % 6 + 1;
    int des_2 = rand() % 6 + 1;
    int result = des_1 + des_2;

    printf("Choisissez un nombre entre 2 et 12 puis lancer\n");
    printf("Appuyer sur une touche pour continuer...");
    getchar();

    printf("%d", result);

    return 0;
}
