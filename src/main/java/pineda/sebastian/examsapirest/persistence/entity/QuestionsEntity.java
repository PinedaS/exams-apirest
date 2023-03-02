package pineda.sebastian.examsapirest.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "questions")
public class QuestionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_exam")
    private ExamsEntity exam;

    @Column(name = "question_description")
    private String questionDescription;
    @Column(name = "correct_option")
    private char correctOption;

    @OneToMany(mappedBy = "question")
    private List<OptionsEntity> options;
}
