
import java.io.Serializable;

/**
 * Represents a character in a text document, including its value and
 * properties.
 * This class implements the Serializable interface to allow objects of this
 * class
 * to be serialized and deserialized.
 */

public class Character implements Serializable {
    private char value;
    private CharacterProperties properties;

    /**
     * Constructs a new Character object with the specified value and properties.
     * 
     * @param value      The value of the character
     * @param properties The properties of the character
     */

    public Character(char value, CharacterProperties properties) {
        this.value = value;
        this.properties = properties;
    }

    // getters and setters

    /**
     * Returns the value of the character.
     * 
     * @return The value of the character
     */
    public char getValue() {
        return this.value;
    }

    /**
     * Sets the value of the character.
     * 
     * @param value The new value of the character
     */
    public void setValue(char value) {
        this.value = value;
    }

    /**
     * Returns the properties of the character.
     * 
     * @return The properties of the character
     */
    public CharacterProperties getProperties() {
        return this.properties;
    }

    /**
     * Sets the properties of the character.
     * 
     * @param properties The new properties of the character
     */
    public void setProperties(CharacterProperties properties) {
        this.properties = properties;
    }

}