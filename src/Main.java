
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Document doc = new Document();
        CharacterPropertiesFactory factory = new CharacterPropertiesFactory();
        CharacterProperties props1 = new CharacterProperties("Arial", "Red", 12);
        CharacterProperties props2 = new CharacterProperties("Calibri", "Blue", 14);
        CharacterProperties props3 = new CharacterProperties("Verdana", "Black", 16);
        CharacterProperties props4 = new CharacterProperties("Lato", "Green", 18);

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

        doc.addCharacter('5', factory.getCharacterProperties("Lato", "Greennn", 18));
        doc.addCharacter('8', factory.getCharacterProperties("Lato", "Green", 18));
        doc.addCharacter('0', factory.getCharacterProperties("Lato", "Green", 18));
        doc.addCharacter('0', factory.getCharacterProperties("Lato", "Green", 18));

        factory.getCharacterProperties("Arial", "Red", 12);
        factory.getCharacterProperties("Calibri", "Blue", 14);
        factory.getCharacterProperties("Verdana", "Black", 16);
        factory.getCharacterProperties("Lato", "Green", 18);


        factory.print();

        doc.save("document.txt");

        Document loadedDoc = new Document();
        loadedDoc.load("document.txt");

        List<Character> characters = loadedDoc.getCharacters();
        for (Character ch : characters) {
            System.out.println(ch.getValue() + ": " + ch.getProperties().getFont() + ", "
                    + ch.getProperties().getColor() + ", " + ch.getProperties().getSize());
        }

        System.out.println();
        for (Character ch : doc.getCharacters()) {
            System.out.print(ch.getValue());
        }
    }
}
