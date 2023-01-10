public static String encriptar(String textoNormal, int vira) {
    String textoCifrado = "";
 
    for (int i = 0; i < textoNormall.length(); i++) {
        textoCifrado += encriptar(textoNormal.charAt(i), vira);
    }
 
    return textoCifrado;
}
 
public static char encriptar(char charOriginal, int vira) {
    
    char charCifrado;
 
    if (charNormal >= 97 && charNormal <= 122) {
        charCifrado = (char) ((charNormal - 97 + vira) % 26 + 97);
    }
    else if (charNormal >= 65 && charNormal <= 90) {
        charCifrado = (char) ((charNormal - 65 + vira) % 26 + 65);
    }
    else {
        charCifrado = charNormal;
    }
 
    return charCifrado;
}