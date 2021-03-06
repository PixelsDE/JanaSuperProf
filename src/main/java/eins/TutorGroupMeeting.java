package eins;

public abstract class TutorGroupMeeting {

    private final FixedDateTimeSlot timeSlot;
    private final TutorGroup tutorGroup;
    private final Skill skillToPractise;

    public TutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractise) {
        this.timeSlot = timeSlot;
        this.tutorGroup = tutorGroup;
        this.skillToPractise = skillToPractise;
    }

    public abstract void practise();

    public FixedDateTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public TutorGroup getTutorGroup() {
        return tutorGroup;
    }

    public Skill getSkillToPractise() {
        return skillToPractise;
    }
}
