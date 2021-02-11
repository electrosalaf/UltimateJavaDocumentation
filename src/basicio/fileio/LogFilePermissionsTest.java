package basicio.fileio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class LogFilePermissionsTest {

    public static void main(String[] args) {

        //  Create set of options for appending to the file.
        Set<OpenOption> options = new HashSet<OpenOption>();
        options.add(APPEND);
        options.add(CREATE);

        //  Create custom permission attribute.
        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r-----");
        FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);

        //  Convert the string to a ByteBuffer.
        String s = "Hello World";
        byte data[] = s.getBytes();
        ByteBuffer bb = ByteBuffer.wrap(data);

        Path file = Paths.get("./permissions.log");

        try (SeekableByteChannel sbc = Files.newByteChannel(file, options, attr)){
            sbc.write(bb);
        } catch (IOException x) {
            System.err.println("Exception thrown: " + x);
        }

        //  Creating files
        try {
            //  create empty files with default permissions, etc.
            Files.createFile(file);
        } catch (FileAlreadyExistsException x) {
            System.err.format("file name %s already exists%n", file);
        } catch (IOException x) {
            //  some other sort of failure, such as permissions.
            System.err.format("createFile error: %s%n", file);
        }

        //  Creating a temporary files
        try {
            Path tempFile = Files.createTempFile(null, ".myapp");
            System.out.format("The temporary file has been created: %s%n", tempFile);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
