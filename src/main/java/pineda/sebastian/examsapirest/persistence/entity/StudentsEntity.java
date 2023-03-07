package pineda.sebastian.examsapirest.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "students")
public class StudentsEntity {
    @Id
    private String idDocument;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private int age;

    @Column(name = "residence_city")
    private String residenceCity;
    @Column(name = "student_time_zone")
    private String studentTimeZone;

    public String getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(String idDocument) {
        this.idDocument = idDocument;
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
}
