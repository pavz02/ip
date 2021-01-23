public class InvalidTaskFormatException extends Exception {
    public InvalidTaskFormatException(String message) {
        super(message);
    }

    public void printMessage() {
        System.out.println(super.getMessage());
    }
}