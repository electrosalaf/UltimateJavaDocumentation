package basicio.fileio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class FileTest {
    public static void main(String[] args) throws IOException {

        if (args.length < 1) {
            System.out.println("usage: FileTest file");
            System.exit(-1);
        }

        //  Converts the input string to a Path object.
        Path inputPath = Paths.get(args[0]);

        Path fullPath = inputPath.toAbsolutePath();

        try {
            Path fp = fullPath.toRealPath();
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", fullPath);
            //  Logic for case when file does not exist.
        } catch (IOException x) {
            System.err.format("%s%n", x);
            //  Logic for other sort of file error.
        }

        //Solaris
        // You can join paths by using the resolve keyword
        //  Pass in the partial path and the path with root element.
        Path p1 = Paths.get("/home/IbrahimLawal/UltimateJavaDocumentation");
        //  Result is /home/IbrahimLawal/UltimateJavaDocumentation/basicio/FileTest
        System.out.format("%s%n", p1.resolve("basicio/FileTest"));

        //  Microsoft Windows
        Path p2 = Paths.get("C:\\home\\IbrahimLawal\\UltimateJavaDocumentation");
        System.out.format("%s%n", p2.resolve("basioio\\FileTest"));

        Charset charset = Charset.forName("US-ASCII");
        String s = "";
        try (BufferedWriter writer = Files.newBufferedWriter(fullPath, charset)) {
            writer.write(s, 0, s.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        //  Alternatively, embedding the file I/O methods in a try block and catching any exceptions in a catch block.
        Charset charset1 = Charset.forName("US-ASCII");
        String s1 = "";
        BufferedWriter writer = null;
        try {
            writer = Files.newBufferedWriter(fullPath, charset);
            writer.write(s, 0, s.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        } finally {
            if (writer != null) writer.close();
        }

        //  How the getFile method can be used
        Charset charset2 = Charset.forName("US-ASCII");
        String s2 = "";
        BufferedWriter writer1 = null;
        try {
            writer1 = Files.newBufferedWriter(fullPath, charset);
            writer1.write(s, 0, s.length());
        } catch (NoSuchFileException x) {
            System.err.format("%s does not exist%n", x.getFile());
        }

        //  Checking file accessibility
        Path file = Paths.get("/home/foo/bar");
        boolean isRegularExecutableFile = Files.isRegularFile(file) &
                Files.isReadable(file) & Files.isExecutable(file);

        // Checking if two paths locate the same file
        Path file1 = Paths.get("/home/foo/bar");
        Path file2 = Paths.get("/home/foo/bar");

        if (Files.isSameFile(file1, file2)) {
        }

        // Deleting a file or directory
        try {
            Files.delete(fullPath);
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", fullPath);
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", fullPath);
        } catch (IOException x) {
            //  File permission problems are found here.
            System.err.println(x);
        }

        // Get basic file attributes
        Path file3 = Paths.get("/User/user/Desktops");
        BasicFileAttributes attributes = Files.readAttributes(file3, BasicFileAttributes.class);

        System.out.println("creationTime: " + attributes.creationTime());
        System.out.println("lastAccessTime: " + attributes.lastAccessTime());
        System.out.println("lastModifiedTime: " + attributes.lastModifiedTime());

        System.out.println("isDirectory:" + attributes.isDirectory());
        System.out.println("isOther: " + attributes.isOther());
        System.out.println("isRegularFile:" + attributes.isRegularFile());
        System.out.println("isSymbolicLink: " + attributes.isSymbolicLink());
        System.out.println("size: " + attributes.size());

        //  Setting Time Stamps
        long currentTime = System.currentTimeMillis();
        FileTime ft = FileTime.fromMillis(currentTime);
        Files.setLastModifiedTime(file3, ft);

        //  DOS File Attributes
        try {
            DosFileAttributes attributes1 = Files.readAttributes(file3, DosFileAttributes.class);
            System.out.println("isReadOnly is: " + attributes1.isReadOnly());
            System.out.println("isHidden is: " + attributes1.isHidden());
            System.out.println("isArchive is: " + attributes1.isArchive());
            System.out.println("isSystem is: " + attributes1.isSystem());
        } catch (UnsupportedOperationException x) {
            System.err.println("DOS file attributes not supported: " + x);
        }

        // POSIX File Permissions
        // POSIX: Portable Operating System Interface for UNIX

        // The readAllBytes method is used to read the content of a small file at a go, not large files
        byte[] fileArray;
        fileArray = Files.readAllBytes(file);

        //  Reading a file using Buffered stream I/O
        Charset charset3 = Charset.forName("US-ASCII");
        try (BufferedReader reader = Files.newBufferedReader(file, charset3)){
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        // Writing a file using Buffered stream I/O
        Charset charset4 = Charset.forName("US-ASCII");
        String s3;

        try (BufferedWriter writer2 = Files.newBufferedWriter(file, charset4)){
            writer.write(s, 0, s.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        //  Reading a file by using I/O streams
        try (InputStream in = Files.newInputStream(file);
             BufferedReader reader = new BufferedReader(new InputStreamReader(in))){
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.println(x);
        }

        //  Reading and writing files using Channel I/O
        //Defaults to read
        try (SeekableByteChannel sbc = Files.newByteChannel(file)){
            ByteBuffer buf = ByteBuffer.allocate(10);

            //  Read the bytes for different encoding for this platform.
            //  If you skip this step, you might see something that looks
            //  like Chinese characters when you expect Latin-style characters.
            String encoding = System.getProperty("file.encoding");
            while (sbc.read(buf) > 0) {
                buf.rewind();
                System.out.println(Charset.forName(encoding).decode( buf));
                buf.flip();
            }
        } catch (IOException x) {
            System.err.println("caught exception: " + x);
        }

        //  Random access files
        String s4 = "I was here!\n";
        byte data[] = s4.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);

        ByteBuffer copy = ByteBuffer.allocate(12);

        try (FileChannel fc = FileChannel.open(file, READ, WRITE)) {
            //  Read the first 12 bytes of the file.
            int nread;
            do {
               nread = fc.read(copy);
            } while (nread != -1 && copy.hasRemaining());

            //  Write "I was here!" at the beginning of the file.
            fc.position(0);
            while (out.hasRemaining())
                fc.write(out);
            out.rewind();

            //  Move to the end of the file. Copy the first byte 12 bytes to
            // the end of the file. Then write "I was here!" again.
            long length = fc.size();
            fc.position(length - 1);
            copy.flip();
            while (copy.hasRemaining())
                fc.write(copy);
        } catch (IOException x) {
            System.out.println("I/O Exception: " + x);
        }
    }
}
