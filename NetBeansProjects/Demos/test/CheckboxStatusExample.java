import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CheckboxStatusExample extends JFrame {
    private List<JCheckBox> checkBoxes;
    private JLabel statusLabel;

    public CheckboxStatusExample() {
        setTitle("Checkbox Status Check");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        checkBoxes = new ArrayList<>();
        String[] options = {"Option A", "Option B", "Option C"};

        for (String option : options) {
            JCheckBox checkBox = new JCheckBox(option);
            checkBoxes.add(checkBox);
            add(checkBox);
        }

        JButton checkButton = new JButton("Check Status");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displaySelectedSubjects();
            }
        });
        add(checkButton);

        statusLabel = new JLabel("Status: None selected");
        add(statusLabel);
    }

    private boolean displaySelectedSubjects() {
        boolean anySelected = false;
        StringBuilder selectedSubjects = new StringBuilder("Selected: ");
        for (JCheckBox checkBox : checkBoxes) {
            if (checkBox.isSelected()) {
                anySelected = true;
                selectedSubjects.append(checkBox.getText()).append(", ");
            }
        }

        if (anySelected) {
            // Remove the last ", "
            selectedSubjects.delete(selectedSubjects.length() - 2, selectedSubjects.length());
            statusLabel.setText(selectedSubjects.toString());
        } else {
            statusLabel.setText("");
            JOptionPane.showMessageDialog(
            CheckboxStatusExample.this,
            "Please fill in all required fields.",
            "Input Error!",
            JOptionPane.ERROR_MESSAGE);
        }
        return anySelected;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckboxStatusExample().setVisible(true);
            }
        });
    }
}
