package pineda.sebastian.examsapirest.domain.dto;

import java.util.Date;
import java.util.List;

public class ExamDTO {

    private Date submissionDate;

    private String examTimeZone;

    private List<QuestionDTO> questions;

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

    public List<QuestionDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionDTO> questions) {
        this.questions = questions;
    }
}
