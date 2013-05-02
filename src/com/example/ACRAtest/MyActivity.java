package com.example.ACRAtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Uninitialized view that will be used for NPE
     */
    View emptyView;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button npeButton = (Button)findViewById(R.id.NPE_btn);
        npeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Throw a NPE exception. Don't try this at home, kids. 
                view.setLayoutParams(null);
            }
        });
    }
}
