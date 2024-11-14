<?php
$students = [
    [
        'ine' => 1231,
        'nom' => 'Alice',
        'matieres' => ['math' => 12, 'fr' => 14, 'info' => 17]
    ],
    [
        'ine' => 1232,
        'nom' => 'Bob',
        'matieres' => ['math' => 19, 'fr' => 10, 'info' => 11]
    ],
    [
        'ine' => 1233,
        'nom' => 'Mallory',
        'matieres' => ['math' => 17, 'fr' => 19, 'info' => 13]
    ]
];

function getMention($avg) {
    if ($avg < 10) $mention = "Faible";
    elseif ($avg < 12) $mention = "Passable";
    elseif ($avg < 14) $mention = "Bien";
    else $mention = "Très bien";

    return $mention;
}

function getAvg($ine) {
    $students = $GLOBALS["students"];
    $msg = 'L\'étudiant(e) n\'existe pas !';
    $result = '';

    foreach ($students as $student) {
        if ($student['ine'] == $ine) {
            $result = round(array_sum($student['matieres']) / count($student['matieres']));
            $msg = 'L\'étudiant a une moyenne de ' . $result . '/20. Mention ' . getMention($result);
        }
    }

    return $msg;
}
?>

<form method="post">
    INE : <input type="text" name="ine">
    <input type="submit" name="submit" />
</form>

<?php
if (isset($_POST["submit"])) {
    $ine = $_POST['ine'];

    if (empty($ine)) {
        echo "Veuillez entrer l'INE de l'étudiant";
    } else {
        echo (getAvg($ine));
    }
}
?>
