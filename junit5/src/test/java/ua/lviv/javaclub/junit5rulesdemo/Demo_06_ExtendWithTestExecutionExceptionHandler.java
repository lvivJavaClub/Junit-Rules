package ua.lviv.javaclub.junit5rulesdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

import java.io.FileNotFoundException;

@ExtendWith(Demo_06_ExtendWithTestExecutionExceptionHandler.IgnoreFileNotFoundExceptionExtension.class)
class Demo_06_ExtendWithTestExecutionExceptionHandler {

  @Test
  void shouldThrowsFileNotFoundException() throws FileNotFoundException {
    throw new FileNotFoundException("");
  }
  
  
  
  
  
  
  
  
  
  
  public static class IgnoreFileNotFoundExceptionExtension implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
      if (throwable instanceof FileNotFoundException) {
        System.out.println("IgnoreFileNotFoundExceptionExtension:" + context.getDisplayName());
        return;
      }
      throw throwable;
    }
  }
}
