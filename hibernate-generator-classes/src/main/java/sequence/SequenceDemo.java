package sequence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SequenceDemo {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  int idSequence;

  public SequenceDemo(int idSequence) {
    this.idSequence = idSequence;
  }

  public SequenceDemo() {
  }

  public int getIdSequence() {
    return idSequence;
  }

  public void setIdSequence(int idSequence) {
    this.idSequence = idSequence;
  }
}
