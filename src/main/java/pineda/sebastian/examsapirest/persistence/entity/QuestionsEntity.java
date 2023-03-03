package pineda.sebastian.examsapirest.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany(mappedBy = "question", cascade = CascadeType.PERSIST)
    private List<OptionsEntity> options;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ExamsEntity getExam() {
        return exam;
    }

    public void setExam(ExamsEntity exam) {
        this.exam = exam;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public char getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(char correctOption) {
        this.correctOption = correctOption;
    }

    public List<OptionsEntity> getOptions() {
        return options;
    }

    public void setOptions(List<OptionsEntity> options) {
        this.options = options;
    }
}
