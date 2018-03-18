package IReader.printers;

public class AdvanceConsolePrinter implements IPrinter {
    @Override
    public void print(String text) {
        System.out.println(String.format("String length: %d", text.length()));
    }
}
