package assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AssignmentDemo {
  @Id
  int assignmentId;

  public AssignmentDemo() {
  }

  public AssignmentDemo(int assignmentId) {
    this.assignmentId = assignmentId;
  }

  public int getAssignmentId() {
    return assignmentId;
  }

  public void setAssignmentId(int assignmentId) {
    this.assignmentId = assignmentId;
  }
}
