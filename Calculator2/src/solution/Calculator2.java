package solution;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This Is the "model" of  the calculator2 lab
 * and will contain all of the GUI elements in it
 * @author Ian Apelgren
 * @version 1
 * 
 */
public class Calculator2
{
    JFrame calcFrame;
    
    JLabel equals;
    JLabel results;
    
    JButton clearButton;
    JButton calculate;
    
    JTextField infixExpression;
    
    JPanel inputPanel;
    JPanel buttonsPanel;
    
    
    /**
     * Constructor.
     */
    public Calculator2()
    {
      
        calcFrame = new JFrame();
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.setLocation(100,100);
        calcFrame.setSize(400,400);
        calcFrame.setTitle("CALCULATOR2");
        
        equals = new JLabel("=");
        equals.setName("equals");
        
        results = new JLabel("");
        results.setName("results");
        
        clearButton = new JButton("Clear");
        clearButton.setName("clearButton");
        
        calculate = new JButton("Calc");
        calculate.setName("calculateButton");
        
        infixExpression = new JTextField(10);
        infixExpression.setName("infixExpression");
        
        
        buttonsPanel = new JPanel();
        inputPanel = new JPanel();
        
        buttonsPanel.add(calculate);
        buttonsPanel.add(clearButton);
        inputPanel.add(infixExpression);
        inputPanel.add(equals);
        inputPanel.add(results);
        
        calcFrame.add(inputPanel, BorderLayout.NORTH);
        calcFrame.add(buttonsPanel, BorderLayout.SOUTH);
        addActionListeners();
        
        calcFrame.pack();
        
       
        calcFrame.setVisible(true);
         
        
    }
    
    public void addActionListeners()
    {
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                String postFix;
                double result;
                String answer;
                ExpressionEvaluator calc = new ExpressionEvaluator();
                postFix = calc.toPostfix(infixExpression.getText());
                if (!postFix.equals("error"))
                {
                    result = calc.evaluate(postFix);
                    answer = String.valueOf(result);
                    results.setText(answer);
                }
                else
                {
                    results.setText("error");
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                infixExpression.setText("");
            }
        });
    }
    
    
    
    /**
     * gets frame.
     * @return clacFrame
     */
    public JFrame getFrame()
    {
        return calcFrame;
    }
    
}
