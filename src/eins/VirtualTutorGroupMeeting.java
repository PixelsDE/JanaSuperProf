package eins;

public class VirtualTutorGroupMeeting extends TutorGroupMeeting{


    private String url;

    public VirtualTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractise, String url) {
        super(timeSlot, tutorGroup, skillToPractise);
        this.url = url;
    }

    @Override
    public void practise() {
        getTutorGroup().getTutor().say("Thank you for joining using <" +url +"> today.");
        getTutorGroup().getStudents().forEach(student -> student.learnSkill(getSkillToPractise()));
        getTutorGroup().getTutor().say("See you next time!");

    }

    public String getUrl() {
        return url;
    }
}
