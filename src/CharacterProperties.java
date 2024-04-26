import java.io.Serializable;

public class CharacterProperties implements Serializable {
    private String font;
    private String color;
    private int size;

    public CharacterProperties(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    // getters and setters

    public String getFont() {
        return this.font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFormattedCharacterProperties() {

        return " - Font: " + this.font + ", Color: " + this.color + ", Size: " + this.size + "\n";
    }

}
