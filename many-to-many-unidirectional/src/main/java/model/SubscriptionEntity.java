package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SubscriptionEntity {
  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer subscriptionId;

  @Column
  private String subscriptionName;

  @ManyToMany(cascade = CascadeType.ALL)
  private List<ReaderEntity> readers;

  public Integer getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public String getSubscriptionName() {
    return subscriptionName;
  }

  public void setSubscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
  }

  public List<ReaderEntity> getReaders() {
    return readers;
  }

  public void setReaders(List<ReaderEntity> readers) {
    this.readers = readers;
  }
}
