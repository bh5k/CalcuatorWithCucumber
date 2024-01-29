import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepdefs {
    @Given("I have a calculator")
    public void iHaveACalculator() {
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int arg0) {
    }
}
