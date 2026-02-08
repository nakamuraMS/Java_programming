package steps;

import calculator.Calculator;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class CalculatorSteps {

    private Calculator calculator;
    private int result;

    @Given("a calculator")
    public void a_calculator() {
        calculator = new Calculator();
    }

    @When("{int} plus {int}")
    public void plus(int a, int b) {
        result = calculator.add(a, b);
    }

    @Then("the result is {int}")
    public void the_result_is(int expected) {
        assertEquals(expected, result);
    }
}
