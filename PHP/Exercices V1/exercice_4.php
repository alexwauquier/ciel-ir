<?php
function checkNb($nb) {
    if ($nb % 3 === 0 && $nb % 5 === 0) {
        echo "$nb est multiple de 3 et de 5 <br />";
    } else {
        echo "$nb n'est pas multiple de 3 et de 5 <br />";
    }
}

checkNb(123);
?>
