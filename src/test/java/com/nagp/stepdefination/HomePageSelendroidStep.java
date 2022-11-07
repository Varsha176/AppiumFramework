package com.nagp.stepdefination;

import com.nagp.pages.HomePageSelendroid;
import com.nagp.utility.Frameworkconstants;
import com.nagp.utility.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSelendroidStep {
    TestUtils utils = new TestUtils();
    @Given("User Click on Continue")
    public void ClickContinue() throws Throwable {


        new HomePageSelendroid().clicKContinue() ;

    }
    @And("User Click on Ok on PopUp")
    public void ClickOkPopUp() throws Throwable {


        new HomePageSelendroid().ClickOk() ;

    }
    @Then("Navigate to HomeScreen")
    public void ShowHomeScreen() throws Throwable {


        Assert.assertEquals(new HomePageSelendroid().LocalizationText.getText(), Frameworkconstants.localizationText );
        utils.log().info("Navigate to HomeScreen");

    }

    @When("User Click on EnButton")
    public void ClickEnButton() throws Throwable {
        new HomePageSelendroid().ClickENButton();

    }
    @When("User Click on DisplayTextViewButton")
    public void ClickTextViewButton() throws Throwable {
        new HomePageSelendroid().ClickTextView();

    }
    @When("Verify Text displayed")
    public void VerifyTextdisplayed() throws Throwable {
        Assert.assertEquals(new HomePageSelendroid().Text.getText(),Frameworkconstants.TextDisplay);

    }
    @Then("Navigate to Confirmation Popup")
    public void NavigateToConfirmationPopup() throws Throwable {
    Assert.assertEquals(new HomePageSelendroid().MessageBox.getText(),Frameworkconstants.popUpMessageBox);

    }
    @When("Click on I Agree")
    public void ClickOnIAgree() throws Throwable {
        new HomePageSelendroid().ClickIAgree();

    }
    @Then("Application Closes Successfully")
    public void ApplicationClosesSuccessfully() throws Throwable {


    }
}
