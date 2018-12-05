public class VarillazoException extends Exception {
    public VarillazoException() {
        super();
        try {
            for (int i = 0; i < 20; i++) {
                System.err.println("         | ");
                System.err.println("        o/");
                System.err.println("       /|");
                System.err.println("       /\\");
                Thread.sleep(300);
                System.err.println("        o ");
                System.err.println("       /|\\__");
                System.err.println("       /\\ ");
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public VarillazoException(String message) {
        this();
        System.err.println(message);
    }

    public static void main(String[] args) {
        try {
            throw new VarillazoException();
        } catch (VarillazoException e) {
            e.printStackTrace();
        }
    }
}
