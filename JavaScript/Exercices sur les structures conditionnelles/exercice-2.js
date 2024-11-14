let note = 50;

if (note >= 0 && note <= 50) {
    console.log("Insuffisant");
} else if (note >= 51 && note <= 70) {
    console.log("Suffisant");
} else if (note >= 71 && note <= 90) {
    console.log("Bien");
} else if (note >= 91 && note <= 100) {
    console.log("Excellent");
} else {
    console.log("Note invalide");
}
