package models;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@AttributeOverrides({
    @AttributeOverride(name = "empId", column = @Column(name = "rEmpid")),
    @AttributeOverride(name = "empName", column = @Column(name = "rEmpName"))
})
public class Regular_Employee extends Employee {

  int rEmpId;
  String rEmpName;

  public int getrEmpId() {
    return rEmpId;
  }

  public void setrEmpId(int rEmpId) {
    this.rEmpId = rEmpId;
  }

  public String getrEmpName() {
    return rEmpName;
  }

  public void setrEmpName(String rEmpName) {
    this.rEmpName = rEmpName;
  }
}
