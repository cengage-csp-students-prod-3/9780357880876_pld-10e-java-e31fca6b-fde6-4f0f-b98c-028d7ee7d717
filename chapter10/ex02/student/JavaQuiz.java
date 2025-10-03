import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JavaQuiz
{
    JPanel myPanel;
	

    JavaQuiz()
    {
        // ✅ Task 2: Create the three JLabels with appropriate text
        JLabel labelQuestion = new JLabel("Do you like GUI programming? Vote Yes or No.");
        JLabel labelYes = new JLabel("Click here to vote \"Yes\"");
        JLabel labelNo = new JLabel("Click here to vote \"No\"");

        // ✅ Task 3: Create the two JButton components
        final JButton buttonYes = new JButton("Yes");
        final JButton buttonNo = new JButton("No");

        // ✅ Task 4: Add event handlers to change background color
        buttonYes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Set the JPanel background color to yellow
                myPanel.setBackground(Color.YELLOW);
            }
        });

        buttonNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Set the JPanel background color to red
                myPanel.setBackground(Color.RED);
            }
        });

        // ✅ Task 1: Create a JPanel named myPanel
        myPanel = new JPanel();
        myPanel.setLayout(new FlowLayout()); // optional layout

        // Add components to JPanel
        myPanel.add(labelQuestion);
        myPanel.add(labelYes);
        myPanel.add(buttonYes);
        myPanel.add(labelNo);
        myPanel.add(buttonNo);
    }

    public static void main(String args[])
    {
        JavaQuiz quiz = new JavaQuiz();
        JFrame frame = new JFrame("Java Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(quiz.myPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
