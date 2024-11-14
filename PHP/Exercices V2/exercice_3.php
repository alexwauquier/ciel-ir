<?php
$name = $age = $email = "";
$error_name = $error_age = $error_email = "";
$msg_success = "";

if(isset($_POST['submit'])) {
    $name = $_POST['name'];
    $age = $_POST['age'];
    $email = $_POST['email'];

    if (!empty($name) && !empty($age) && !empty($email)) {
        $msg_success = "<b style='color:green'>Les données ont été envoyées !</b>";
    } else {
        $error_name = empty($name) ? "<b style='color:red'> Veuillez entrer un nom !</b>" : "";
        $error_age = empty($age) ? "<b style='color:red'> Veuillez entrer un âge !</b>" : "";
        $error_email = empty($email) ? "<b style='color:red'> Veuillez entrer un email !</b>" : "";
    }
}
?>

<form method=post>
    <table>
        <tr>
            <td>Nom</td>
            <td><input type="text" name="name" value="<?= $name; ?>"><?= $error_name; ?></td>
        </tr>
        <tr>
            <td>Âge</td>
            <td><input type="text" name="age" value="<?= $age; ?>"><?= $error_age; ?></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" value="<?= $email; ?>"><?= $error_email; ?></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="submit" value="Ajouter"></td>
        </tr>
    </table>
</form>

<?= $msg_success; ?>
