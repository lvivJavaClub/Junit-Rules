package ua.lviv.javaclub.junit5rulesdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Demo_02_ExpectedException {

  @Test
  void givenIllegalArgument_whenExceptionThrown_MessageAndCauseMatches() {
    final RuntimeException actual = assertThrows(IllegalArgumentException.class, () -> {
          throw new IllegalArgumentException("This is illegal", new NullPointerException());
        }
    );

    assertNotNull(actual);
    assertEquals("This is illegal", actual.getMessage());
    assertEquals(IllegalArgumentException.class, actual.getClass());
    assertEquals(NullPointerException.class, actual.getCause().getClass());
  }
}
