//package basicio.fileio;
//
//import java.nio.file.*;
//import java.nio.file.attribute.FileAttribute;
//import java.nio.file.attribute.PosixFilePermission;
//import java.nio.file.attribute.PosixFilePermissions;
//import java.util.Set;
//
//public class Directories {
//
//    Path dir = Paths.get("/home/Desktop");
//
//    //  Listing a File System's Root Directories
//    Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
//    for (Path name: dirs) {
//        System.err.println(name);
//    }
//
//    //  Creating a file
//    Files.createDirectory(Path);
//
//    Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-x---");
//    FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(perms);
//    Files.createDirectory(file, attr);
//
//    Files.createDirectories(Paths.get("foo/bar/test"));
//
//    //  List a directory's contents
//    try (DirectoryStream<Path> )
//
//}
