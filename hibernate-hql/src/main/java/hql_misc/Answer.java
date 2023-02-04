package hql_misc;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Answer {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int answerID;
  String answer;
  @ManyToOne
  Question question;
}
