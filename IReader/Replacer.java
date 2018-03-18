package IReader;

import IReader.Readers.IReader;
import IReader.Readers.PredefinedReader;
import IReader.printers.AdvanceConsolePrinter;
import IReader.printers.CosolePrinter;
import IReader.printers.IPrinter;

public class Replacer{
    private final IReader reader;
    private final IPrinter printer;

    public Replacer(final IReader reader, final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public void replacer(){
        final String text = reader.read();
        final String replacedText = text.replace(":)", "=)");
        printer.print(replacedText);
    }

    public static void main(String[] args) {
        final IReader reader = new PredefinedReader("hkhdj :) hjk hj h ghg :)");
        final IPrinter printer = new CosolePrinter();
        final IPrinter advPrinter = new AdvanceConsolePrinter();
        final Replacer replacer = new Replacer(reader, printer);
        replacer.replacer();
        final Replacer advReplacer = new Replacer(reader, advPrinter);
        advReplacer.replacer();
    }
}
