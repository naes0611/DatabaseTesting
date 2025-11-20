/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileHandlingDemo;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author seany
 */
public class getFileSize { // two ways
    public static void main(String[] args) {
        File file = new File("C:\\Users\\seany\\desktop\\listofnames.txt");

        if (file.exists() && file.isFile()) { // Ensure it's a file and exists
            long fileSizeInBytes = file.length();
            System.out.println("File size: " + fileSizeInBytes + " bytes. 1st way");
        } else {
            System.out.println("File does not exist or is a directory.");
        }
        
        try (java.io.FileInputStream input = new java.io.FileInputStream("C:\\Users\\seany\\desktop\\listofnames.txt")) {
            
            long fileSize = input.getChannel().size();
            
            System.out.println("File size: " + fileSize + " bytes. 2nd way");

        } catch (IOException e) {
          // If an error happens (e.g. file not found), print an error message
            System.out.println("Error reading file.");
        }
    }
}
