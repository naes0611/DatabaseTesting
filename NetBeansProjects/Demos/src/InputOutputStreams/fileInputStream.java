/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStreams;

import java.io.IOException;

/**
 *
 * @author seany
 */
public class fileInputStream {
    public static void main(String[] args) {
        // try-with-resources: FileInputStream will be closed automatically
        try (java.io.FileInputStream input = new java.io.FileInputStream("C:\\Users\\seany\\desktop\\listofnames.txt")) {
            
            int i;  // variable to store each byte that is read
            
            long fileSize = input.getChannel().size();
            
            System.out.println("File size: " + fileSize + " bytes.");
            // Read one byte at a time until end of file (-1 means "no more data")
            while ((i = input.read()) != -1) {
              // Convert the byte to a character and print it to the console
              System.out.print((char) i);
            }

        } catch (IOException e) {
          // If an error happens (e.g. file not found), print an error message
            System.out.println("Error reading file.");
        }
    }
}
