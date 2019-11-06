package nl.cynetic.solidexercises.services.impl;

import java.io.PrintWriter;

import nl.cynetic.solidexercises.services.Logger;

public class ConsoleLogger implements Logger {
    
    @Override
    public void logMessage(String message) {
        this.getWriter().println(message);
    }

    @Override
    public void logMessage(String messageTemplate, Object...args) {
        this.getWriter().println(String.format(messageTemplate, args));
    }

    private PrintWriter getWriter() {
        return System.console().writer();
    }
}