package ua.lviv.javaclub.junit5rulesdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Demo_01_TemporaryFolderRuleTest {

//  @TempDir File/Path tmpFolder
  
  @Test
  void givenTempFolderRule_whenNewFile_thenFileIsCreated(@TempDir File tmpFolder) throws IOException {
    final File testFile = new File(tmpFolder, "test-file.txt");
    
    List<String> lines = Arrays.asList("x", "y", "z");

    Files.write(testFile.toPath(), lines);

    assertTrue(testFile.isFile());
  }
}
