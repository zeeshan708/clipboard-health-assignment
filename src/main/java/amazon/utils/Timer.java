package amazon.utils;

/**
 * @author Zeeshan Asghar
 * This class contains methods to globally set / get time to wait for web elements to load.
 * @date 24-10-2022
 */
public class Timer {

    /**
     * Default constructor
     */
    public Timer() {
    }

    /**
     * returns the default time of 60 seconds
     */
    public static int getWaitTime() {
        return 60;
    }

    /**
     * returns the short time of 30 seconds
     */
    public static int getShortWaitTime() {
        return 30;
    }

    /**
     * returns the long time of 200 seconds
     */
    public static int getLongWaitTime() {
        return 200;
    }
}
