package Text.ReverseAString.Java;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class gui {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Reverse the String!");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(150, 25));

        JLabel label = new JLabel("Reversed String will appear here");

        // Setting the action listener for the button to the actionPerformed method
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() { 

            // The event
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                System.out.println("Input: " + input);

                // input = ReverseFunctions.reverse1(input);
                // input = ReverseFunctions.reverse2(input);
                input = ReverseFunctions.reverse3(input);
                label.setText(input);
            }
        });

        // Adds the individual components to the container
        container.add(textField);
        container.add(okButton);
        container.add(label);

        frame.setVisible(true);
    }
}