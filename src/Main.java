
import java.io.IOException;
import java.util.List;

/**
 * The main class to demonstrate the usage of the Document, Character,
 * CharacterProperties, and CharacterPropertiesFactory classes.
 * It creates a document with characters and their properties, saves the
 * document to a file, loads it back from the file,
 * and prints the characters along with their properties.
 */
public class Main {

    /**
     * The main method of the program.
     * It creates a document with characters and their properties, saves the
     * document to a file, loads it back from the file,
     * and prints the characters along with their properties.
     *
     * @param args The command-line arguments (not used in this program)
     * @throws IOException            If an I/O error occurs while saving or loading
     *                                the document
     * @throws ClassNotFoundException If the class of a serialized object cannot be
     *                                found while loading the document
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Document doc = new Document();
        CharacterPropertiesFactory factory = new CharacterPropertiesFactory();
        CharacterProperties props1 = new CharacterProperties("Arial", "Red", 12);
        CharacterProperties props2 = new CharacterProperties("Calibri", "Blue", 14);
        CharacterProperties props3 = new CharacterProperties("Verdana", "Black", 16);
        CharacterProperties props4 = new CharacterProperties("Lato", "Green", 18);
        // Add characters with properties to the document

        doc.addCharacter('H', props1);
        doc.addCharacter('e', props1);
        doc.addCharacter('l', props1);
        doc.addCharacter('l', props1);
        doc.addCharacter('o', props2);
        doc.addCharacter('W', props2);
        doc.addCharacter('o', props2);
        doc.addCharacter('r', props2);
        doc.addCharacter('l', props3);
        doc.addCharacter('d', props3);
        doc.addCharacter('C', props3);
        doc.addCharacter('S', props4);
        // Add characters with properties using the factory method

        doc.addCharacter('4', factory.getCharacterProperties("Lato", "Greennn", 18));
        doc.addCharacter('8', factory.getCharacterProperties("Lato", "Green", 18));
        doc.addCharacter('0', factory.getCharacterProperties("Lato", "Green", 18));
        doc.addCharacter('0', factory.getCharacterProperties("Lato", "Green", 18));
        // Print the unique character properties in the factory

        factory.getCharacterProperties("Arial", "Red", 12);
        factory.getCharacterProperties("Calibri", "Blue", 14);
        factory.getCharacterProperties("Verdana", "Black", 16);
        factory.getCharacterProperties("Lato", "Green", 18);

        factory.print();
        // Save the document to a file

        doc.save("document.txt");
        // Load the document from the file

        Document loadedDoc = new Document();
        loadedDoc.load("document.txt");
        // Print the characters along with their properties from the loaded document

        List<Character> characters = loadedDoc.getCharacters();
        for (Character ch : characters) {
            System.out.println(ch.getValue() + ": " + ch.getProperties().getFont() + ", "
                    + ch.getProperties().getColor() + ", " + ch.getProperties().getSize());
        }
        // Print the characters from the original document

        System.out.println();
        for (Character ch : doc.getCharacters()) {
            System.out.print(ch.getValue());
        }
    }
}
