package NumbersAndStrings.Strings;

public class FilenameDemo {
    public static void main(String[] args) {
        final String FPATH = "/home/Users/user/Desktop/Algo/tutorial/java/data/manipstring.html";
        Filename myHomePage = new Filename(FPATH, '/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
    }
}
