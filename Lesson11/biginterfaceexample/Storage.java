package Lesson11.biginterfaceexample;

public class Storage {
    private File[] files;

    public Storage(File[] files) {
        this.files = files;
    }

    public File[] getFiles() {
        return files;
    }
}
