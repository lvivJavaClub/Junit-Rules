package ua.lviv.javaclub.junit4rulesdemo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class Demo_04_Timeout {
  @Rule
  public Timeout globalTimeout = Timeout.seconds(10);

  @Test
  public void givenLongRunningTest_whenTimout_thenTestFails() throws InterruptedException {
    TimeUnit.SECONDS.sleep(20);
  }
}
