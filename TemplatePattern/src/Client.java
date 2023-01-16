
public class Client
{

    public static void main(String[] args)
    {
        Worker MM = new Manager("Manager", "5:30 PM", 2);
        Worker CS = new CSMajor("Computer Science Major", "1:20 AM", 6);
        Worker FM = new Farmer("farmer", "6:00 AM", 10);
        MM.dailyRoutine();
        CS.dailyRoutine();
        FM.dailyRoutine();

    }

}
