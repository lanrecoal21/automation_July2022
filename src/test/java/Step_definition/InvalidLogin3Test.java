package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class InvalidLogin3Test extends TestBase {


    @And("^I Type\"([^\"]*)\"$")
    public void iType(String Username) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(Username);

    }

    @When("^I Input \"([^\"]*)\"$")
    public void iInput(String Password) throws Throwable {
        driver.findElement(By.name("passwd")).sendKeys(Password);

    }

    @When("^I click the login$")
    public void iClickTheLogin() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should get the correct \"([^\"]*)\"$")
    public void iShouldGetTheCorrect(String error) throws Throwable {
        String ExpectedErrorMessage = error;
        String ActualErrormessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrormessage);
        System.out.println(ActualErrormessage);

    }
}
