# Behaviour Driven Development with Gherkin and Playwright

## Keywords

```feature
@Calculator
Feature: Calculator Functionality
    Background:
        Given I have a calculator

@addition
Scenario: adding two numbers
    Given I have entered the number 10 into the calckator
    When I press the add button
    And I have entered another number 5 into the calculator
    Then the result displayed should be 15
```

1. Given: this establishes the context and describes the initial state of the system before any interractions occur.
2. When: capturtes users actions/events that occurs within the system.
3. And/But: used to add additional conditions, or outcomes.
4. Then: expected outcome (assertions).
5. Background: Steps that should be executed before each scenario.
6. Scenario Outline: to run same scenario with different data sets.
7. Examples: To provide different data sets.
