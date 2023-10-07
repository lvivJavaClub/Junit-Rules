package ua.lviv.javaclub.junit5rulesdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.RegisterExtension;

class Demo_08_LoggingExtension {

  @RegisterExtension
//  LoggingExtension staticExtension = new LoggingExtension("instance version");
  static LoggingExtension staticExtension = new LoggingExtension("static version");

  @Test
  void shouldDoNothing1() {
//staticExtension.type
  }

  @Test
  void shouldDoNothing2() {
  }

  public static class LoggingExtension implements BeforeAllCallback, BeforeEachCallback {
    public final String type;

    public LoggingExtension(String type) {
      this.type = type;
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
      System.out.println("Type " + type + "In beforeAll: " + extensionContext.getDisplayName());
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) {
      System.out.println("Type " + type + " In beforeEach:" + extensionContext.getDisplayName());
    }
  }
}
