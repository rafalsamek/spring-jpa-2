package pl.edu.wszib.springjpa.model;

import java.time.Instant;

public class Wizyta {

  private Integer id;
  private Gabinet gabinet;
  private Pacjent pacjent;
  private Instant data;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Gabinet getGabinet() {
    return gabinet;
  }

  public void setGabinet(Gabinet gabinet) {
    this.gabinet = gabinet;
  }

  public Pacjent getPacjent() {
    return pacjent;
  }

  public void setPacjent(Pacjent pacjent) {
    this.pacjent = pacjent;
  }

  public Instant getData() {
    return data;
  }

  public void setData(Instant data) {
    this.data = data;
  }
}
