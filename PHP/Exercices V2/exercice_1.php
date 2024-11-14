<form method="post">
    <input name="nb1" type="text" />
    <select name="op">
        <option value="+">Plus</option>
        <option value="-">Moins</option>
        <option value="*">Multiplier par</option>
        <option value="/">Diviser par</option>
    </select>
    <input name="nb2" type="text" />
    <input name="submit" type="submit" />
</form>

<?php
if (isset($_POST['submit'])) {
    if (is_numeric($_POST['nb1']) && is_numeric($_POST['nb2'])) {
        if     ($_POST['op'] === '+') { $total = $_POST['nb1'] + $_POST['nb2']; }
        elseif ($_POST['op'] === '-') { $total = $_POST['nb1'] - $_POST['nb2']; }
        elseif ($_POST['op'] === '*') { $total = $_POST['nb1'] * $_POST['nb2']; }
        elseif ($_POST['op'] === '/') { $total = $_POST['nb2'] != 0 ? $_POST['nb1'] / $_POST['nb2'] : "Impossible!"; }

        echo "{$_POST['nb1']} {$_POST['op']} {$_POST['nb2']} = {$total}";
    } else {
        echo 'Veuillez remplir tous les champs !';
    }
}
?>
