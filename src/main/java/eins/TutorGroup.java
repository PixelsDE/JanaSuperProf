package eins;

import java.util.HashSet;
import java.util.Set;

public class TutorGroup {

    private final String id;
    private final WeeklyTimeSlot timeSlot;
    private final Person tutor;
    private final Set<Student> students;
    private final Set<TutorGroupMeeting> meetings;


    public TutorGroup(String id, WeeklyTimeSlot timeSlot, Person tutor) {
        this.id = id;
        this.timeSlot = timeSlot;
        this.tutor = tutor;
        this.students = new HashSet<>();
        this.meetings = new HashSet<>();
    }


    protected void addMeeting(TutorGroupMeeting meeting) {
        meetings.add(meeting);
    }

    public void register(Student student) {
        students.add(student);
    }

    public String getId() {
        return id;
    }

    public WeeklyTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public Person getTutor() {
        return tutor;
    }

    public Set<Student> getStudents() {
        return students;
    }
}
