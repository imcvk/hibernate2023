package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int personId;
  String name;
  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "personId_docId")
  List<IdentificationDocument> documentList;

  public Person() {
  }

  public int getPersonId() {
    return personId;
  }

  public void setPersonId(int personId) {
    this.personId = personId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<IdentificationDocument> getDocumentList() {
    return documentList;
  }

  public void setDocumentList(List<IdentificationDocument> documentList) {
    this.documentList = documentList;
  }
}
