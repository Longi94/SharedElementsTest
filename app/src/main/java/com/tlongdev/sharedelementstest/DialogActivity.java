package com.tlongdev.sharedelementstest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        ((View)findViewById(R.id.card).getParent()).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAfterTransition();
            }
        });
        findViewById(R.id.card).setOnClickListener(null);
    }
}
