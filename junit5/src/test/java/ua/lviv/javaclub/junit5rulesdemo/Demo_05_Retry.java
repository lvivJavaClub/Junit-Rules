package ua.lviv.javaclub.junit5rulesdemo;

import org.junitpioneer.jupiter.DisabledUntil;
import org.junitpioneer.jupiter.RetryingTest;

import java.util.SplittableRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisabledUntil(date = "2023-01-01")
class Demo_05_Retry {
  private SplittableRandom splittableRandom = new SplittableRandom();

  @RetryingTest(value = 10)
  void givenRandomGeneratorIntTest_whenRetry_thenTestFails() {
    assertEquals(0, splittableRandom.nextInt(0, 10) % 9);
  }
}
