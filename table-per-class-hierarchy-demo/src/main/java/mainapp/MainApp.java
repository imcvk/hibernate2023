package mainapp;

import AnimalDAO.AnimalDAO;
import model.Animal;
import model.Cat;
import model.Dog;

public class MainApp {
  public static void main(String[] args) {
    Animal a = new Animal("Jimmy");
    Dog d = new Dog("Dimmy");
    Cat c = new Cat(10);
    AnimalDAO.saveObject(a);
    AnimalDAO.saveObject(d);
    AnimalDAO.saveObject(c);
  }
}
