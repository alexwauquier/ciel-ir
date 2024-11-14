let bibliotheque = [];

// Fonction ajouterLivre
function ajouterLivre(titre, description) {
    let date = new Date();
    let year = date.getFullYear();
    let month = date.getMonth();
    let day = date.getDate();
    let id = year + "-" + month + "-" + day + "_" + titre;

    let nouveauLivre = {
        id: id,
        titre: titre,
        description: description,
    };

    bibliotheque.push(nouveauLivre);
}

// Fonction supprimmerLivre
function supprimerLivre(id) {
    bibliotheque = bibliotheque.filter(livre => livre.id !== id);
}

// Fonction afficherBibliotheque
function afficherBibliotheque() {
    bibliotheque.forEach(livre => {
        console.log(livre);
    });
}


// TESTS
if (require.main === module) {
    ajouterLivre("L'Odyssée", "Poème de Homère");
    ajouterLivre("Hamlet", "William Shakespeare");
    ajouterLivre("L'Iliade", "Poème de Homère");

    console.log("La bibliothèque comporte les livres suivants :");
    afficherBibliotheque();

    console.log("\n\nSuppression du livre : " + bibliotheque[0].titre);
    supprimerLivre(bibliotheque[0].id);

    afficherBibliotheque();
}
