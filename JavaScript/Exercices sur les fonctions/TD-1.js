// Fonction addition
function addition(premierNombre, deuxiemeNombre) {
    if (typeof premierNombre !== "number" || typeof deuxiemeNombre !== "number") {
        return false;
    }

    return premierNombre + deuxiemeNombre;
}

// Fonction soustraction
function soustraction(premierNombre, deuxiemeNombre) {
    if (typeof premierNombre !== "number" || typeof deuxiemeNombre !== "number") {
        return false;
    }

    return premierNombre - deuxiemeNombre;
}

// Fonction multiplication
function multiplication(premierNombre, deuxiemeNombre) {
    if (typeof premierNombre !== "number" || typeof deuxiemeNombre !== "number") {
        return false;
    }

    return premierNombre * deuxiemeNombre;
}

// Fonction division
function division(premierNombre, deuxiemeNombre) {
    if (typeof premierNombre !== "number" || typeof deuxiemeNombre !== "number") {
        return false;
    }

    if (deuxiemeNombre === 0) {
        return false;
    }

    return premierNombre / deuxiemeNombre;
}


// TESTS
if (require.main === module) {
    console.log(addition(10, "20"));
    console.log(addition(10, 20));

    console.log(soustraction(20, 10));
    console.log(soustraction("20", 10));

    console.log(multiplication(5, "5"));
    console.log(multiplication(5, 5));

    console.log(division("9", 3));
    console.log(division(9, 0));
    console.log(division(9, 3));
}
