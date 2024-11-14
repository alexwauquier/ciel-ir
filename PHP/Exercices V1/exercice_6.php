<?php
echo "<table width=100% border=1>";
echo "<tr>";
echo "<th> * </th>";

for ($i=1 ; $i <= 10 ; $i++) {
    echo "<th>". $i . "</t>";
}

echo "</tr>";

for ($j=1 ; $j <= 10 ; $j++) {
    echo "<tr align=center><th>$j</th>";
    
    for ($k=1 ; $k <= 10 ; $k++) {
        echo "<td>". $k*$j . "</td>";
    }

    echo "</tr>";
}

echo "</table>";
?>
