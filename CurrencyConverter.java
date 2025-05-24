import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame implements ActionListener {

    JPanel panel;
    JTextField textField;
    JLabel label;
    JButton INR_BUTTON, POUND_BUTTON, EURO_BUTTON, YEN_BUTTON;

    CurrencyConverter() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setTitle("Currency Calculator");
        this.setLayout(null);

        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        panel.setBounds(50, 50, 300, 300);

        label = new JLabel("Currency Calculator");
        label.setBounds(80, 10, 200, 25);

        textField = new JTextField("Enter the money in USD ($)");
        textField.setBounds(50, 50, 200, 25);

        INR_BUTTON = new JButton("INR");
        POUND_BUTTON = new JButton("Pound");
        EURO_BUTTON = new JButton("Euro");
        YEN_BUTTON = new JButton("Yen");

        INR_BUTTON.setBounds(50, 90, 90, 25);
        POUND_BUTTON.setBounds(150, 90, 90, 25);
        EURO_BUTTON.setBounds(50, 130, 90, 25);
        YEN_BUTTON.setBounds(150, 130, 90, 25);


        INR_BUTTON.addActionListener(this);
        POUND_BUTTON.addActionListener(this);
        EURO_BUTTON.addActionListener(this);
        YEN_BUTTON.addActionListener(this);

        panel.add(label);
        panel.add(textField);
        panel.add(INR_BUTTON);
        panel.add(POUND_BUTTON);
        panel.add(EURO_BUTTON);
        panel.add(YEN_BUTTON);

        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      double usd;
      double result;
      usd= Double.parseDouble(textField.getText().trim());
        if(e.getSource()==INR_BUTTON) {
            result = usd * 85.20;
            JOptionPane.showMessageDialog(this, "Converted Amount: " + result + " " + "INR");
        }
        if(e.getSource()==POUND_BUTTON) {
            result = usd * 0.7384;
            JOptionPane.showMessageDialog(this, "Converted Amount: " + result + " " + "POUND");
        }
        if(e.getSource()==YEN_BUTTON) {
            result = usd * 142.56;
            JOptionPane.showMessageDialog(this, "Converted Amount: " + result + " " + "POUND");
        }
        if(e.getSource()==EURO_BUTTON) {
            result = usd * 0.8795;
            JOptionPane.showMessageDialog(this, "Converted Amount: " + result + " " + "EURO");
        }
    }
    public static void main(String[] args) {
        new CurrencyConverter();
    }
}

