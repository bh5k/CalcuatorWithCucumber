import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorStepdefs {
    Calculator calc;
    double result = 0;
    @Given("I have a calculator")
    public void iHaveACalculator() {
        calc = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int num1, int num2) {
        result = calc.add(num1, num2);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int num) {
        Assertions.assertEquals(num, result);
    }

    @When("I subtract {int} from {int}")
    public void iSubtractFrom(int num1, int num2) {
        result = calc.subtract(num1, num2);
    }
}
