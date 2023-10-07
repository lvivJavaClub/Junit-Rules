package ua.lviv.javaclub.junit5rulesdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.io.FileNotFoundException;

@ExtendWith(Demo_07_ExtendWithCondition.EnvironmentExtension.class)
class Demo_07_ExtendWithCondition {

  @Test
  void shouldDoNothing() throws FileNotFoundException {
  }

  public static class EnvironmentExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
      String env = System.getenv().getOrDefault("MY_ENV_VARIABLE", "test");
      if ("qa".equalsIgnoreCase(env)) {
        return ConditionEvaluationResult.disabled("Test disabled on QA environment");
      }

      return ConditionEvaluationResult.enabled("Test enabled on QA environment");
    }
  }
}
