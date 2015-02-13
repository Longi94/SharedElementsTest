package com.tlongdev.sharedelementstest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;


public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        FrameLayout layout = (FrameLayout)findViewById(R.id.layout);
        layout.getLayoutParams().width = screenWidth / 3;
        layout.getLayoutParams().height = screenWidth / 3;
        layout.requestLayout();

        ((View)findViewById(R.id.card).getParent()).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAfterTransition();
            }
        });
        findViewById(R.id.card).setOnClickListener(null);

        int position = getIntent().getIntExtra("position", 0);
        ((TextView)findViewById(R.id.text)).setText("" + position);
    }
}
