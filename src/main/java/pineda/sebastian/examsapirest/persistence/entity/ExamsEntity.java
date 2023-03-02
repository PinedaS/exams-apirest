package pineda.sebastian.examsapirest.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
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

    @OneToMany(mappedBy = "exam")
    private List<QuestionsEntity> questions;
}
