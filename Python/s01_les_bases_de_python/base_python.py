# Règles

toto = 2
result = 1

if toto == 1:
    print("coucou")
else:
    result = 2

print(result)


# Entrer une valeur

a = input("Entrer un entier : ")
b = int(a)

print("La valeur est ", b)


# La structure conditionnelle if en Python

a = input("Entrer un entier : ")
b = int(a)

if b == 12:
    print("La variable vaut 12")
else:
    print("La variable ne vaut pas 12")


# Test avec des conditions logiques

a = input("Entrer un entier : ")
b = int(a)

if (b % 2 == 0) and (b > 10):
    print("La variable est paire et est supérieure à 10")


# Condition logique avec un ET (noté and) et un OU (noté or)

a = input("Entrer un entier : ")
b = int(a)

if (b % 2 == 0) and (b > 10) or (b < 0):
    print("La variable est paire et est supérieure à 10, ou bien est négative")


# Plusieurs tests imbriqués avec le mot clé elif

a = input("Entrer un entier : ")
b = int(a)

if b > 100:
    print("La variable est supérieure à 100")
elif b < 10:
    print("La variable est inférieure à 10")
else:
    print("La variable est comprise entre 10 et 100")
