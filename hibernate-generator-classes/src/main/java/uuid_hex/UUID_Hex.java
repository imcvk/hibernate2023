package uuid_hex;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UUID_Hex {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int idUuidHex;

  public UUID_Hex() {
  }

  public UUID_Hex(int idUuidHex) {
    this.idUuidHex = idUuidHex;
  }

  public int getIdUuidHex() {
    return idUuidHex;
  }

  public void setIdUuidHex(int idUuidHex) {
    this.idUuidHex = idUuidHex;
  }
}
