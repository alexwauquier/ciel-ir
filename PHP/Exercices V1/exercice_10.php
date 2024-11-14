<?php
// nombre à trouver
$nb = 789;
// compteur
$coup = 0;
$x = 0;

// boucle de tirage
while ($x != $nb) {
    $x = rand(0, 1000);
    $coup++;
    //echo $x, "<br />";  // pour afficher tous les tirages
}

echo "$nb trouvé en $coup coups";
?>
