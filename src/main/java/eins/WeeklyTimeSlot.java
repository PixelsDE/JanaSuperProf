package eins;

import java.time.LocalDate;
import java.time.LocalTime;

public class WeeklyTimeSlot extends TimeSlot {

    private final LocalDate date;

    public WeeklyTimeSlot(LocalDate date, LocalTime startTime, LocalTime endTime) {
        super(startTime, endTime);
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
