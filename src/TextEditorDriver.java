
import java.io.*;

public class TextEditorDriver {

    public static void main(String[] args) {
        // Create a new document
        Document document = new Document();
        CharacterPropertiesFactory factory = new CharacterPropertiesFactory();
        factory.getCharacterProperties("Arial", "Red", 12).getFormattedCharacterProperties();
        factory.getCharacterProperties("Calibri", "Blue", 14).getFormattedCharacterProperties();
        factory.getCharacterProperties("Verdana", "Black", 16).getFormattedCharacterProperties();
        factory.getCharacterProperties("Lato", "Green", 18).getFormattedCharacterProperties();
        // Add some text to the document with different character properties
        document.insert("Hello", new CharacterProperties("Arial", "Red", 12));
        document.insert("World", new CharacterProperties("Calibri", "Blue", 14));
        document.insert("CS", new CharacterProperties("Verdana", "Black", 16));
        document.insert("5800", new CharacterProperties("Lato", "Green", 18));
        document.insert("TEXT", factory.getCharacterProperties("Lato", "Green", 18));
        document.insert("TEXTforCPF", factory.getCharacterProperties("Lato", "Green", 18));

        // Print the document
        System.out.println("Document:");
        System.out.println(document.toString());

        // Save the document to a file
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("document.txt"));
            out.writeObject(document);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Load the document from the file
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("document.txt"));
            Document loadedDocument = (Document) in.readObject();
            in.close();

            // Print the loaded document
            System.out.println("\nLoaded Document:");
            System.out.println(loadedDocument.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        //////////////////

    }

}
