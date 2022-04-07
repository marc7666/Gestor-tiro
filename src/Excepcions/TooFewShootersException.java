package Excepcions;

/**
 * @project: Gestor-tiro.
 * @author: mcr99 on 07/04/2022.
 */
public class TooFewShootersException extends Exception {
    public TooFewShootersException(String message) {
        super(message);
    }
}
