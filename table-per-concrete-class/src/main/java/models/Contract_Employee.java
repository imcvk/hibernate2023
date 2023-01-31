package models;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@AttributeOverrides({
    @AttributeOverride(name = "empId", column = @Column(name = "cempId")),
    @AttributeOverride(name = "empName", column = @Column(name = "cempName"))
})
public class Contract_Employee extends Employee {

  int cempId;
  String cempName;

  public int getCempId() {
    return cempId;
  }

  public void setCempId(int cempId) {
    this.cempId = cempId;
  }

  public String getCempName() {
    return cempName;
  }

  public void setCempName(String cempName) {
    this.cempName = cempName;
  }
}
