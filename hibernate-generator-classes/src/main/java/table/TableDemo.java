package table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TableDemo {
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  int idTable;

  public TableDemo() {
  }

  public TableDemo(int idTable) {
    this.idTable = idTable;
  }

  public int getIdTable() {
    return idTable;
  }

  public void setIdTable(int idTable) {
    this.idTable = idTable;
  }
}
