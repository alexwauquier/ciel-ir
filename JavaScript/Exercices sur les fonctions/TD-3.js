let Menu = {
    plats: [],

    // Méthode ajouterPlat
    ajouterPlat: function(nom, prix) {
        let plat = {
            id: new Date() + "_" + nom,  // Identifiant unique composé de la date et du nom du plat
            nom: nom,
            prix: prix,
            termine: false,
        };

        this.plats.push(plat);
    },

    // Méthode supprimerPlat
    supprimerPlat: function(id) {
        this.plats = this.plats.filter(plat => plat.id !== id);
    },

    // Méthode marquerPlatTermine
    marquerPlatTermine: function(id) {
        const platIndex = this.plats.findIndex(plat => plat.id === id);

        if (platIndex !== -1) {
            this.plats[platIndex].termine = true;
        }
    },

    // Méthode afficherMenu
    afficherMenu: function() {
        this.plats.forEach(plat => {
            console.log(plat);
        });
    },
};


// TESTS
if (require.main === module) {
    Menu.ajouterPlat("Boeuf Bourguignon", 20.80);
    Menu.ajouterPlat("Coq au Vin", 23.50);
    Menu.ajouterPlat("Ratatouille", 18.90);
    Menu.ajouterPlat("Magret de Canard", 29.10);

    console.log("Liste des plats disponibles : ");
    Menu.afficherMenu();

    console.log("\n\nSuppression du plat " + Menu.plats[2].nom);
    Menu.supprimerPlat(Menu.plats[2].id);

    console.log("\n\nListe des plats restants : ");
    Menu.afficherMenu();

    Menu.marquerPlatTermine(Menu.plats[0].id);
    console.log("\n\nPlat " + Menu.plats[0].nom + " est terminé");
    Menu.marquerPlatTermine(Menu.plats[1].id);
    console.log("Plat " + Menu.plats[1].nom + " est terminé");
    Menu.afficherMenu();
}
