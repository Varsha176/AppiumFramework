package com.nagp.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageSelendroid extends BasePage{

    public HomePageSelendroid()
    {

    }
    @FindBy(xpath ="//*[@text='Continue']")
    MobileElement ContinueButton;

    @FindBy(id ="android:id/button1")
    MobileElement PopupOk;

    @FindBy(xpath ="//android.widget.Button[@content-desc=\"buttonTestCD\"]")
    MobileElement EnButton;

    @FindBy(id ="io.selendroid.testapp:id/visibleButtonTest")
    MobileElement TextViewButton;

    @FindBy(xpath =" //android.widget.LinearLayout[@content-desc=\"l10nCD\"]/android.widget.TextView")
    public MobileElement LocalizationText;

    @FindBy(id ="io.selendroid.testapp:id/buttonStartWebview")
    MobileElement ChromeIcon;

    @FindBy(id ="android:id/message")
    public MobileElement MessageBox;

    @FindBy(id ="android:id/button1")
    public MobileElement IAgree;
    @FindBy(id ="io.selendroid.testapp:id/visibleTextView")
    public MobileElement Text;

    @FindBy(id ="io.selendroid.testapp:id/showPopupWindowButton")
    public MobileElement PopUpButton;
    @FindBy(id ="io.selendroid.testapp:id/showPopupWindowButton")
    public MobileElement DismissButton;

    public HomePageSelendroid  clicKContinue()
    {
       click(ContinueButton,"Click Continue");
       return this;
    }
    public HomePageSelendroid  ClickOk()
    {
        click(PopupOk,"ok popup clicked");
        return this;
    }
    public HomePageSelendroid  ClickIAgree()
    {
        click(IAgree,"I Agree clicked");
        return this;
    }
    public HomePageSelendroid  ClickENButton()
    {

        click(EnButton,"En Button clicked");
        return this;
    }
    public HomePageSelendroid  ClickTextView()
    {

        click(TextViewButton,"TextView Button clicked");
        return this;
    }
    public HomePageSelendroid  ClickShowPopUp()
    {

        click(PopUpButton,"PopUPButton clicked");
        return this;
    }
    public HomePageSelendroid  ClickDismiss()
    {

        click(DismissButton,"DismissButton clicked");
        return this;
    }

}
