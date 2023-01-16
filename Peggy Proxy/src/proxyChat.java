import java.util.Scanner;

public class proxyChat implements HelpChat
{
    private String[] questions = {"kk","ok","got it"};
    private String[] askQuestions = {"kk","ok","got it"};
    private String[] nicety = {"hang in there","you got it","got it"};
    private HelpChat realChat;
    private static int questionAsked = 0;
    Scanner kb = new Scanner(System.in);

    @Override
    public String getCustomAnswer()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String askQuestion()
    {
        questionAsked += 1;
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String respond(String S)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String beNice()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
