# Junit-Rules


## Junit4-Rules

* Demo_01_TemporaryFolderRuleTest.java @Rule TemporaryFolder
* Demo_02_ExpectedException.java @Rule ExpectedException
* Demo_03_TestName.java @Rule TestName
* Demo_04_Timeout.java @Rule Timeout
* Demo_05_Retry.java own @Rule RetryRule implements TestRule
* Demo_06_Verifier.java own @Rule Verifier implements TestRule
* Demo_07_ExternalResource.java own @Rule ExternalResource implements TestRule
* Demo_08_ClassExternalResource.java own @ClassRule ExternalResource implements TestRule

## Junit5-Rules

* Demo_01_TemporaryFolderRuleTest.java @TempDir File/Path
* Demo_02_ExpectedException.java assertThrows
* Demo_03_TestName.java TestInfo
* Demo_04_Timeout.java @Timeout
* Demo_05_Retry.java @RetryingTest from org.junitpioneer.jupiter
* Demo_06_ExtendWithTestExecutionExceptionHandler.java  own  IgnoreFileNotFoundExceptionExtension implements 
  TestExecutionExceptionHandler
* Demo_07_ExtendWithCondition.java  own  EnvironmentExtension implements ExecutionCondition
* Demo_08_ExtendWithCondition.java  own  @RegisterExtension

https://www.baeldung.com/junit-4-rules
