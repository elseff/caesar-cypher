import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String text = "A simple text";
        System.out.println("Source text: " + text);
        Cypher cypher = new Cypher(1);
        text = cypher.encryptString(text.toLowerCase(Locale.ROOT));
        System.out.println("Encrypted: " + text);
        text = cypher.decryptString(text);
        System.out.println("Decrypted: " + text);
    }
}
