package hql_misc;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int questionId;
  String question;
  @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
  List<Answer> answers;
}
