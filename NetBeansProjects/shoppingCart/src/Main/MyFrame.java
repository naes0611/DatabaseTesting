/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author seany
 */
public class MyFrame extends ArrayList_Level_One{
    
    MyFrame(){
        ImageIcon image = new ImageIcon("logo.png");

        //Label
        JLabel label = new JLabel();
        label.setText("Shopping Cart");
        label.setIcon(image);
        //label.setHorizontalTextPosition(JLabel.CENTER);
       // label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.gray);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        
        //FRAME
        JFrame GUI = new JFrame();
        GUI.setTitle("Shopping Cart");
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setResizable(false);
        GUI.setSize(960,680);
        GUI.setVisible(true);
        GUI.add(label);
        
        //LOGO AND BACKGROUND
        GUI.setIconImage(image.getImage());
        GUI.getContentPane().setBackground(new Color(255,255,255));
        
        //JButton
        JButton button = new JButton();
    }
    public static void main(String args []) {
    	new MyFrame();
    }
}
