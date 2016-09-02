package mde.project4.code.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AdditionOperationSteps {

	@Given("a calculator")
	public void a_calculator() {

	}

	@When("I add <number1> and <number2>")
	public void i_add(@Named("number1") int number1, @Named("number2") int number2) {

	}

	@Then("the outcome should <result>")
	public void the_outcome_should(@Named("result") int result) {

	}

}
