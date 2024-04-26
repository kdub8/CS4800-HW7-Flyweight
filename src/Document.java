
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Document implements Serializable {
    private List<Character> characters;

    public Document() {
        this.characters = new ArrayList<>();
    }

    public List<Character> getCharacters() {
        return this.characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public void addCharacter(char value, CharacterProperties properties) {
        Character character = new Character(value, properties);
        characters.add(character);
    }

    public void save(String filename) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(this.characters);
        oos.close();
    }

    @SuppressWarnings("unchecked")
    public void load(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        this.characters = (List<Character>) ois.readObject();
        ois.close();
    }

    public void insert(String text, CharacterProperties properties) {
        for (int i = 0; i < text.length(); i++) {
            characters.add(new Character(text.charAt(i), properties));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Character ch : characters) {
            sb.append(ch.getValue());
            sb.append(ch.getProperties().getFormattedCharacterProperties());
        }
        return sb.toString();
    }

    // getters and setters
}