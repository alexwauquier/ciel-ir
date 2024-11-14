let jour = "Mercredi";  // Jour actuel
let estEtudiant = true;  // Statut de l'utilisateur
let plat, prix;

switch (jour) {
    case "Lundi":
        plat = "Pizza";
        prix = 10;

        if (estEtudiant) {
            prix = prix * 0.8;
        }
        break;
    case "Mardi":
        plat = "Pasta";
        prix = 8;

        if (estEtudiant) {
            prix = prix * 0.8;
        }
        break;
    case "Mercredi":
        plat = "Burger";
        prix = 9;

        if (estEtudiant) {
            prix = prix * 0.8;
        }
        break;
    case "Jeudi":
        plat = "Salade";
        prix = 7;

        if (estEtudiant) {
            prix = prix * 0.8;
        }
        break;
    case "Vendredi":
        plat = "Poisson";
        prix = 12;

        if (estEtudiant) {
            prix = prix * 0.8;
        }
        break;
    case "Samedi":
    case "Dimanche":
        plat = "Spécial Week-end";
        prix = 15;

        if (estEtudiant) {
            prix = prix * 0.8;
        }
        break;
    default:
        console.log("Jour invalide");
        break;
}

console.log(plat + " : " + prix + "€")
