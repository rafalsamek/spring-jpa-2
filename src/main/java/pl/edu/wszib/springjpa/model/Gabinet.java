package pl.edu.wszib.springjpa.model;

public class Gabinet {

  private Integer id;
  private Integer numer;
  private Lekarz lekarz;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getNumer() {
    return numer;
  }

  public void setNumer(Integer numer) {
    this.numer = numer;
  }

  public Lekarz getLekarz() {
    return lekarz;
  }

  public void setLekarz(Lekarz lekarz) {
    this.lekarz = lekarz;
  }
}
