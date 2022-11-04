package pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddNewAddressPage {

    @FindBy(how = How.LINK_TEXT, using = "My addresses")
    public static WebElement MyAddresses;

    @FindBy(how = How.LINK_TEXT, using = "Add a new address")
    public static WebElement AddAnAddress;


    @FindBy(how = How.ID_OR_NAME, using = "address1")
    public static WebElement Address;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    public static WebElement City;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    public static WebElement State;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    public static WebElement Postcode;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    public static WebElement PhoneNumber;

    @FindBy(how = How.ID_OR_NAME, using = "phone")
    public static WebElement HomePhone;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    public static WebElement Address_alias;

    @FindBy(how = How.XPATH, using = "//*[@id=\"submitAddress\"]")
    public static WebElement SaveButton;

    public void ClickMyAddresses(){
        MyAddresses.click();
    }
    public void ClickAddANewAddress(){
        AddAnAddress.click();
    }

    public void EnterAddress() {
        Address.sendKeys("Tom Street");
    }

    public void EnterCity() {
        City.sendKeys("California");
    }

    public void SelectState() {
        Select state = new Select(State);
        state.selectByVisibleText("Arizona");

    }

    public void EnterPostcode() {
        Postcode.sendKeys("02760");
    }

    public void EnterHomePhone() {
        HomePhone.sendKeys("04034570000");

    }
    public void EnterMobilePhone() {
        PhoneNumber.sendKeys("040125456789");

    }
    public void EnterAlias() {
        Address_alias.clear();
        Address_alias.sendKeys("Dave House");

    }

    public void ClickSaveButton(){
        SaveButton.click();
    }

    }
