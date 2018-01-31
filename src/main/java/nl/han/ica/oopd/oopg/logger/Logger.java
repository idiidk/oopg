package nl.han.ica.oopd.oopg.logger;

/**
 * Indicates if the object is a Logger.
 */
public interface Logger {
	
    void addLogHandler(LogHandler logHandler);

    void removeLogHandler(LogHandler logHandler);

    boolean logln(int level, String message);
}
