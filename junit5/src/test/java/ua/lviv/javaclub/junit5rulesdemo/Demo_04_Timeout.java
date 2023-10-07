package ua.lviv.javaclub.junit5rulesdemo;


import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class Demo_04_Timeout {

  @Test
//  @Timeout(25, unit = TimeUnit.SECONDS)
  void givenLongRunningTest_whenTimout_thenTestFails() throws InterruptedException {
    TimeUnit.SECONDS.sleep(20);
  }

  @Nested
  class NestedClassWithoutTimeout {
    @Test
    void shouldFailAfterParentsDefaultTimeoutOfFiveSeconds() throws InterruptedException {
      Thread.sleep(15_000);
    }
  }
}
