package identity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IdentityDemo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int identityId;

  public IdentityDemo() {
  }

  public IdentityDemo(int identityId) {
    this.identityId = identityId;
  }

  public int getIdentityId() {
    return identityId;
  }

  public void setIdentityId(int identityId) {
    this.identityId = identityId;
  }
}
