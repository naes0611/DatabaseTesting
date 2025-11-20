/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author seany
 */
public class ArrayIterator {
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        
        Iterator<String> it = cars.iterator();

        
        while(it.hasNext()) {
            String i = it.next();
            if (i.equals("BMW")) {
                it.remove();
            }
        }
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
