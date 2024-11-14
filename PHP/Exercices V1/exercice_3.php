<?php
$students = [
    [
        'ins' => 1230,
        'fname' => 'ALLON',
        'lname' => 'LEVY',
        'specialty' => 'TIN',
        'avg' => 13,
        'mention' => 'Bien'
    ],
    [
        'ins' => 1231,
        'fname' => 'BACARD',
        'lname' => 'HUGO',
        'specialty' => 'CDI',
        'avg' => 12,
        'mention' => 'A Bien'
    ],
    [
        'ins' => 4321,
        'fname' => 'BAKER',
        'lname' => 'MATTHEW',
        'specialty' => 'Informatique Pour les Sciences',
        'avg' => 17,
        'mention' => 'Très Bien'
    ]
];
?>

<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Exercice 3</title>
    </head>
    <body>
        <table border="1" width="100%">
            <tr>
                <th>INE</th>
                <th>Nom</th>
                <th>Prénom</th>
                <th>Spécialité</th>
                <th>Moyenne</th>
                <th>Mention</th>
            </tr>

            <?php
            foreach ($students as $student) {
                echo "<tr>";
                
                foreach ($student as $information) {
                    echo "<td>" . $information . "</td>";
                }

                echo "</tr>";
            }
            ?>
        </table>
    </body>
</html>
