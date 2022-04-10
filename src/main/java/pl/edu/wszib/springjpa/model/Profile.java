package pl.edu.wszib.springjpa.model;

import java.time.Instant;

public class Profile {

  private Integer id;
  private String imie;
  private String nazwisko;
  private Instant dataUrodzenia;
  private byte[] zdjecie;
  private Instant createdAt;
  private Instant updatedAt;

  public Integer getId() {
    return id;
  }

  public void setId(Integer integer) {
    this.id = integer;
  }

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public Instant getDataUrodzenia() {
    return dataUrodzenia;
  }

  public void setDataUrodzenia(Instant dataUrodzenia) {
    this.dataUrodzenia = dataUrodzenia;
  }

  public byte[] getZdjecie() {
    return zdjecie;
  }

  public void setZdjecie(byte[] zdjecie) {
    this.zdjecie = zdjecie;
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
