<form method="post">
    Entrez une somme <input type="text" name="somme" /><br><br>
    <input type="radio" name="devise" value="euro">Conversion en Dollar ($)<br><br>
    <input type="radio" name="devise" value="dollar">Conversion en Euro (€)<br><br>
    <input type="submit" name="submit">
</form>

<?php
if (isset($_POST['submit']) && !empty($_POST['somme']) && !empty($_POST['devise'])) {
    if ($_POST['devise'] == "dollar") {
        echo $_POST['somme'] . ' $ vaut ' . $_POST['somme'] * 0.9 . " €";
    } else {
        echo $_POST['somme'] . ' € vaut ' . $_POST['somme'] * 1.1 . " $";
    }
}
?>
