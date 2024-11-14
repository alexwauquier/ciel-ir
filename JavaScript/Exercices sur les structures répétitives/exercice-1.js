let notes = [20, 10, 12, 16, 18, 13];
let somme = 0;
let moyenne = 0;

for (let i = 0; i < notes.length; i++) {
    somme = somme + notes[i];
}

moyenne = somme / notes.length;

console.log(moyenne)
