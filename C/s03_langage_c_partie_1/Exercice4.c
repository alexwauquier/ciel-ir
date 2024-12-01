#include <stdio.h>
#include <windows.h>

int main()
{
    SetConsoleOutputCP(65001);
    
    int user_input;

    printf("En C vous vous considerez comme :\n");
    printf("1. excellent\n2. bon\n3. moyen\n4. mauvais\n5. horrible\n");
    scanf("%d", &user_input);

    switch(user_input)
    {
        case 1:
            printf("Bravo ! Continuez à pratiquer pour rester au top de vos compétences.\n");
            break;
        case 2:
            printf("Super ! Vous pourriez approfondir vos connaissances avec des projets avancés ou des algorithmes complexes.\n");
            break;
        case 3:
            printf("Pas mal ! Essayez d'améliorer vos bases en travaillant sur des exercices pratiques.\n");
            break;
        case 4:
            printf("Pas de souci, tout le monde commence quelque part ! Suivez un tutoriel ou un cours pour vous améliorer.\n");
            break;
        case 5:
            printf("Ne vous découragez pas ! Commencez par apprendre les bases avec un guide pour débutants.\n");
            break;
        default:
            printf("Mausaise valeur\n");
            break;
    }

    return 0;
}
