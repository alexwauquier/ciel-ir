L = [987, 65, 43, 21, 43, 98, 145]

# Afficher la liste L
print(L)

# Compter le nombre d'occurrences de 43 dans L
print(L.count(43))

# Ajouter le nombre 25 en dernière position puis afficher L
L.append(25)
print(L)

# Afficher la longueur de la liste
print(len(L))

# Supprimer un élément 43 de L puis afficher L
L.remove(43)
print(L)

# Renverser l'ordre de L puis afficher L
L.reverse()
print(L)

# Trier L par ordre croissant puis afficher L
L.sort()
print(L)

# Trier L par ordre décroissant puis afficher L
L.sort(reverse=True)
print(L)

# Utiliser une boucle for pour afficher une valeur de la liste par ligne
for i in range(len(L)):
    print(L[i])
