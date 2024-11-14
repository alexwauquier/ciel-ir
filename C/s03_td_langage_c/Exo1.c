#include <stdio.h>

int main()
{
    int note;

    printf("Entrez une note : ");
    scanf("%d", &note);
    getchar();

    if (note == 10)
    {
        printf("Moyenne");
    }
    else
    {
        if (note > 10)
        {
            printf("Au-dessus de la moyenne");
        }
        else
        {
            printf("En dessous de la de moyenne");
        }
    }

    return 0;
}