package com.example.ACRAtest;

import android.app.Application;
import org.acra.annotation.ReportsCrashes;

//Hockey app passes their app id in the "formKey" field which is required by ACRA (though you can pass an empty string)
@ReportsCrashes(formKey = "83e8e8e10f3970ad1d7ef6107beee08b")   
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        // The following line triggers the initialization of ACRA
        super.onCreate();
        TestFlightStuff.takeoffOrWhatever(this, "my_tf_app_token");
    }
}
