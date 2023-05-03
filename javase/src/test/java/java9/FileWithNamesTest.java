package java9;

import org.junit.jupiter.api.Test;
import training.java9.FileWithNames;

import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class FileWithNamesTest {

    @Test
    void getNames() {
        var file = new FileWithNames(Path.of("src/main/resources/names.txt"));
        assertThat(file.getNames()).containsExactly("John", "Jack", "Jane");
    }
}