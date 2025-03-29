def chiffrement_vigenere(texte, cle):
    texte_chiffre = ""
    cle = cle.upper()
    texte = texte.upper()
    longueur_cle = len(cle)
    
    for i in range(len(texte)):
        caractere = texte[i]
        decalage = ord(cle[i % longueur_cle]) - ord('A')
        caractere_chiffre = chr((ord(caractere) - ord('A') + decalage) % 26 + ord('A'))
        texte_chiffre = texte_chiffre + caractere_chiffre
    
    return texte_chiffre


message = "BONJOURTOUTLEMONDE"
cle = "CLE"
texte_chiffre = chiffrement_vigenere(message, cle)

print("Texte original :", message)
print("Texte chiffré :", texte_chiffre)
