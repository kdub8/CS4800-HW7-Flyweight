import java.io.Serializable;

/**
 * Represents the properties of a character in a text document, including font,
 * color, and size.
 * This class implements the Serializable interface to allow objects of this
 * class to be serialized and deserialized.
 */
public class CharacterProperties implements Serializable {
    private String font;
    private String color;
    private int size;

    /**
     * Constructs a new CharacterProperties object with the specified font, color,
     * and size.
     * 
     * @param font  The font of the character
     * @param color The color of the character
     * @param size  The size of the character
     */
    public CharacterProperties(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    // getters and setters
    /**
     * Returns the font of the character.
     * 
     * @return The font of the character
     */
    public String getFont() {
        return this.font;
    }

    /**
     * Sets the font of the character.
     * 
     * @param font The new font of the character
     */
    public void setFont(String font) {
        this.font = font;
    }

    /**
     * Returns the color of the character.
     * 
     * @return The color of the character
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets the color of the character.
     * 
     * @param color The new color of the character
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns the size of the character.
     * 
     * @return The size of the character
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Sets the size of the character.
     * 
     * @param size The new size of the character
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Returns a formatted string representation of the character properties.
     * 
     * @return A string containing the font, color, and size of the character
     */
    public String getFormattedCharacterProperties() {

        return " - Font: " + this.font + ", Color: " + this.color + ", Size: " + this.size + "\n";
    }

}
