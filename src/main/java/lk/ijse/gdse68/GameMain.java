package lk.ijse.gdse68;

import java.io.*;

public class GameMain {
    // Method to serialize a character
    public static void serializeCharacter(Character character, String filename) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(character);
            System.out.println("Character has been serialized: " + character);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to deserialize a character
    public static Character deserializeCharacter(String filename) {
        Character character = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            character = (Character) ois.readObject();
            System.out.println("Character has been deserialized: " + character);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return character;
    }

    // test serialization and deserialization
    public static void main(String[] args) {
        Character character = new Character("IronMan", 10, 100.0);
        String filename = "character.ser";

        // Serialize the character
        serializeCharacter(character, filename);

        // Deserialize the character
        Character deserializedCharacter = deserializeCharacter(filename);
    }
}
