package com.example.ACRAtest;

import android.app.Application;
import org.acra.ACRA;

/**
 * Created By: David Hopkins Email: dhopkins@Burstly.com Date: 5/1/13
 */
public class TestFlightStuff {

    private static String sMyAppToken;

    public static void takeoffOrWhatever(Application application, String appToken){
        ACRA.init(application);
        
        sMyAppToken = appToken;
        
        //Create instance of custom report sender
        ACRA.getErrorReporter().setReportSender(new HockeySender());
    }
    
    protected static String getAppToken(){
        return sMyAppToken;
    }
}
