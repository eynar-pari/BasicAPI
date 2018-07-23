package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factoryRequest.CustomReponse;
import factoryRequest.FactoryRequest;
import org.junit.Assert;

public class MyStepdefs {

    public static CustomReponse globalResponse;

    @Given("^I have a connection with Todo.Ly$")
    public void iHaveAConnectionWithTodoLy() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I send a (POST) request to (projects.json) end point with the json$")
    public void iSendAPOSTRequestToProjectsJsonEndPointWithTheJson(String method, String path, String body) throws Throwable {
        globalResponse=FactoryRequest.make(FactoryRequest.POST).send(path,body);
    }

    @Then("^the response code should be (\\d+)$")
    public void theResponseCodeShouldBe(int expected) throws Throwable {
        Assert.assertEquals("The expected is not equal to the actual",expected,globalResponse.getCodeStatus());
    }

    @And("^the response body (contains|equal)$")
    public void theResponseBodyContains(String conditional, String value) throws Throwable {
       Assert.assertTrue("ERROR ! the response does not contains the value "+value,globalResponse.getJsonBody().contains(value));
    }
}
