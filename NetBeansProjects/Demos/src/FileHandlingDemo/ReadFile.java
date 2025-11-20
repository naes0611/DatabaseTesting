/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileHandlingDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import MiscDemo.Delay;
/**
 *
 * @author seany
 */
public class ReadFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\seany\\desktop\\listofnames.txt");
        
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                String names = fileReader.nextLine();
                String[] namesArray = names.split(", ");
                for (String name : namesArray) {
                    Delay.delay(1000);
                    System.out.print("\r" + name);
                }
                System.out.println("");
            } 
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
