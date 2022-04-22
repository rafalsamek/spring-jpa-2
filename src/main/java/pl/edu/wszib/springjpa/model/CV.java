package pl.edu.wszib.springjpa.model;

import java.time.Instant;
import java.util.List;

public class CV {

  private Integer id;
  private String imie;
  private String nazwisko;
  private Instant dataUrodzenia;
  private Adres adres;
  private List<Praca> doswiadczenie;
  private List<Kompetencja> kompetencje;
  private Instant createdAt;
  private Instant updatedAt;

  public Adres getAdres() {
    return adres;
  }

  public void setAdres(Adres adres) {
    this.adres = adres;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public List<Praca> getDoswiadczenie() {
    return doswiadczenie;
  }

  public void setDoswiadczenie(List<Praca> doswiadczenie) {
    this.doswiadczenie = doswiadczenie;
  }

  public List<Kompetencja> getKompetencje() {
    return kompetencje;
  }

  public void setKompetencje(List<Kompetencja> kompetencje) {
    this.kompetencje = kompetencje;
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
