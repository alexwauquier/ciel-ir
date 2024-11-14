let lecturesTemperature = [
    [21, 23, 25, 22, 20, 19],  // Capteur 1
    [26, 28, 22, 21, 20, 19],  // Capteur 2
    [18, 17, 23, 22, 21, 20]   // Capteur 3
];

// Boucle qui parcourt l'ensemble des capteurs
for (let capteur = 0; capteur < lecturesTemperature.length; capteur++) {
    // Boucle qui parcourt l'ensemble des températures de chaque capteur
    for (let temperature = 0; temperature < lecturesTemperature.length; temperature++) {
        if (lecturesTemperature[capteur][temperature] <= 18 || lecturesTemperature[capteur][temperature] >= 25) {
            console.log("Alerte capteur n°" , capteur + 1 , "\tLa température est de" , lecturesTemperature[capteur][temperature]);
        }
    }
}
