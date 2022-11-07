package com.nagp.stepdefination;

import com.nagp.pages.HomePageSelendroid;
import com.nagp.pages.RegisterUserPage;
import com.nagp.utility.Frameworkconstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterUser {

    @Given("Click on Folder Icon")
    public void  ClickFolderIcon() throws Throwable {


        new RegisterUserPage().ClickFolderIcon();

    }
    @Given("Navigate to Register User Screen")
    public void  NavigateRegisterUserScreen() throws Throwable {


        Assert.assertEquals(new RegisterUserPage().RegisterUserWelcomeMessage.getText(), Frameworkconstants.registerUserWelcomemessage);

    }
    @When("Enter User {string}")
    public void  EnterUserName(String uname)
    {
        new RegisterUserPage().EnterUserName(uname);

    }
    @When("Enter {string}")
    public void  EnterPassword(String paswd) throws Throwable {


        new RegisterUserPage().EnterUserPassword(paswd);

    }
    @When("Enter user {string}")
    public void  Enteremail(String email) throws Throwable {


        new RegisterUserPage().EnterEmail(email);

    }
    @When("Click RegisterUser Button")
    public void  ClickRegisterUserButton() throws Throwable {


        new RegisterUserPage().ClickRegisterUser();

    }
    @Given("Click on PopupwindowButton")
    public void  PopupwindowButton() throws Throwable {


        new HomePageSelendroid().ClickShowPopUp();

    }
    @Given("Click On Dismiss button")
    public void  ClickDismissButton() throws Throwable {


        new HomePageSelendroid().ClickDismiss();

    }
}
