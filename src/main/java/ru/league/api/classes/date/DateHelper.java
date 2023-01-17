package ru.league.api.classes.date;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {

    public boolean isDateEquals(int year, int month, int day){
        LocalDate date = LocalDate.of(year,month,day);
        LocalDate today = LocalDate.now();

        return date.isEqual( today );
    }

    public Date removeTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
}
