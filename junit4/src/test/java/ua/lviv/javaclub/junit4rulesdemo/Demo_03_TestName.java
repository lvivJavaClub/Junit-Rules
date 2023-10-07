package ua.lviv.javaclub.junit4rulesdemo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

public class Demo_03_TestName {
  @Rule
  public TestName name = new TestName();

  @Test
  public void givenAddition_whenPrintingTestName_thenTestNameIsDisplayed() {
    assertEquals("givenAddition_whenPrintingTestName_thenTestNameIsDisplayed",
        name.getMethodName());
  }
}
