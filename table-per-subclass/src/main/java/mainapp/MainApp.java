package mainapp;

import dao.ObjectDAO;
import models.Animal;
import models.Bird;
import models.Fish;
import models.Mammal;

public class MainApp {
  public static void main(String[] args) {
    Animal a = new Animal("animal", "asd", 10);
    Bird b = new Bird(1, true);
    Fish f = new Fish(true, true);
    Mammal m = new Mammal(10, true);
    ObjectDAO.saveObject(a);
    ObjectDAO.saveObject(b);
    ObjectDAO.saveObject(f);
    ObjectDAO.saveObject(m);
  }
}
