package pineda.sebastian.examsapirest.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "options")
public class OptionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_question")
    private QuestionsEntity question;

    @Column(name = "option_letter")
    private char optionLetter;

    @Column(name = "option_description")
    private String optionDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public QuestionsEntity getQuestion() {
        return question;
    }

    public void setQuestion(QuestionsEntity question) {
        this.question = question;
    }

    public char getOptionLetter() {
        return optionLetter;
    }

    public void setOptionLetter(char optionLetter) {
        this.optionLetter = optionLetter;
    }

    public String getOptionDescription() {
        return optionDescription;
    }

    public void setOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
    }
}
