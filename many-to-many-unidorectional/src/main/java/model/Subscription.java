package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Subscription {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int subscriptionId;
  String subscriptionName;

  public int getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(int subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public String getSubscriptionName() {
    return subscriptionName;
  }

  public void setSubscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
  }
}
