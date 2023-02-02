package mainapp;

import dao.ObjectDAO;
import dummydata.DummyUserProvider;
import model.Subscriber;
import model.Subscription;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    DummyUserProvider dataProvider = new DummyUserProvider();

    Subscription s1, s2, s3;
    s1 = new Subscription();
    s1.setSubscriptionName("Netflix");
    s2 = new Subscription();
    s2.setSubscriptionName("Amazon Prime");
    s3 = new Subscription();
    s3.setSubscriptionName("Hotstar");

    ArrayList<Subscription> subscribers = new ArrayList<>();
    subscribers.addAll(List.of(new Subscription[]{s1, s2, s3}));

    Subscriber subscriber = new Subscriber();
    subscriber.setSubscriberName(dataProvider.getFakeEmployeeNameFull());
    subscriber.setSubscriptions(subscribers);

    ObjectDAO.saveObject(subscriber);
  }
}
