using System.Text.RegularExpressions;

static class LogLine
{
    public static string Message(string logLine)
    {
        string message = logLine.Remove(0, logLine.IndexOf(":") + 1);
        return message.Trim();
        //throw new NotImplementedException("Please implement the (static) LogLine.Message() method");
    }

    public static string LogLevel(string logLine)
    {
        string level = logLine.Remove(logLine.IndexOf(":"));
        level = Regex.Replace(level, @"[\[\]]", "");
        return level.ToLower().Trim();
        //throw new NotImplementedException("Please implement the (static) LogLine.LogLevel() method");
    }

    public static string Reformat(string logLine)
    {
        return $"{Message(logLine)} ({LogLevel(logLine)})";
        //throw new NotImplementedException("Please implement the (static) LogLine.Reformat() method");
    }
}
