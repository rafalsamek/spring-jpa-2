package pl.edu.wszib.springjpa.model;

import java.util.List;

public class Zajęcia {

  private Integer id;
  private String nazwa;
  private List<Student> student;
  private Prowadzacy prowadzacy;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public List<Student> getStudent() {
    return student;
  }

  public void setStudent(List<Student> student) {
    this.student = student;
  }

  public Prowadzacy getProwadzacy() {
    return prowadzacy;
  }

  public void setProwadzacy(Prowadzacy prowadzacy) {
    this.prowadzacy = prowadzacy;
  }
}
