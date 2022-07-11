package eins;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person {


    private String matriculationNumber;
    private int semester;
    private Set<String> knowledge;
    private Set<Skill> skills;
    private StudyLevel studyLevel;

    public Student(String name, int age, String tumID, String matriculationNumber, StudyLevel studyLevel, int semester) {
        super(name, age, tumID);
        this.matriculationNumber = matriculationNumber;
        this.semester = semester;
        this.studyLevel = studyLevel;
        this.skills = new HashSet<>();
        this.knowledge = new HashSet<>();
    }

    public void learnSkill(Skill skill) {
        skills.add(skill);
    }

    public void acquireKnowledge(String knowledge) {
        this.knowledge.add(knowledge);
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public int getSemester() {
        return semester;
    }

    public Set<String> getKnowledge() {
        return knowledge;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public StudyLevel getStudyLevel() {
        return studyLevel;
    }
}
