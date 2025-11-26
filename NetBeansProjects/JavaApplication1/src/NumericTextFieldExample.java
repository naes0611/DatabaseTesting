/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author seany
 */
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument;
import java.awt.FlowLayout;

public class NumericTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Numeric Text Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());

        JTextField numericTextField = new JTextField(15);
        // Apply the NumericDocumentFilter to the text field's document
        ((AbstractDocument) numericTextField.getDocument()).setDocumentFilter(new NumericDocumentFilter());

        JPanel panel = new JPanel();
        panel.add(numericTextField);
        frame.add(panel);
        frame.setVisible(true);
    }
}