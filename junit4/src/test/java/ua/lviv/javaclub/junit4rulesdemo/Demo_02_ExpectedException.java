package ua.lviv.javaclub.junit4rulesdemo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.isA;

public class Demo_02_ExpectedException {
  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void givenIllegalArgument_whenExceptionThrown_MessageAndCauseMatches() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectCause(isA(NullPointerException.class));
    thrown.expectMessage("This is illegal");

    throw new IllegalArgumentException("This is illegal", new NullPointerException());
  }
}
