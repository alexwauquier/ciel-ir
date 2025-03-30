def inverse_modulaire(a, m):
    for i in range(1, m):
        if (a * i) % m == 1:
            return i
    return None


print("Quelle phrase voulez-vous déchiffrée ?")
texte_chiffre = input().upper()

liste = [1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25]

for a in liste:
    a_inverse = inverse_modulaire(a, 26)

    for b in range(26):
        if a_inverse is None:
            continue

        test_dechiffrement = ""

        for i in range(len(texte_chiffre)):
            code_ascii = ord(texte_chiffre[i])
            code_ascii_dechiffre = 65 + ((a_inverse * (code_ascii - 65 - b)) % 26)
            test_dechiffrement = test_dechiffrement + chr(code_ascii_dechiffre)
        
        print("a =", a, "b =", b, " ", test_dechiffrement)
