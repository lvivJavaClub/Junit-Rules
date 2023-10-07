package ua.lviv.javaclub.junit5rulesdemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Display-class-name")
@Tag("test-class")
class Demo_03_TestName {

  @Test
  @Tags(value = {
      @Tag("test-method"),
      @Tag("test-info")
  })
  @DisplayName("Display-test-name")
  void givenAddition_whenPrintingTestName_thenTestNameIsDisplayed(TestInfo testInfo) {
    System.out.println("DisplayName:" + testInfo.getDisplayName());
    System.out.println("TestMethod:" + testInfo.getTestMethod());
    System.out.println("TestClass:" + testInfo.getTestClass());
    System.out.println("Tags:" + testInfo.getTags());
  }
}
