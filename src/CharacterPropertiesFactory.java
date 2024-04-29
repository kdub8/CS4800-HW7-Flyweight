
import java.util.HashMap;
import java.util.Map;

/**
 * A factory class for creating and managing instances of CharacterProperties.
 * It ensures that only one instance of CharacterProperties is created for each
 * unique combination of font, color, and size.
 */
public class CharacterPropertiesFactory {
    private Map<String, CharacterProperties> characterPropertiesMap;

    /**
     * Constructs a new CharacterPropertiesFactory with an empty map.
     */
    public CharacterPropertiesFactory() {
        this.characterPropertiesMap = new HashMap<>();
    }

    /**
     * Retrieves a CharacterProperties instance with the specified font, color, and
     * size.
     * If an instance with the same properties already exists, it returns that
     * instance.
     * Otherwise, it creates a new instance and adds it to the map.
     * 
     * @param font  The font of the character properties
     * @param color The color of the character properties
     * @param size  The size of the character properties
     * @return The CharacterProperties instance with the specified properties
     */
    public CharacterProperties getCharacterProperties(String font, String color, int size) {
        String key = font + color + size;
        if (characterPropertiesMap.containsKey(key)) {
            return characterPropertiesMap.get(key);
        } else {
            CharacterProperties properties = new CharacterProperties(font, color, size);
            characterPropertiesMap.put(key, properties);
            return properties;
        }
    }

    /**
     * Prints the key-value pairs in the characterPropertiesMap.
     * Each key is a unique combination of font, color, and size,
     * and each value is the corresponding formatted character properties.
     */
    public void print() {
        for (Map.Entry<String, CharacterProperties> entry : characterPropertiesMap.entrySet()) {
            String key = entry.getKey();
            CharacterProperties value = entry.getValue();
            System.out.println("Key: " + key + ", Formatted Values: " + value.getFormattedCharacterProperties());
        }

    }
}
