import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator_main implements ActionListener {

    // making globals so that we can access it throughout the class
    JFrame jf;
    JLabel display_label;
    JButton sevenButton, eightButton, nineButton;

    JButton sixButton, fiveButton, fourButton;

    JButton threeButton, twoButton, oneButton;

    JButton equalButton, zeroButton, dotButton, divButton;
    JButton plusButton, minusButton, clearButton, multiButton;
    int symbolOfOperator;
    float result;

    boolean isOperatorClicked = false;
    String oldValue;

    // constructor calc
    public Calculator_main() {

        // Basic layout of the window
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        // Size of the window
        jf.setSize(550, 600);
        // default location in the screen
        jf.setLocation(250, 150);

        // Creating a new JLabel object for the label field
        display_label = new JLabel();
        display_label.setBounds(30, 50, 440, 60);
        display_label.setFont(new Font("Arial", Font.PLAIN, 40));
        display_label.setBackground(Color.white);
        display_label.setOpaque(true);
        display_label.setHorizontalAlignment(SwingConstants.RIGHT);
        display_label.setForeground(Color.BLACK);
        jf.add(display_label);

        // Making button
        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        equalButton = new JButton("=");
        equalButton.setBounds(30, 430, 80, 80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setBounds(230, 430, 80, 80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        divButton.addActionListener(this);
        jf.add(divButton);

        multiButton = new JButton("x");
        multiButton.setBounds(330, 230, 80, 80);
        multiButton.setFont(new Font("Arial", Font.PLAIN, 40));
        multiButton.addActionListener(this);
        jf.add(multiButton);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        minusButton.addActionListener(this);
        jf.add(minusButton);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        plusButton.addActionListener(this);
        jf.add(plusButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(430, 430, 80, 80);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
        clearButton.addActionListener(this);
        clearButton.setBorder(null);
        jf.add(clearButton);

        jf.setVisible(true);

        // would stop the program when we close the window
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // main function
    public static void main(String[] args) {

        new calc();
    }

    // adding the body of abstract method
    // This section would make the numbers appear when clicked.
    // display_label.getText() + number means the number already present there +
    // number

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sevenButton) {
            if (isOperatorClicked) {
                display_label.setText("7");
                isOperatorClicked = false;
            } else {
                display_label.setText(display_label.getText() + "7");
            }
        }

        else if (e.getSource() == eightButton) {
            if (isOperatorClicked) {
                display_label.setText("8");
                isOperatorClicked = false;
            } else {
                display_label.setText(display_label.getText() + "8");
            }
        }

        else if (e.getSource() == nineButton) {
            if (isOperatorClicked) {
                display_label.setText("9");
                isOperatorClicked = false;
            } else {
                display_label.setText(display_label.getText() + "9");
            }
        } else if (e.getSource() == fourButton) {
            if (isOperatorClicked) {
                display_label.setText("4");
                isOperatorClicked = false;
            } else {
                display_label.setText(display_label.getText() + "4");
            }
        } else if (e.getSource() == fiveButton) {
            if (isOperatorClicked) {
                display_label.setText("5");
                isOperatorClicked = false;
            } else {
                display_label.setText(display_label.getText() + "5");
            }
        } else if (e.getSource() == sixButton) {
            if (isOperatorClicked) {
                display_label.setText("6");
                isOperatorClicked = false;
            } else {
                display_label.setText(display_label.getText() + "6");
            }
        } else if (e.getSource() == oneButton) {
            if (isOperatorClicked) {
                display_label.setText("1");
                isOperatorClicked = false;
            } else {
                display_label.setText(display_label.getText() + "1");
            }
        } else if (e.getSource() == twoButton) {
            if (isOperatorClicked) {
                display_label.setText("2");
                isOperatorClicked = false;
            } else {
                display_label.setText(display_label.getText() + "2");
            }
        } else if (e.getSource() == threeButton) {
            if (isOperatorClicked) {
                display_label.setText("3");
                isOperatorClicked = false;
            } else {
                display_label.setText(display_label.getText() + "3");
            }
        }

        else if (e.getSource() == dotButton) {
            display_label.setText(display_label.getText() + ".");
        } else if (e.getSource() == zeroButton) {
            display_label.setText(display_label.getText() + "0");
        } else if (e.getSource() == divButton) {
            symbolOfOperator = 1;
            isOperatorClicked = true;
            oldValue = display_label.getText();
            display_label.setText(display_label.getText() + "/");
        } else if (e.getSource() == plusButton) {
            isOperatorClicked = true;
            symbolOfOperator = 2;
            oldValue = display_label.getText();
            display_label.setText(display_label.getText() + "+");
        } else if (e.getSource() == minusButton) {
            symbolOfOperator = 3;
            isOperatorClicked = true;
            oldValue = display_label.getText();
            display_label.setText(display_label.getText() + "-");
        } else if (e.getSource() == multiButton) {
            symbolOfOperator = 4;
            isOperatorClicked = true;
            oldValue = display_label.getText();
            display_label.setText(display_label.getText() + "x");
        } else if (e.getSource() == clearButton) {
            display_label.setText("");
        }

        // equal button
        else if (e.getSource() == equalButton) {
            String newValue = display_label.getText();

            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);

            if (symbolOfOperator == 1) {
                result = oldValueF / newValueF;
            } else if (symbolOfOperator == 2) {
                result = oldValueF + newValueF;
            } else if (symbolOfOperator == 3) {
                result = oldValueF - newValueF;
            } else if (symbolOfOperator == 4) {
                result = oldValueF * newValueF;
            }

            // If we add a number + "" we can convert the number into string
            display_label.setText(result + "");
        }
    }
}
