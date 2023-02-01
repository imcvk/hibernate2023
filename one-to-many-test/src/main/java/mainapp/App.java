package mainapp;

import dao.ObjectDAO;
import employeedata.EmployeeDataProvider;
import model.IdentificationDocument;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    EmployeeDataProvider dataProvider = new EmployeeDataProvider();
    IdentificationDocument document1, document2, document3;
    document1 = new IdentificationDocument();
    document1.setDocumentName("Aadhaar");
    document2 = new IdentificationDocument();
    document2.setDocumentName("Passport");
    document3 = new IdentificationDocument();
    document3.setDocumentName("PAN");
    List<IdentificationDocument> identificationDocuments = new ArrayList<>();
    identificationDocuments.add(document1);
    identificationDocuments.add(document2);
    identificationDocuments.add(document3);
    Person person = new Person();
    person.setName(dataProvider.getFakeEmployeeNameFull());
    person.setDocumentList(identificationDocuments);
    ObjectDAO.saveObject(person);
  }
}
