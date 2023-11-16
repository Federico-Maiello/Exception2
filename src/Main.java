public class Main {

    public static void main(String[] args) throws NotANumberException {
        char character = 'f';
        checkIfNumber(character);
    }

    public static void checkIfNumber(char character) throws NotANumberException {
        if (Character.isDigit(character)) {

            System.out.println("The char is number.");
        } else {

            throw new NotANumberException("The char isn't number.");
        }
    }
}

class NotANumberException extends Exception {
    public NotANumberException(String message) {
        super(message);
    }
}
