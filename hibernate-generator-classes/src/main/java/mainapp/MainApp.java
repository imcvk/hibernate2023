package mainapp;

import assignment.AssignmentDemo;
import identity.IdentityDemo;
import object_dao.Object_DAO;
import sequence.SequenceDemo;
import table.TableDemo;
import uuid_hex.UUID_Hex;

import java.util.Random;

public class MainApp {
  public static void main(String[] args) {
//    for(int i = 0; i < 5; i++)
//      Object_DAO.saveObject(new AssignmentDemo(new Random().nextInt(1, 100)));

    for(int i = 0; i < 5; i++)
      Object_DAO.saveObject(new IdentityDemo());

    for(int i = 0; i < 5; i++)
      Object_DAO.saveObject(new SequenceDemo());

    for(int i = 0; i < 5; i++)
      Object_DAO.saveObject(new TableDemo());

    for(int i = 0; i < 5; i++)
      Object_DAO.saveObject(new UUID_Hex());
  }
}
