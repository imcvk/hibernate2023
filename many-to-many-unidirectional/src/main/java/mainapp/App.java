package mainapp;

import dao.ObjectDAO;
import dummydata.DummyUserProvider;
import model.ReaderEntity;
import model.SubscriptionEntity;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    DummyUserProvider dataProvider = new DummyUserProvider();
    ReaderEntity r = new ReaderEntity();
    SubscriptionEntity s1, s2;
    s1 = new SubscriptionEntity();
    s1.setSubscriptionName("abc");
    s2 = new SubscriptionEntity();
    s2.setSubscriptionName("def");
    r.setEmail("abc@gmail.com");

    ArrayList<SubscriptionEntity> subscriptionEntities = new ArrayList<>();
    subscriptionEntities.addAll(List.of(new SubscriptionEntity[]{s1, s2}));
    r.setSubscriptions(subscriptionEntities);

    ArrayList<ReaderEntity> readerEntities = new ArrayList<>();
    readerEntities.add(r);

    ObjectDAO.saveObject(r);

  }
}
