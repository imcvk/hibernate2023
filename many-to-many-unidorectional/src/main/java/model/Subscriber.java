package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Subscriber {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int subscriberId;

  String subscriberName;
  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinColumn(name = "subscriber_subscription")
  List<Subscription> subscriptions;

  public int getSubscriberId() {
    return subscriberId;
  }

  public void setSubscriberId(int subscriberId) {
    this.subscriberId = subscriberId;
  }

  public String getSubscriberName() {
    return subscriberName;
  }

  public void setSubscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
  }

  public List<Subscription> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
  }
}
