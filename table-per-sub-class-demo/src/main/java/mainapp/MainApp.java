package mainapp;

import dao.ObjectDAO;
import models.Bike;
import models.Car;
import models.Vehicle;

public class MainApp {
  public static void main(String[] args) {
   // Vehicle v = new Vehicle("Commercial", "Scorpio");
    Bike b = new Bike("Private","Yamaha-FZ","FZ-FI", "MH78GT7894");
    Car c = new Car("Private","Scorpio", "Micro Hydro", "MH78BS7894");
  //  ObjectDAO.saveObject(v);
    ObjectDAO.saveObject(b);
    ObjectDAO.saveObject(c);
  }
}
