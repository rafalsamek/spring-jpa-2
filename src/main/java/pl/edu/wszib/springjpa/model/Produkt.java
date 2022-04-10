package pl.edu.wszib.springjpa.model;

import java.time.Instant;

public class Produkt {

  private Integer id;
  private String nazwa;
  private Integer ilosc;
  private Float cena;
  private Instant createdAt;
  private Instant updatedAt;

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

  public Integer getIlosc() {
    return ilosc;
  }

  public void setIlosc(Integer ilosc) {
    this.ilosc = ilosc;
  }

  public Float getCena() {
    return cena;
  }

  public void setCena(Float cena) {
    this.cena = cena;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }
}
