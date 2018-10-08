package helpers;

public class Logger {
    private static Logger ourInstance =null;

    public static Logger getInstance() {
        if (ourInstance == null)
           ourInstance = new Logger();
        return ourInstance;
    }

    private Logger() {

    }
    public void write(String msg, String severity){
        System.out.println(severity.toUpperCase()+"> \t "+msg);
    }

}
