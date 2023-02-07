package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ReaderEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  private Integer readerId;

  @Column
  private String email;

  @ManyToMany(mappedBy = "readers", cascade = CascadeType.ALL)
  private List<SubscriptionEntity> subscriptions;

  public Integer getReaderId() {
    return readerId;
  }

  public void setReaderId(Integer readerId) {
    this.readerId = readerId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<SubscriptionEntity> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<SubscriptionEntity> subscriptions) {
    this.subscriptions = subscriptions;
  }
}
