import java.util.HashMap;

public class Account
{
    private static Account uniqueInstance;
    private HashMap<String,String> accInfo = new HashMap<String,String>();
    
    private Account() {}
    
    public static synchronized Account getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Account();
        }
        return uniqueInstance;
    }

    public void add(String accountName, String password)
    {
        accInfo.put(accountName, password);  
    }

    public String get(String accountName)
    {
        String ret = accInfo.get(accountName);
        return ret;
    }

    public void remove(String accountName)
    {
        accInfo.remove(accountName);
        
    }
}
