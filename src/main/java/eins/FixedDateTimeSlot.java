package eins;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class FixedDateTimeSlot extends TimeSlot {

    private final DayOfWeek dayOfWeek;

    public FixedDateTimeSlot(DayOfWeek day, LocalTime startTime, LocalTime endTime) {
        super(startTime, endTime);

        this.dayOfWeek = day;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }
}
