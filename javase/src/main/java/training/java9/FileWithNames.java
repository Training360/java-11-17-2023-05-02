package training.java9;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FileWithNames {

    private List<String> names;

    @SneakyThrows
    public FileWithNames(Path path) {
        Stream<String> lines = Files.lines(path);
        try (lines) {
            names = lines.filter(FileWithNames::notComment).toList();
//        } catch (IOException ioe) {
//            throw new RuntimeException("Can not read file: %s".formatted(path.toString()), ioe);
        }

//        Scanner scanner = new Scanner(FileWithNames.class.getResourceAsStream("/names.txt"));
//        try (scanner) {
//            names = scanner.tokens().filter(FileWithNames::notComment).toList();
//        }
    }

    private static boolean notComment(String s) {
        return !s.trim().startsWith("#");
    }

    public List<String> getNames() {
        return this.names;
    }
}
