package com.abstraction.test;
interface Logger {
    default void logInfo(String msg) {
        log("INFO", msg);
    }

    default void logError(String msg) {
        log("ERROR", msg);
    }

    // Private helper method to reuse logic
    private void log(String level, String msg) {
        System.out.println("[" + level + "]: " + msg);
    }
}

public class UsingInterface {

}
