package pineda.sebastian.examsapirest.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "exams")
public class ExamsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "submission_date")
    private Date submissionDate;

    @Column(name = "exam_time_zone")
    private String examTimeZone;

    @ManyToMany(mappedBy = "exams")
    private List<StudentsEntity> students;

    @OneToMany(mappedBy = "exam", cascade = CascadeType.PERSIST)
    private List<QuestionsEntity> questions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getExamTimeZone() {
        return examTimeZone;
    }

    public void setExamTimeZone(String examTimeZone) {
        this.examTimeZone = examTimeZone;
    }

    public List<StudentsEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentsEntity> students) {
        this.students = students;
    }

    public List<QuestionsEntity> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionsEntity> questions) {
        this.questions = questions;
    }
}
