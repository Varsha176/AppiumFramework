package com.nagp.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Frameworkconstants {
    private Frameworkconstants(){}

    private static final String resourcepath =System.getProperty("user.dir")+"/src/test/resources";
    private static final String apkfilepath = resourcepath+"/apkFiles/selendroid-test-app.apk";
    public static final String EXTENTREPORTFOLDERPATH=System.getProperty("user.dir")+"/index.html";
    public static final String SCREENSHOTPATH = System.getProperty("user.dir")+"/Screenshots";
    private static String timestamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()).replaceAll(":", "-");
    private static String extentReportFilePath = "";

    public static String getApkfilepath()
    {
        return apkfilepath;
    }


    public static String localizationText="Localization (L10n) locator test";
    public static String popUpMessageBox="This will end the activity";
    public static String registerUserWelcomemessage="Welcome to register a new User";
    public static String TextDisplay="Text is sometimes displayed";
}
