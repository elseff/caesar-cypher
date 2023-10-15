public class Cypher {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private final int encryptKey;
    private final int decryptKey;

    public Cypher(int encryptKey) {
        this.encryptKey = encryptKey;
        int alphabetPower = alphabet.length();
        decryptKey = alphabetPower - encryptKey;
    }

    private char shiftSymbol(char symbol, int shift) {
        if (alphabet.indexOf(symbol) != -1 && shift > 0) {
            return alphabet.charAt((alphabet.indexOf(symbol) + shift) % alphabet.length());
        } else {
            return symbol;
        }
    }

    public String encryptString(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(shiftSymbol(str.charAt(i), encryptKey));
        }
        return stringBuilder.toString();
    }

    public String decryptString(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(shiftSymbol(str.charAt(i), decryptKey));
        }
        return stringBuilder.toString();
    }
}
