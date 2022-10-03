package pl.pkrawiec.library.exception;

//wyjątek kontrolowany - trzeba obsłużyć
public class NoSuchOptionException extends Exception {
    public NoSuchOptionException(String message) {
        super(message);
    }
}
