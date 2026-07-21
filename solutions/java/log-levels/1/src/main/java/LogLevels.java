public class LogLevels {
    
    public static String message(String logLine) {
        String[] log = logLine.replaceAll("[\\[:\\]]", "").trim().split(" ");
        String message = " ";
        for(int i = 1; i < log.length; i++){
            message += log[i] + " ";
        }
        return message.trim();
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
    }

    public static String logLevel(String logLine) {
        String[] log = logLine.replaceAll("[\\[:\\]]", "").trim().split(" ");
        String level = log[0].toLowerCase();
        return level;
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
    }

    public static String reformat(String logLine) {
        String reformat = message(logLine) + " (" + logLevel(logLine) + ")";
        return reformat;
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
    }
}
