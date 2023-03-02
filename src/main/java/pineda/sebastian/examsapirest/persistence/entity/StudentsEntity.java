package pineda.sebastian.examsapirest.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "students")
public class StudentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private int age;

    @Column(name = "residence_city")
    private String residenceCity;
    @Column(name = "student_time_zone")
    private String studentTimeZone;

    @JoinTable(
            name = "students_exams",
            joinColumns = @JoinColumn(name = "id_student", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_exam", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<ExamsEntity> exams;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getResidenceCity() {
        return residenceCity;
    }

    public void setResidenceCity(String residenceCity) {
        this.residenceCity = residenceCity;
    }

    public String getStudentTimeZone() {
        return studentTimeZone;
    }

    public void setStudentTimeZone(String studentTimeZone) {
        this.studentTimeZone = studentTimeZone;
    }

    public List<ExamsEntity> getExams() {
        return exams;
    }

    public void setExams(List<ExamsEntity> exams) {
        this.exams = exams;
    }
}
