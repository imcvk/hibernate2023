package hql_misc;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
  public static void main(String[] args) {
    DAO dao = new DAO();

    Question question = new Question();
    question.setQuestion("What is java?");

    String answers = "ans1@ans2@ans3";
    List<Answer> answerList = new ArrayList<>();
    String[] ansArr = answers.split("@");
    for(String s : ansArr) {
      Answer a = new Answer();
      a.setAnswer(s);
      a.setQuestion(question);
      answerList.add(a);
    }
    question.setAnswers(answerList);
    dao.saveObject(question);
    dao.hql_join();
  }
}
