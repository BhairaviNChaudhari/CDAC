package a7.Assignment.oop;
//2.	Design and implement a class named Logger to manage logging messages for an application.
//The class should be implemented as a singleton to ensure that only one instance of the Logger exists
//throughout the application.
//
//The class should include the following methods:
//•	getInstance(): Returns the unique instance of the Logger class.
//•	log(String message): Adds a log message to the logger.
//•	getLog(): Returns the current log messages as a String.
//•	clearLog(): Clears all log messages.
public class Logger {
        private static Logger instance = null;
    private String logMessages;
   
    private Logger() {
        logMessages = "";
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public void log(String message) {
        logMessages += message + "\n";
    }
    
    public String getLog() {
        return logMessages;
    }
    
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        
     
        logger.log("First log message");
        logger.log("Second log message");
        
      
        System.out.println("Log contents:");
        System.out.println(logger.getLog());
        
       
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Third log message");
       
        System.out.println("\nUpdated log contents:");
        System.out.println(logger.getLog());
    }
}



//Log contents:
//First log message
//Second log message
//
//
//Updated log contents:
//First log message
//Second log message
//Third log message
