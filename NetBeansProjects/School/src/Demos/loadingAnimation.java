/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demos;

/**
 *
 * @author seany
 */
public class loadingAnimation {
    public static void main(String[] args) {
        loadingAnimation();
    }
    public static void loadingAnimation() {
    String[] dots = {".", "..", "..."};
    for (String dot : dots) {
        System.out.print("\rExit" + dot);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            
        }
    }
    System.out.println("\rDone!");
}
}
