def conversion_entier_vers_binaire(nombre):
    if nombre == 0:
        return 0
    else:
        return conversion_entier_vers_binaire(nombre // 2) * 10 + nombre % 2


nombre = int(input("Entrer un entier : "))

print("Le binaire de", nombre, "est :", conversion_entier_vers_binaire(nombre))
