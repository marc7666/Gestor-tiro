package Excepcions;

/**
 * @project: Gestor-tiro.
 * @author: mcr99 on 07/04/2022.
 */
public class TooManyShootersException extends Exception {
    public TooManyShootersException(String message) {
        super(message);
    }
}
