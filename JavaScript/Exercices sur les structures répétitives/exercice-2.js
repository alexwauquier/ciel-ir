let nombreJour = 30;
let ligneSemaine = "";

for (let jour = 1; jour <= nombreJour; jour++) {
    if (jour % 7 == 0) {
        ligneSemaine = ligneSemaine + jour + "\n";
        console.log(ligneSemaine);
        ligneSemaine = "";
    } else {
        ligneSemaine = ligneSemaine + jour + "\t";
    }
}
