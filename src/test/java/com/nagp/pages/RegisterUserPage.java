package com.nagp.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUserPage extends BasePage{

    public RegisterUserPage(){}

    @FindBy(xpath ="//android.widget.ImageButton[@content-desc=\"startUserRegistrationCD\"]")
    MobileElement FolderIcon;

    @FindBy(xpath ="//android.widget.TextView[@text='Welcome to register a new User']")
    public MobileElement RegisterUserWelcomeMessage;

    @FindBy(id ="io.selendroid.testapp:id/inputUsername")
    MobileElement UserName;

    @FindBy(id ="io.selendroid.testapp:id/inputEmail")
    MobileElement Email;
    @FindBy(id ="io.selendroid.testapp:id/inputPassword")
    MobileElement Password;
    @FindBy(id ="io.selendroid.testapp:id/btnRegisterUser")
    MobileElement RegisterUser;



    public RegisterUserPage ClickFolderIcon()
    {
        click(FolderIcon,"FolderIconClicked");
        return this;
    }

    public RegisterUserPage EnterUserName(String uname)
    {
        sendKeys(UserName,uname);


        return this;
    }
    public RegisterUserPage EnterUserPassword(String password)
    {
        sendKeys(Password,password);


        return this;
    }
    public RegisterUserPage EnterEmail(String email)
    {
        sendKeys(Email,email);


        return this;
    }
    public RegisterUserPage ClickRegisterUser()
    {
       click(RegisterUser,"RegisterUserClicked");


        return this;
    }
}
