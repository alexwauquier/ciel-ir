texte_chiffre = input("Entrez le texte à décoder : ").upper()

for j in range(1, 26):
    test_dechiffrement = ""

    for i in range(len(texte_chiffre)):
        code_ascii = ord(texte_chiffre[i])
        code_ascii_dechiffre = 65 + ((code_ascii + j) - 65) % 26
        test_dechiffrement = test_dechiffrement + chr(code_ascii_dechiffre)
    
    print(test_dechiffrement)
