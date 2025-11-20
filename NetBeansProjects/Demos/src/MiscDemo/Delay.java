/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiscDemo;

/**
 *
 * @author seany
 */
public class Delay {
    public static void delay(int delayMS) {
        try {
            Thread.sleep(delayMS);
        } catch (InterruptedException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }
}
