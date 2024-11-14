<?php session_start(); ?>

<form method="post">
    <input name="username" type="text" placeholder="Nom d'utilisateur">
    <input name="password" type="password" placeholder="Mot de passe">
    <input name="submit" type="submit" value="Login">
</form>

<?php
if (isset($_POST['submit'])) {
    $logins = [
        ['username' => 'Alice', 'password' => '123'],
        ['username' => 'Bob', 'password' => '321'],
    ];
    $username = $_POST['username'];
    $password = $_POST['password'];

    foreach ($logins as $login) {
        if ($login['username'] === $username && $login['password'] === $password) {
            $_SESSION['username'] = $username;
            header("location:index.php");
        }
    }
        echo "<span style='color:red'>Connexion invalide</span>";
}
?>
