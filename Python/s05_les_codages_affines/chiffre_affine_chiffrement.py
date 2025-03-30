print("Quelle phrase voulez-vous chiffré ?")
texte = input().upper()

a = int(input("Choisissez un entier a : "))
b = int(input("Choisissez un entier b : "))

texte_chiffre = ""

for i in range(len(texte)):
    code_ascii = ord(texte[i])
    code_ascii_chiffre = 65 + ((a * code_ascii + b) - 65) % 26
    texte_chiffre = texte_chiffre + chr(code_ascii_chiffre)

print("Voici le texte chiffré :", texte_chiffre)
