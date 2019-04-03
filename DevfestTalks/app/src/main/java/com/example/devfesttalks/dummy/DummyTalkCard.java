package com.example.devfesttalks.dummy;

import android.content.Context;

import com.example.devfesttalks.R;
import com.example.devfesttalks.entity.Flags;
import com.example.devfesttalks.entity.Label;
import com.example.devfesttalks.entity.Speaker;
import com.example.devfesttalks.entity.TalkCard;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public final class DummyTalkCard {

    private static final int CARDS_AMOUNT = 5;
    private static TalkCard[] cards;

    public static TalkCard[] getCards(Context context) {
        if (cards == null) {
            cards = generateCards(context, CARDS_AMOUNT);
        }
        return cards;
    }

    private static TalkCard[] generateCards(Context context, int amount) {
        TalkCard[] generatedCards = new TalkCard[amount];
        for (int i = 0; i < amount; i++) {
            generatedCards[i] = generateCard(context);
        }
        return generatedCards;
    }

    private static TalkCard generateCard(Context c) {
        Set<Label> labels = new TreeSet<>();
        labels.add(new Label(c.getString(R.string.label_android)));

        TalkCard talkCard = new TalkCard();
        talkCard.setDateTime(new Date(2018, Calendar.NOVEMBER, 27, 11, 15));
        talkCard.setName(c.getString(R.string.dummy_talk_name));
        talkCard.setAddress(c.getString(R.string.dummy_talk_address));
        talkCard.setLabels(labels);
        talkCard.setSpeaker(new Speaker(
                Flags.RUSSIA,
                c.getString(R.string.dummy_speaker_name),
                c.getString(R.string.dummy_speaker_job),
                c.getString(R.string.dummy_speaker_location)));
        talkCard.setDescription(c.getString(R.string.dummy_talk_description));

        return talkCard;
    }
}
