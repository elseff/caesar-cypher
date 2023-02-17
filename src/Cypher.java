public class Cypher {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static char shiftSymbol(char symbol, int shift) {
        if (alphabet.indexOf(symbol) != -1 && shift > 0) {
            return alphabet.charAt((alphabet.indexOf(symbol) + shift) % alphabet.length());
        } else {
            return symbol;
        }
    }

    //show all possible text options
    public static void encryptString(String text) {
        text = text.toLowerCase();
        System.out.println("Current text: " + text);
        System.out.println("All possible text options:");
        for (int i = 0; i < alphabet.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                char symbol = shiftSymbol(text.charAt(j), i);
                System.out.print(symbol);
            }
            System.out.println();
        }
        System.out.println("End");
    }

}
