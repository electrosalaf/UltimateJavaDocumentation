package NumbersAndStrings.Strings;

public class Filename {
    private String fullpath;
    private char pathSeparator, extensionSeparator;

    public Filename(String str, char sep, char ext) {
        fullpath = str;
        pathSeparator = sep;
        extensionSeparator = ext;
    }

    public String extension() {
        int dot = fullpath.lastIndexOf(extensionSeparator);
        return fullpath.substring(dot + 1);
    }

    //  Gets filename without extension
    public String filename() {
        int dot = fullpath.lastIndexOf(extensionSeparator);
        int sep = fullpath.lastIndexOf(pathSeparator);
        return fullpath.substring(sep + 1, dot);
    }
    
    //  Get path of the file without filename and extension
    public String path() {
        int sep = fullpath.lastIndexOf(pathSeparator);
        return fullpath.substring(0, sep);
    }
}
