# JUnit Learning

A collection of hands-on Java projects created while learning **JUnit testing**, from basic test setup to assertions, test lifecycle annotations, and Maven-based test configuration.

This repository documents my practical learning journey with **JUnit 4 and JUnit 5**. Each project focuses on a specific testing concept and keeps the examples small enough to understand and experiment with.

## Learning Objectives

- Understand the purpose of unit testing and how JUnit helps test Java code.
- Set up JUnit in Java and Maven projects.
- Write test methods and verify expected results.
- Use assertions to validate values, conditions, arrays, and exceptions.
- Display meaningful messages when tests fail.
- Understand JUnit 5 lifecycle annotations.
- Configure JUnit 5 with Maven.
- Compare basic JUnit 4 and JUnit 5 usage.

## Projects

| Project                                     | Focus                             | What it demonstrates                                                                                                                        |
| ------------------------------------------- | --------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `JUnit-01_CreatingMavenProject`             | Creating a Maven project          | Maven project structure, JUnit 4.13.1 test dependency, and a basic test for a calculator division method.                                   |
| `JUnit-02_CreatingJavaProject`              | Creating a Java project           | A basic Java project with a `ReverseString` class and a JUnit test using separate expected and actual variables.                            |
| `JUnit-03_InlineAssertions`                 | Inline assertions                 | Comparing the traditional expected/actual variable approach with passing the expected value and method result directly to `assertEquals()`. |
| `JUnit-04_TestOneParticularMethod`          | Testing a particular method       | Focused tests for `reverseString()`, including a single-word input and a sentence containing multiple words.                                |
| `JUnit-05_ShowingFailedMassage`             | Custom failure messages           | Supplying a custom message to an assertion so the reason for a failed test is easier to understand.                                         |
| `JUnit-06maven_SupplierFunctionalInterface` | Supplier-based assertion messages | Using a lambda expression (`() -> ...`) to provide a failure message lazily with JUnit 5 assertions.                                        |
| `JUnit-07_diffirentAssertion`               | Different assertion methods       | Practicing `assertEquals()`, `assertNotEquals()`, `assertTrue()`, `assertFalse()`, `assertArrayEquals()`, and `assertThrows()`.             |
| `JUnit-08_annotation`                       | JUnit lifecycle annotations       | Practicing `@BeforeAll`, `@AfterAll`, `@BeforeEach`, `@AfterEach`, and `@Test`.                                                             |
| `JUnit5-06`                                 | JUnit 5 project setup             | Starter Maven project configuration; no practical source or test classes are included yet.                                                  |
| `JUnit5-06maven`                            | JUnit 5 with Maven                | Starter Maven project configuration; no practical source or test classes are included yet.                                                  |

## Concepts Covered

### 1. Test Structure

- `@Test` identifies a test method.
- Test methods call the method being tested and verify its result.
- Expected and actual values can be stored in separate variables or passed directly into an assertion.

### 2. Assertions

The repository includes examples of these JUnit assertion methods:

| Assertion                                   | Purpose                                                             |
| ------------------------------------------- | ------------------------------------------------------------------- |
| `assertEquals(expected, actual)`            | Passes when the expected and actual values are equal.               |
| `assertNotEquals(unexpected, actual)`       | Passes when the values are different.                               |
| `assertTrue(condition)`                     | Passes when the condition is `true`.                                |
| `assertFalse(condition)`                    | Passes when the condition is `false`.                               |
| `assertArrayEquals(expected, actual)`       | Compares array contents and order.                                  |
| `assertThrows(Exception.class, executable)` | Passes when the executable code throws the expected exception type. |

### 3. Failure Messages

JUnit assertions can include a message to explain a failure. JUnit 5 also supports a message supplier, such as a lambda expression, so the message is generated only when needed.

### 4. Lifecycle Annotations

- `@BeforeAll` — runs once before all test methods in the test class.
- `@AfterAll` — runs once after all test methods in the test class.
- `@BeforeEach` — runs before each test method.
- `@AfterEach` — runs after each test method.

In JUnit 5, `@BeforeAll` and `@AfterAll` methods are normally `static` unless the test class uses `@TestInstance(Lifecycle.PER_CLASS)`.

## JUnit 4 and JUnit 5

This repository contains examples from both versions:

- **JUnit 4:** Uses imports such as `org.junit.Test` and `org.junit.Assert`.
- **JUnit 5 (Jupiter):** Uses imports such as `org.junit.jupiter.api.Test` and `org.junit.jupiter.api.Assertions`.

These APIs are not interchangeable. Use the matching test annotation, assertion imports, and test runner/provider for the JUnit version configured in a project.

The Maven project `JUnit-01_CreatingMavenProject` declares JUnit 4.13.1. The Maven project `JUnit-06maven_SupplierFunctionalInterface` declares JUnit Jupiter 5.10.0.

Some of the other projects are Eclipse Java projects rather than Maven projects, so their JUnit libraries are managed through the Eclipse project configuration.

## Technologies

- **Language:** Java
- **Testing frameworks:** JUnit 4, JUnit 5 (Jupiter)
- **Build tool:** Apache Maven (in selected projects)
- **IDE:** Eclipse IDE

## Running the Tests

### Maven projects

Open a terminal in the project directory containing the `pom.xml` file, then run:

```bash
mvn clean test
```

To run the full Maven test lifecycle and package the project:

```bash
mvn clean package
```

### Eclipse Java projects

1. Import the project into Eclipse.
2. Make sure the matching JUnit library is available on the project's build path.
3. Right-click the test class.
4. Select **Run As → JUnit Test**.

## Notes and Known Issues

This repository represents a learning-in-progress collection, so not every test is expected to pass in its current state.

- Some examples intentionally use incorrect expected values to demonstrate JUnit failure messages.
- In `JUnit-07_diffirentAssertion`, the `assertThrows()` example currently expects a `NullPointerException`, but the supplied array is non-null and sorting it does not normally throw that exception. The test needs to be revised to trigger the expected exception (or use a different expected exception).
- In `JUnit-06maven_SupplierFunctionalInterface`, the circle-area examples use expected values that do not match the current implementation's result (`3.14 × 5 × 5 = 78.5`). These examples currently demonstrate failed assertions rather than passing tests.
- `JUnit-05_ShowingFailedMassage` also contains an intentionally incorrect expected circle-area value to demonstrate a custom failure message.
- The two `JUnit5-06` starter folders currently contain Maven configuration only; practical source and test classes have not been added.

These examples can be improved as the learning process continues.

## Repository Structure

```text
JUnit_learning/
├── JUnit-01_CreatingMavenProject/
├── JUnit-02_CreatingJavaProject/
├── JUnit-03_InlineAssertions/
├── JUnit-04_TestOneParticularMethod/
├── JUnit-05_ShowingFailedMassage/
├── JUnit-06maven_SupplierFunctionalInterface/
├── JUnit-07_diffirentAssertion/
├── JUnit-08_annotation/
├── JUnit5-06/
└── JUnit5-06maven/
```

Each project contains its own source code and, where applicable, test classes and Maven configuration.

## Learning Progress

This repository is part of my ongoing journey to improve my Java development and software testing skills through practical exercises.

More JUnit concepts, test cases, and Maven-based testing examples will be added as I continue learning.

---

**Author:** RayanDEVR

**Status:** Learning in Progress
