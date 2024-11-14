<?php
session_start();

if (!$_SESSION['username']) {
    header("location:login.php");
}

echo "Bienvenue " . $_SESSION['username'] . " !";
?>

<a href="logout.php">Cliquez ici</a> pour vous déconnecter.
