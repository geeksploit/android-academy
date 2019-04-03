package com.example.devfesttalks.util;

import com.example.devfesttalks.entity.Label;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

public final class StringUtils {

    public static String getTime(Date dateTime) {
        return new SimpleDateFormat("HH:MM", Locale.ENGLISH).format(dateTime);
    }

    public static String getDate(Date dateTime) {
        return new SimpleDateFormat("dd MMMM", Locale.ENGLISH).format(dateTime);
    }

    public static String getLabels(Set<Label> labels) {
        StringBuilder sb = new StringBuilder();
        for (Label label : labels) {
            sb.append(label.getName());
            sb.append(" " );
        }
        return sb.toString();
    }
}
