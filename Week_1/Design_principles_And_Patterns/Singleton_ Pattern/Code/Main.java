public class Main {

    public static void main(String[] args) {
        Logger firstLogger = Logger.getInstance();
        Logger secondLogger = Logger.getInstance();

        if (firstLogger == secondLogger) {
            System.out.println("firstLogger and secondLogger point to the same object");
        } else {
            System.out.println("firstLogger and secondLogger are different objects");
        }

        System.out.println();

        checkLogger(firstLogger, secondLogger);
    }

    public static void checkLogger(Logger firstLogger, Logger secondLogger) {
        firstLogger.setCredentials("sakthi", "12345");
        secondLogger.setCredentials("vel", "67890");

        System.out.println("firstLogger details:");
        firstLogger.showCredentials();
       
        System.out.println("secondLogger details:");
        secondLogger.showCredentials();

        System.out.println("\nBoth are same because only one Logger object exists (Singleton Pattern)");
    }
}