package pineda.sebastian.examsapirest.domain.dto;

public class OptionDTO {
    private char optionLetter;

    private String optionDescription;

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
