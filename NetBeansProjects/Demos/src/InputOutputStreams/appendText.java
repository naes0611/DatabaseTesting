/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStreams;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author seany
 */
public class appendText {
    public static void main(String[] args) {
        String text = "\nAppended text!";

        // true = append mode (keeps existing content)
        try (FileOutputStream output = new FileOutputStream("C:\\Users\\seany\\desktop\\listofnamescopy.txt", true)) {
          output.write(text.getBytes());
          System.out.println("Successfully appended to file.");
        } catch (IOException e) {
          System.out.println("Error writing file.");
          e.printStackTrace();
        }
    }
}
