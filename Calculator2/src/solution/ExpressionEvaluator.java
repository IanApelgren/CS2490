package solution;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Stack;

/**
 * This will be the 'logic' section and will contail all the calculations for Calculator2
 * @author Ian Apelgren
 * @version 1
 * 
 */
public class ExpressionEvaluator
{

    public static final Pattern UNSIGNED_DOUBLE =
            Pattern.compile("((\\d+\\.?\\d*)|(\\.\\d+))([Ee][-+]?\\d+)?.*?");
    public static final Pattern CHARACTER = Pattern.compile("\\S.*?");
    public Stack<Double> aswStack = new Stack<Double>();
    /**
     * Takes an infix expression and converts it to postfix.
     * 
     * @param expression
     *            The infix expression.
     * @return the postfix expression.
     */
    public String toPostfix(String expression)
    {
        // ... other local variables
        Scanner input = new Scanner(expression);
        String next;
        char symbol;
        String postfixExpression = "";
        Stack<Character> postStack = new Stack<Character>();

        while (input.hasNext())
        {
            if (input.hasNext(UNSIGNED_DOUBLE))
            {
                next = input.findInLine(UNSIGNED_DOUBLE);
                // TODO: do what you want to with a String that
                // holds a number
                postfixExpression += next + " ";
            }
            else if (input.hasNext(CHARACTER))
            {
                next = input.findInLine(CHARACTER);
                symbol = next.charAt(0);
                if (symbol == '(')
                {
                    postStack.push(symbol);
                }
                else if (symbol != '(' && symbol != ')' )
                {
                    while (postStack.isEmpty() == false && postStack.peek() != '(' && (orderOO(postStack.peek())) >= orderOO(symbol))
                    {
                        postfixExpression += postStack.pop() + " ";
                    }
                    postStack.push(symbol);
                }
                else if (symbol == ')')
                {
                    while(postStack.empty() != false && postStack.peek() != '(')
                    {
                        postfixExpression += postStack.pop() + " ";
                    }
                }
          
            }
        }
        while (!postStack.isEmpty())
        {
            
            postfixExpression += postStack.pop() + " ";
        }
        input.close();
        return postfixExpression;
    }
    /**
     * determines the order of operations.
     * @param n n
     * @return value
     */
    public int orderOO(Character n)
    {
        if (n == '*' || n == '/')
        {
            return 100;
        }
        else if (n == '+' || n == '-')
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    
    /**
     * Evaluates a postfix expression and returns the result.
     * 
     * @param postfixExpression
     *            The postfix expression.
     * @return The result of the expression.
     */
    public double evaluate(String postfixExpression)
    {
        // other local variables you may need
        Scanner input = new Scanner(postfixExpression);
        String next;
        char operator;
        double answer = Double.NaN;

        while (input.hasNext())
        {
            if (input.hasNext(UNSIGNED_DOUBLE))
            {
                next = input.findInLine(UNSIGNED_DOUBLE);
                double n = Double.parseDouble(next);
                aswStack.push(n);
            }
            else
            {
                next = input.findInLine(CHARACTER);
                operator = next.charAt(0);

                // TODO: do what you want to with an operator
                // such as *, /, +, -
                if (operator == '*' && aswStack.size() > 1)
                {
                    double right = aswStack.pop();
                    double left = aswStack.pop();
                    answer = left * right;
                    aswStack.push(answer);
                    
                }
                else if (operator == '/' && aswStack.size() > 1)
                {
                    double right = aswStack.pop();
                    double left = aswStack.pop();
                    answer = left / right;
                    aswStack.push(answer);
                    
                }
                else if (operator == '-' && aswStack.size() > 1)
                {
                    double right = aswStack.pop();
                    double left = aswStack.pop();
                    answer = left - right;
                    aswStack.push(answer);
                    
                }
                else if (operator == '+' && aswStack.size() > 1)
                {
                    double right = aswStack.pop();
                    double left = aswStack.pop();
                    answer = left + right;
                    aswStack.push(answer);
                    
                }
            }
        }
        input.close();
        return answer;
        
    }
    

}
