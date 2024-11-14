<?php
$technologies = [
    "Langages" => ["PHP","JAVA","PYTHON"],
    "Framework" => ["SYMFONY","SPRING","DJANGO"],
    "Cms" => ["WORDPRESS","MAGNOLIA","MEZZANINE"]
];

foreach ($technologies as $key => $technology) {
    echo "<b>" . $key . " : </b>";

    foreach ($technology as $value) {
        echo $value . " ";
    }

    echo "<br>";
}
?>
