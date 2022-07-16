package eins;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class TutorGroupStatistics {

    public Duration averageDuration(Stream<TutorGroupMeeting> meetings) {
        return meetings.map(meeting -> meeting.getTutorGroup().getTimeSlot().getDuration()).reduce(Duration.ZERO, Duration::plus);
    }

    public Set<Skill> repeatedSkill(Stream<TutorGroupMeeting> meetings) {
        //return the skill that appeared multiple times in the stream of meetings
        return meetings.map(TutorGroupMeeting::getSkillToPractise).collect(HashSet::new, (set, skill) -> {
            if (set.contains(skill)) {
                set.add(skill);
            }
        }, Set::addAll);
    }
}
