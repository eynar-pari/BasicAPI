package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factoryRequest.CustomReponse;
import factoryRequest.FactoryRequest;
import helpers.JsonUtil;
import helpers.Logger;
import org.junit.Assert;

import static helpers.MyValues.myVar;

public class MyStepdefs {

    public static CustomReponse globalResponse;

    @Given("^I have a connection with Todo.Ly$")
    public void iHaveAConnectionWithTodoLy() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I send a (POST) request to (.*) end point with the json$")
    public void iSendAPOSTRequestToProjectsJsonEndPointWithTheJson(String method, String path, String body) throws Throwable {
        globalResponse=FactoryRequest.make(FactoryRequest.POST).send(this.replaceMap(path),
                this.replaceMap(body));
    }

    @Then("^the response code should be (\\d+)$")
    public void theResponseCodeShouldBe(int expected) throws Throwable {
        Assert.assertEquals("The expected is not equal to the actual",expected,globalResponse.getCodeStatus());
    }

    @Given("^I have an account (created|updated) and  (.*)$")
    public void i_have_an_account_created(String accion, String word) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the response body should contains (.*)$")
    public void theResponseBodyShouldContainsEynar(String nameProj) throws Throwable {
        Assert.assertTrue("ERROR ! ,json body does not contains "+nameProj,
                globalResponse.getJsonBody().contains(nameProj));
    }

    @And("^the response body should be$")
    public void theResponseBodyShouldBe(String expected) throws Throwable {
        Logger.getInstance().write("Condition Contains : Expected :"+expected+" Actual : "+globalResponse.getJsonBody(),
                "ASSERT");
        Assert.assertTrue("ERROR ! ,json body does not contains "+expected,
                globalResponse.getJsonBody().contains(expected));

    }

    @And("^the response body should be equal to$")
    public void theResponseBodyShouldBeEqualTo(String expecteResult) throws Throwable {

        String actualResult=globalResponse.getJsonBody();
        Assert.assertTrue("ERROR ! Json no son iguales",
                JsonUtil.areEqualsJsonObject(this.replaceMap(expecteResult),actualResult));
    }

    @And("^I get the value of attribute : (.*) in (.*)$")
    public void iGetTheValueOfAttributeIdInIDTEST(String attribute, String varName) throws Throwable {
               String valueAttribute= JsonUtil.getJsonValue(globalResponse.getJsonBody(),attribute);
               myVar.put(varName,valueAttribute);
    }

    /**
     *
     * @param myValue
     * @return
     */
    private String replaceMap(String myValue){
        for (String key: myVar.keySet()) {
            myValue=myValue.replace(key,myVar.get(key));
        }
        return myValue;
    }


}



