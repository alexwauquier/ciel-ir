def dechiffrement_vigenere(texte, cle):
    texte_dechiffre = ""
    cle = cle.upper()
    texte = texte.upper()
    longueur_cle = len(cle)
    
    for i in range(len(texte)):
        caractere = texte[i]
        decalage = ord(cle[i % longueur_cle]) - ord('A')
        caractere_dechiffre = chr((ord(caractere) - ord('A') - decalage) % 26 + ord('A'))
        texte_dechiffre = texte_dechiffre + caractere_dechiffre
    
    return texte_dechiffre


texte_chiffre = "DZRLZYTESWEPGXSPOI"
cle = "CLE"
texte_dechiffre = dechiffrement_vigenere(texte_chiffre, cle)

print("Texte chiffré :", texte_chiffre)
print("Texte déchiffré :", texte_dechiffre)
