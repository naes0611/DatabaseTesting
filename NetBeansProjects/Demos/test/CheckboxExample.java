    import javax.swing.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.ArrayList;
    import java.util.List;

    public class CheckboxExample extends JFrame {

        private List<JCheckBox> checkboxes;
        private JTextArea outputArea;

        public CheckboxExample() {
            setTitle("Checkbox Text Example");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

            checkboxes = new ArrayList<>();

            JCheckBox cb1 = new JCheckBox("Option A");
            JCheckBox cb2 = new JCheckBox("Option B");
            JCheckBox cb3 = new JCheckBox("Option C");

            checkboxes.add(cb1);
            checkboxes.add(cb2);
            checkboxes.add(cb3);

            add(cb1);
            add(cb2);
            add(cb3);

            JButton showSelectedButton = new JButton("Show Selected");
            showSelectedButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    displaySelectedCheckboxText();
                }
            });
            add(showSelectedButton);

            outputArea = new JTextArea(5, 20);
            outputArea.setEditable(false);
            add(new JScrollPane(outputArea));

            pack();
            setVisible(true);
        }

        private void displaySelectedCheckboxText() {
            StringBuilder selectedText = new StringBuilder("Selected Options:\n");
            for (JCheckBox checkbox : checkboxes) {
                if (checkbox.isSelected()) {
                    selectedText.append("- ").append(checkbox.getText()).append("\n");
                }
            }
            outputArea.setText(selectedText.toString());
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(CheckboxExample::new);
        }
    }