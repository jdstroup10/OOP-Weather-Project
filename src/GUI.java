
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Main window for application - Jason S
public class GUI extends JFrame {
    JTextField nameField, scoreField, resultField, avgField;

    public GUI() {

        setTitle("User Login");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Main Panel - Jason S
        JPanel panel = new JPanel(new GridLayout(6,2,10,10));
        panel.setBackground(Color.LIGHT_GRAY);

        // Three Labels each with field for user input - Jason S
        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField();

        JLabel scoreLabel = new JLabel("Password: ");
        scoreField = new JTextField();

        JLabel resultLabel = new JLabel("Email: ");
        resultField = new JTextField();
        resultField.setEditable(false); //Grade field is NOT editable by user


        // JButtons 
        JButton clearBtn = new JButton("Clear");
        JButton exitBtn = new JButton("Exit");

        //setBackground not working - try this - Jason S

        clearBtn.setBackground(Color.ORANGE);
        clearBtn.setOpaque(true);
        clearBtn.setBorderPainted(false);

        exitBtn.setBackground(Color.RED);
        exitBtn.setOpaque(true);
        exitBtn.setBorderPainted(false);


        panel.add(nameLabel); panel.add(nameField);
        panel.add(scoreLabel); panel.add(scoreField);
        panel.add(resultLabel); panel.add(resultField);

        add(panel);

        //Listeners: When button clicked -> execute method - Jason S
        clearBtn.addActionListener(e -> clear());
        exitBtn.addActionListener(e -> System.exit(0));
    }

    

    //method to clear input - Jason S
    private void clear() {
        nameField.setText("");
        scoreField.setText("");
        resultField.setText("");
        avgField.setText("");

    }

    

    

}
