package FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileIO {
    public static void main(String[] args) {
//        System.out.println(getFilePath("src","fileIO","test.txt").toAbsolutePath());
//        System.out.println("Does the path exists?");
//        System.out.println(doesPathExists(
//                getFilePath("src","fileIO","test.txt")
//));
        tryCreateDirectory(getPath("src", "fileIO", "files")
        );

        Path path = getPath("src", "fileIO", "files");
        tryCreateFile(path);

        path = Paths.get(path.toString(),"test.txt");

        System.out.println(path.toAbsolutePath());
    }

    public static Path getPath(String fileName) {
        return Paths.get(fileName);
    }

    public static Path getPath(String parentDirectory, String fileName) {
        return Paths.get(parentDirectory, fileName);
    }

    public static Path getPath(String parentDirectory, String childDirectory, String fileName) {
        return Paths.get(parentDirectory, childDirectory, fileName);
    }

    public static boolean doesPathExists(Path path) {
        return Files.exists(path);
    }

    public static void tryCreateDirectory(Path pathToCreate) {

        if (!doesPathExists(pathToCreate)) {

            try {
                Files.createDirectory(pathToCreate);
            } catch (IOException e) {
                System.out.println("Couldn't not create directory at: ");
                System.out.println(pathToCreate.toAbsolutePath());
            }
        } else {
            System.out.println("The path at: " + pathToCreate.toAbsolutePath() + "already exists");
        }
    }

    public static void tryCreateFile(Path path){
        if (!doesPathExists(path)) {

            try {
                Files.createFile(path);
            } catch (IOException e) {
                System.out.println("Couldn't not create directory at: ");
                System.out.println(path.toAbsolutePath());
            }
        } else {
            System.out.println("The path at: " + path.toAbsolutePath() + "already exists");
        }
    }
    }

