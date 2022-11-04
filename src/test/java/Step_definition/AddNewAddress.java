package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.AddNewAddressPage;

public class AddNewAddress extends TestBase {

    @And("^I click my addresses$")
    public void iClickMyAddresses() {
        AddNewAddressPage page = PageFactory.initElements(driver, AddNewAddressPage.class);
        page.ClickMyAddresses();
    }

    @Then("^I click add to new address$")
    public void iClickAddToNewAddress() {
        AddNewAddressPage page = PageFactory.initElements(driver, AddNewAddressPage.class);
        page.ClickAddANewAddress();
    }

    @Then("^I fill in the required field$")
    public void iFillInTheRequiredField() {
        AddNewAddressPage page = PageFactory.initElements(driver, AddNewAddressPage.class);
        page.EnterAddress();
        page.EnterCity();
        page.SelectState();
        page.EnterPostcode();
        page.EnterHomePhone();
        page.EnterMobilePhone();
        page.EnterAlias();


    }

    @And("^I click save button$")
    public void iClickSaveButton() {
        AddNewAddressPage page = PageFactory.initElements(driver, AddNewAddressPage.class);
        page.ClickSaveButton();

            driver.quit();
    }
}
