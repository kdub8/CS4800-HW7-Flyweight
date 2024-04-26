
import java.util.HashMap;
import java.util.Map;

public class CharacterPropertiesFactory {
    private Map<String, CharacterProperties> characterPropertiesMap;

    public CharacterPropertiesFactory() {
        this.characterPropertiesMap = new HashMap<>();
    }

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

    public void print() {
        for (Map.Entry<String, CharacterProperties> entry : characterPropertiesMap.entrySet()) {
            String key = entry.getKey();
            CharacterProperties value = entry.getValue();
            System.out.println("Key: " + key + ", Formatted Values: " + value.getFormattedCharacterProperties());
        }

    }
}
