<?php
function getPersonInfo($name, $age) {
    return "<strong style='color: green;'>$name $age</strong>";
}

echo getPersonInfo('Nicolas', 15);
?>
