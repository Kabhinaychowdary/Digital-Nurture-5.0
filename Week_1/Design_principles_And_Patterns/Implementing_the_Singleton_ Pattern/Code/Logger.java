public class Logger {

    private static Logger singleInstance;

    private String userName;
    private String userPassword;

    private Logger() {
    }

    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    public void setCredentials(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public void showCredentials() {
        System.out.println("Name: " + userName);
        System.out.println("Pass: " + userPassword);
    }
}