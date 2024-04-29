
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a document consisting of characters with properties.
 * This class implements the Serializable interface to allow objects of this
 * class to be serialized and deserialized.
 */
public class Document implements Serializable {
    private List<Character> characters;

    /**
     * Constructs a new Document object with an empty list of characters.
     */
    public Document() {
        this.characters = new ArrayList<>();
    }

    /**
     * Returns the list of characters in the document.
     * 
     * @return The list of characters in the document
     */
    public List<Character> getCharacters() {
        return this.characters;
    }

    /**
     * Sets the list of characters in the document.
     * 
     * @param characters The new list of characters in the document
     */
    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    /**
     * Adds a character to the document with the specified value and properties.
     * 
     * @param value      The value of the character to add
     * @param properties The properties of the character to add
     */
    public void addCharacter(char value, CharacterProperties properties) {
        Character character = new Character(value, properties);
        characters.add(character);
    }

    /**
     * Saves the document to a file with the specified filename.
     * 
     * @param filename The name of the file to save the document to
     * @throws IOException If an I/O error occurs while saving the document
     */
    public void save(String filename) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(this.characters);
        oos.close();
    }

    /**
     * Loads the document from a file with the specified filename.
     * 
     * @param filename The name of the file to load the document from
     * @throws IOException            If an I/O error occurs while loading the
     *                                document
     * @throws ClassNotFoundException If the class of a serialized object cannot be
     *                                found
     */
    @SuppressWarnings("unchecked")
    public void load(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        this.characters = (List<Character>) ois.readObject();
        ois.close();
    }

    /**
     * Inserts the specified text into the document with the specified properties.
     * 
     * @param text       The text to insert into the document
     * @param properties The properties of the characters in the text
     */
    public void insert(String text, CharacterProperties properties) {
        for (int i = 0; i < text.length(); i++) {
            characters.add(new Character(text.charAt(i), properties));
        }
    }

    /**
     * Returns a string representation of the document.
     * 
     * @return A string representation of the document
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Character ch : characters) {
            sb.append(ch.getValue());
            sb.append(ch.getProperties().getFormattedCharacterProperties());
        }
        return sb.toString();
    }

}