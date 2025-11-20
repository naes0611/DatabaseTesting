/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStreams;

/**
 *
 * @author seany
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
  public static void main(String[] args) {
    copyText();
  }
  
    static void copyImage() {
   // Copy image.jpg into copy.jpg
    try (FileInputStream input = new FileInputStream("image.jpg");
        FileOutputStream output = new FileOutputStream("copy.jpg")) {

        int b;
        while ((b = input.read()) != -1) {
            output.write(b);  // write each raw byte to the new file
        }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error handling file.");
        }   
    }
    static void copyText() {
        try (FileInputStream input = new FileInputStream("C:\\Users\\seany\\desktop\\listofnames.txt");
            FileOutputStream output = new FileOutputStream("C:\\Users\\seany\\desktop\\listofnamescopy.txt")) {

            int i;
            while ((i = input.read()) != -1) {
                output.write(i);  // write the raw byte to the new file
            }
                System.out.println("File copied successfully.");
            } catch (IOException e) {
              System.out.println("Error handling file.");
        }
    }
}
