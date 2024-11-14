let tab = [[75, 80, 85], [90, 95, 100], [60, 65, 70]];
let somme = 0;
let moyenne = 0;

for (let eleve = 0; eleve < tab.length; eleve++) {
    for(let note = 0; note < tab[eleve].length; note++){
        somme = somme + tab[eleve][note];
    }
    // tab.length permet d'obtenir le nombre d'éléments dans le tableau
    // tab[eleve].length permet d'obtenir le nombre d'éléments dans le sous-tableau d'indice 'eleve'
    // tab[eleve][note] permet d'obtenir l'élément dans le sous-tableau d'indice 'eleve' à l'indice 'note'

    moyenne = somme / tab[eleve].length;

    if (moyenne >= 0 && moyenne < 60) {
        console.log("L'élève n°", eleve + 1, "a", moyenne, "de moyenne. Note : E");
    } else if (moyenne >= 60 && moyenne <= 69) {
        console.log("L'élève n°", eleve + 1, "a", moyenne, "de moyenne. Note : D");
    } else if (moyenne >= 70 && moyenne <= 79) {
        console.log("L'élève n°", eleve + 1, "a", moyenne, "de moyenne. Note : C");
    } else if (moyenne >= 80 && moyenne <= 89) {
        console.log("L'élève n°", eleve + 1, "a", moyenne, "de moyenne. Note : B");
    } else if (moyenne >= 90 && moyenne <= 100) {
        console.log("L'élève n°", eleve + 1, "a", moyenne, "de moyenne. Note : A");
    } else {
        console.log("Moyenne invalide.")
    }

    somme = 0;
    moyenne = 0;
}
