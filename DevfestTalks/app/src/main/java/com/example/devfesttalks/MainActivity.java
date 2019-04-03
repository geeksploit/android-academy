package com.example.devfesttalks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showTalkDetails = findViewById(R.id.show_talk_details);
        showTalkDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TalkDetail.start(MainActivity.this, 0);
            }
        });
    }
}
