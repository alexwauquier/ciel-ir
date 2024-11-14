<h1 style="color: green;"><u>Application Quiz</u></h1>

<form method="post">
    <table border="1" width=50%>
        <tr>
            <td><img src="moose.gif" /></td>
            <td>
                <input type="radio" name="q1" value="renne">Renne</input><br/>
                <input type="radio" name="q1" value="poisson">Poisson</input><br/>
                <input type="radio" name="q1" value="lievre">Lièvre</input><br/>
                <input type="radio" name="q1" value="cheval">Cheval</input><br/>
            </td>
            </tr>
        <tr>
            <td><img src="brownhare.gif" /></td>
            <td>
                <input type="radio" name="q2" value="renne">Renne</input><br/>
                <input type="radio" name="q2" value="poisson">Poisson</input><br/>
                <input type="radio" name="q2" value="lievre">Lièvre</input><br/>
                <input type="radio" name="q2" value="cheval">Cheval</input><br/>
            </td>
        </tr>
        <tr>
            <td><img src="perch.gif" /></td>
            <td>
                <input type="radio" name="q3" value="renne">Renne</input><br/>
                <input type="radio" name="q3" value="poisson">Poisson</input><br/>
                <input type="radio" name="q3" value="lievre">Lièvre</input><br/>
                <input type="radio" name="q3" value="cheval">Cheval</input><br/>
            </td>
        </tr>
        <tr>
            <td colspan=2>
                <input type="submit" name="submit"/>
            </td>
        </tr>
    </table>
</form>

<?php
$compteur = 0;

if (isset($_POST["submit"])) {
    $q1 = empty($_POST["q1"]) ? "" : $_POST["q1"];
    $q2 = empty($_POST["q2"]) ? "" : $_POST["q2"];
    $q3 = empty($_POST["q3"]) ? "" : $_POST["q3"];
    if ($q1 !== "" && $q2 !== "" && $q3 !== "") {
        if ($q1 === "renne") { $compteur++; }
        if ($q2 === "lievre") { $compteur++; }
        if ($q3 === "poisson") { $compteur++; }
        echo "<b align=center>Votre résultat : " . $compteur . "/3 bonne(s) réponse(s)</b>";
    } else {
        echo "<b align=center style='color:red;'>Veuillez remplir tous les champs !</b>";
    }
}
?>
