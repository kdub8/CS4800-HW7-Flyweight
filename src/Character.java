
import java.io.Serializable;

public class Character implements Serializable {
    private char value;
    private CharacterProperties properties;

    public Character(char value, CharacterProperties properties) {
        this.value = value;
        this.properties = properties;
    }

    // getters and setters

    public char getValue() {
        return this.value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public CharacterProperties getProperties() {
        return this.properties;
    }

    public void setProperties(CharacterProperties properties) {
        this.properties = properties;
    }

}