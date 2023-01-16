import java.util.Scanner;

public class realChat implements HelpChat
{
    Scanner kb = new Scanner(System.in);

    @Override
    public String getCustomAnswer()
    {
        String custom = kb.next();
        
        return custom;
    }

    @Override
    public String askQuestion()
    {
        String custom = kb.next();
        return custom;
    }

    @Override
    public String respond(String S)
    {
        System.out.println(S);
        String custom = kb.next();
        return custom;
    }

    @Override
    public String beNice()
    {
        String custom = kb.next();
        return custom;
    }

}
