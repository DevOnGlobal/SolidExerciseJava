package nl.cynetic.solidexercises.services;

public interface Logger {
    void logMessage(String message);
    void logMessage(String messageTemplate, Object...args);
}