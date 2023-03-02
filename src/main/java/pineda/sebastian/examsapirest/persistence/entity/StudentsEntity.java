package pineda.sebastian.examsapirest.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
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
    @Column(name = "student_time_zone")
    private String studentTimeZone;

    @JoinTable(
            name = "students_exams",
            joinColumns = @JoinColumn(name = "id_student", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_exam", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<ExamsEntity> exams;
}
