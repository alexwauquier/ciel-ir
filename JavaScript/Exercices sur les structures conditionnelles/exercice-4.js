let premierNombre = 10;
let deuxiemeNombre = 20;
let operateur = '+';

switch (operateur) {
    case '+':
        console.log(premierNombre + deuxiemeNombre)
        break;
    case '-':
        console.log(premierNombre - deuxiemeNombre)
        break;
    case '*':
        console.log(premierNombre * deuxiemeNombre)
        break;
    case '/':
        console.log(premierNombre / deuxiemeNombre)
        break;
    default:
        console.log("Opérateur invalide.");
        break;
}
