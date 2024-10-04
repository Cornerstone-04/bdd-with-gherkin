package calc;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private int firstNumber = 0;
    private int secondNumber = 0;
    private int result = 0;
    private String operation = "";

    @Given("I have entered the number {int} into the calculator")
    public void i_have_entered_the_number_into_the_calculator(int number) {
        firstNumber = number;
    }

    @When("I press the add button")
    public void i_press_the_add_button() {
        operation = "add";
    }

    @When("I press the subtract button")
    public void i_press_the_subtract_button() {
        operation = "subtract";
    }

    @And("I have entered another number {int} into the calculator")
    public void i_have_entered_another_number_into_the_calculator(int number) {
        secondNumber = number;
    }

    @Then("the result displayed should be {int}")
    public void the_result_displayed_should_be(int expectedResult) {
        if (operation.equals("add")) {
            result = firstNumber + secondNumber;
        } else if (operation.equals("subtract")) {
            result = firstNumber - secondNumber;
        }
        assertEquals(expectedResult, result);
    }
}