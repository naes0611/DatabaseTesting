/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileHandlingDemo;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author seany
 */
public class WritetoFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\seany\\desktop\\listofnames.txt");
            fileWriter.write("Sean, Lyra, Joaquin, Jairus, Heinz, Vincent, Kate");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
