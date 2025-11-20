/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileHandlingDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author seany
 */
public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\seany\\desktop\\listofnames.txt");
            if (file.createNewFile()){     
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
