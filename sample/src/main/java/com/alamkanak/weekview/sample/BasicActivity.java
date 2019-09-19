package com.alamkanak.weekview.sample;

import android.graphics.Color;

import com.alamkanak.weekview.WeekViewEvent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * A basic example of how to use week view library.
 * Created by Raquib-ul-Alam Kanak on 1/3/2014.
 * Website: http://alamkanak.github.io
 */
public class BasicActivity extends BaseActivity {

    @Override
    public List<? extends WeekViewEvent> onMonthChange(int newYear, int newMonth) {
        // Populate the week view with some events.
        List<WeekViewEvent> events = new ArrayList<WeekViewEvent>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        try {

            Calendar startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T09:00:00+02:00"));
            Calendar endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T09:30:00+02:00"));
            WeekViewEvent event = new WeekViewEvent("1", "Frühstück/Empfang ??", startTime, endTime);
            event.setColor(Color.parseColor("#7f8c8d"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T09:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T10:00:00+02:00"));
            event = new WeekViewEvent("Second", "Eröffnung", startTime, endTime);
            event.setColor(Color.parseColor("#e74c3c"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T09:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T14:30:00+02:00"));
            event = new WeekViewEvent(10, "Ganzheits-Side-Programm", startTime, endTime);
            event.setColor(Color.parseColor("#9b59b6"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T10:00:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T11:15:00+02:00"));
            event = new WeekViewEvent(2, "Keynote Uwe Lübbermann", startTime, endTime);
            event.setColor(Color.parseColor("#ff9800"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T11:15:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T11:45:00+02:00"));
            event = new WeekViewEvent(3, "Pause", startTime, endTime);
            event.setColor(Color.parseColor("#7f8c8d"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T11:45:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T12:15:00+02:00"));
            event = new WeekViewEvent(4, "Marketplace Open Space", startTime, endTime);
            event.setColor(Color.parseColor("#e74c3c"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T12:15:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T12:45:00+02:00"));
            event = new WeekViewEvent(4, "Vorstellung Pionierstationen", startTime, endTime);
            event.setColor(Color.parseColor("#e74c3c"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T12:45:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T14:00:00+02:00"));
            event = new WeekViewEvent(5, "Mittagessen", startTime, endTime);
            event.setColor(Color.parseColor("#7f8c8d"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T14:00:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T14:30:00+02:00"));
            event = new WeekViewEvent(6, "Reflexion", startTime, endTime);
            event.setColor(Color.parseColor("#e74c3c"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T14:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T15:30:00+02:00"));
            event = new WeekViewEvent(7, "Pionierstationen Teil 1", startTime, endTime);
            event.setColor(Color.parseColor("#3498db"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T14:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T15:30:00+02:00"));
            event = new WeekViewEvent(8, "Open Space Teil 1", startTime, endTime);
            event.setColor(Color.parseColor("#f1c40f"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T14:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T17:00:00+02:00"));
            event = new WeekViewEvent(9, "Miniworkshops", startTime, endTime);
            event.setColor(Color.parseColor("#f1c40f"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T15:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T16:30:00+02:00"));
            event = new WeekViewEvent(10, "Pionierstationen Teil 2", startTime, endTime);
            event.setColor(Color.parseColor("#3498db"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T15:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T16:30:00+02:00"));
            event = new WeekViewEvent(11, "Open Space Teil 2", startTime, endTime);
            event.setColor(Color.parseColor("#f1c40f"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T16:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T17:00:00+02:00"));
            event = new WeekViewEvent(12, "Pause", startTime, endTime);
            event.setColor(Color.parseColor("#7f8c8d"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T16:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T17:00:00+02:00"));
            event = new WeekViewEvent(13, "Pause", startTime, endTime);
            event.setColor(Color.parseColor("#7f8c8d"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T17:00:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T18:00:00+02:00"));
            event = new WeekViewEvent(14, "Pionierstationen Teil 3", startTime, endTime);
            event.setColor(Color.parseColor("#3498db"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T17:00:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T18:00:00+02:00"));
            event = new WeekViewEvent(15, "Open Space Teil 3", startTime, endTime);
            event.setColor(Color.parseColor("#f1c40f"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T18:00:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T18:30:00+02:00"));
            event = new WeekViewEvent(16, "Reflexion", startTime, endTime);
            event.setColor(Color.parseColor("#e74c3c"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T18:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T19:30:00+02:00"));
            event = new WeekViewEvent(17, "Sektempfang", startTime, endTime);
            event.setColor(Color.parseColor("#7f8c8d"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-13T19:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-13T21:00:00+02:00"));
            event = new WeekViewEvent(18, "Abendessen", startTime, endTime);
            event.setColor(Color.parseColor("#7f8c8d"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-14T09:00:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-14T10:00:00+02:00"));
            event = new WeekViewEvent(19, "Frühstück", startTime, endTime);
            event.setColor(Color.parseColor("#7f8c8d"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-14T14:45:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-14T15:15:00+02:00"));
            event = new WeekViewEvent(20, "Test", startTime, endTime);
            event.setColor(Color.parseColor("#e74c3c"));
            events.add(event);

            startTime = Calendar.getInstance();
            startTime.setTime(sdf.parse("2019-05-15T15:30:00+02:00"));
            endTime = (Calendar) startTime.clone();
            endTime.setTime(sdf.parse("2019-05-15T16:30:00+02:00"));
            event = new WeekViewEvent(21, "Open Space Teil 2", startTime, endTime);
            event.setColor(Color.parseColor("#f1c40f"));
            events.add(event);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return events;
    }

}
