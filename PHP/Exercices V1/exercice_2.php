<?php
function volumeCone($radius, $height) {
    $volume = (pow($radius, 2) * pi() * $height) / 3;
    return $volume;
}

echo 'Le volume du cône est de ' . volumeCone(3, 1);
?>
