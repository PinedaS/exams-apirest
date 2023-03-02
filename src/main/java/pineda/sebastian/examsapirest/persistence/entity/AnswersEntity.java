package pineda.sebastian.examsapirest.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "answers")
public class AnswersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_student")
    private int idStudents;

    @Column(name = "id_exam")
    private int idExam;

    @Column(name = "id_question")
    private int idQuestion;

    @Column(name = "id_option")
    private int idOption;

    @Column(name = "question_score")
    private int questionScore;
}
