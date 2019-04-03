package com.example.devfesttalks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.devfesttalks.dummy.DummyTalkCard;
import com.example.devfesttalks.entity.Speaker;
import com.example.devfesttalks.entity.TalkCard;
import com.example.devfesttalks.util.StringUtils;

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
        TalkCard talkCard = DummyTalkCard.getCards(this)[talkId];

        setTitle(talkCard.getName());
        fillCard(talkCard);
    }

    private void fillCard(TalkCard talkCard) {
        TextView talkTime = findViewById(R.id.talk_time);
        talkTime.setText(StringUtils.getTime(talkCard.getDateTime()));

        TextView talkDate = findViewById(R.id.talk_date);
        talkDate.setText(StringUtils.getDate(talkCard.getDateTime()));

        TextView talkName = findViewById(R.id.talk_name);
        talkName.setText(talkCard.getName());

        TextView talkAddress = findViewById(R.id.talk_address);
        talkAddress.setText(talkCard.getAddress());

        TextView talkLabel = findViewById(R.id.talk_label);
        talkLabel.setText(StringUtils.getLabels(talkCard.getLabels()));

        TextView talkDescription = findViewById(R.id.talk_description);
        talkDescription.setText(talkCard.getDescription());

        Speaker speaker = talkCard.getSpeaker();

        TextView speakerName = findViewById(R.id.talk_speaker_name);
        speakerName.setText(speaker.getName());

        TextView speakerJob = findViewById(R.id.talk_speaker_job);
        speakerJob.setText(speaker.getJob());

        TextView speakerLocation = findViewById(R.id.talk_speaker_location);
        speakerLocation.setText(speaker.getLocation());
    }
}
