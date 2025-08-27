package com.SeralizationAndDeseralization.test;

import java.io.*;

import java.io.Serializable;

class User implements Serializable {  // Mark the class as Serializable
    int id;
    String name;

    // Constructor to initialize id and name
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display User details
    public void display() {
        System.out.println("User ID: " + id);
        System.out.println("User Name: " + name);
    }
}


public class SerializationExample {
    public static void main(String[] args) {
        // Creating an object of User
        User user = new User(101, "Bhuvi");

        // Step 1: Create FileOutputStream to write to file
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("user.ser");

            // Step 2: Create ObjectOutputStream to serialize the object
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Step 3: Serialize the object and write it to the file
            objectOutputStream.writeObject(user);
            System.out.println("Object has been serialized.");

            // Step 4: Close the ObjectOutputStream
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close the FileOutputStream in the finally block to ensure it's closed properly
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // Deserialize the User object from the file
        FileInputStream fileInputStream = null;
        try {
            // Step 6: Create FileInputStream to read from the file
            fileInputStream = new FileInputStream("user.ser");

            // Step 7: Create ObjectInputStream to deserialize the object
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Step 8: Deserialize the object and cast it back to User
            User deserializedUser = (User) objectInputStream.readObject();
            System.out.println("Object has been deserialized.");

            // Step 9: Display the deserialized object details
            deserializedUser.display();

            // Step 10: Close the ObjectInputStream
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Step 11: Close the FileInputStream in the finally block to ensure it's closed properly
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

