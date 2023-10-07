package ua.lviv.javaclub.junit4rulesdemo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Demo_01_TemporaryFolderRuleTest {
  @Rule
  public TemporaryFolder tmpFolder = new TemporaryFolder();

  @Test
  public void givenTempFolderRule_whenNewFile_thenFileIsCreated() throws IOException {
    final File testFile = tmpFolder.newFile("test-file.txt");

    assertTrue("The file should have been created: ", testFile.isFile());
    assertEquals("Temp folder and test file should match: ",
        tmpFolder.getRoot(), testFile.getParentFile());
  }
}
