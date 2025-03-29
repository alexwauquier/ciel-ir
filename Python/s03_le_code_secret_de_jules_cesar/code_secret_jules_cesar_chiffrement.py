print("Quelle phrase voulez-vous coder ?")
phrase = input().upper()

print("Quel sera le décalage des lettres ?")
decalage = int(input())
texte_chiffre = ""

for i in range(len(phrase)):
    code_ascii = ord(phrase[i])
    code_ascii_chiffre = 65 + ((code_ascii + decalage) - 65) % 26
    texte_chiffre = texte_chiffre + chr(code_ascii_chiffre)

print("Voici le texte codé :", texte_chiffre)
