/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileHandlingDemo;

import java.io.File;

/**
 *
 * @author seany
 */
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\seany\\desktop\\listofnames.txt");
        
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
