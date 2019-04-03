package com.example.devfesttalks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TalkDetail extends AppCompatActivity {

    private static final String TALK_ID = "TALK_ID";

    public static void start(Context context, int talkId) {
        Intent secondActivityIntent = new Intent(context, TalkDetail.class);
        secondActivityIntent.putExtra(TALK_ID, talkId);
        context.startActivity(secondActivityIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk_detail);

        int talkId = getIntent().getIntExtra(TALK_ID, 0);
    }
}
