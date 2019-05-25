package gradle.cucumber;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driverManager.Driver;
import helpers.OwaspHelper;
import pages.LoginModal;
import pages.MainPage;

public class StepDefinitionUI {

    MainPage mainPage= new MainPage();
    LoginModal loginModal = new LoginModal();

    @Given("^I go to (.*)$")
    public void iGoToTodoLy(String value) throws Throwable {
        Driver.getCurrentSession().getDriver().get(value);
        Driver.getCurrentSession().getDriver().manage().window().maximize();
    }

    @And("^I click on (.*) Link on Main Page$")
    public void iClickOnLoginLinkOnMainPage(String valueLink) throws Throwable {
        mainPage.loginLink.click();
    }

    @And("^I set (email|password) Field with '(.*)' on Login Modal$")
    public void iSetEmailFieldWithEynarPariGmailComOnLoginModal(String field,String value) throws Throwable {

        if (field.equals("email"))
          loginModal.emailField.type(value);
        else
           loginModal.passwordField.type(value);
    }

    @And("^I click on Login Button on Login Modal$")
    public void iClickOnLoginButtonOnLoginModal() throws Throwable {
         loginModal.loginButton.click();
    }

    @Given("^I Open OWASP ZAP tool$")
    public void iOpenOWASPZAPTool() throws Throwable {
    }

    @And("^I start to record all request$")
    public void iStartToRecordAllRequest() throws Throwable {
    }

    @Then("^I execute OWASP ZAP Vulnerability Attack$")
    public void iExecuteOWASPZAPVulnerabilityAttack() throws Throwable {
        OwaspHelper.initAttackVulnerability();
    }

    @And("^I generate the report for OWASPZ ZAP$")
    public void iGenerateTheReportForOWASPZZAP() throws Throwable {
//       OwaspHelper.getReportHtml();
//       OwaspHelper.getSummaryReport();
    }
}
