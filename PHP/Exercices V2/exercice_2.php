<form method="post">
    <input type="text" name="name" placeholder="Entrez votre nom"><br><br>
    <input type="text" name="age" placeholder="Entrez votre âge"><br><br>
    <input type="text" name="email" placeholder="Entrez votre email"><br><br>
    <input type="submit" name="submit" value="Ajouter">
</form>

<?php
if (isset($_POST['submit'])) {
    $name = $_POST['name'];
    $age = $_POST['age'];
    $email = $_POST['email'];
    
    if (!empty($name) && !empty($age) && !empty($email)) {
        echo "<strong style='color:green;'>Les données ont bien été envoyées !</strong>";
    } else {
        echo "<strong style='color:red;'>Veuillez remplir tous les champs !<strong>";
    }
}
?>
