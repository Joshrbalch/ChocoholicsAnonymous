package chocaholicsAnonymous;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        date.printDateNow();
        mainTerminal terminal = new mainTerminal();
        terminal.displayMainMenu();
        System.exit(0);
    }
}
