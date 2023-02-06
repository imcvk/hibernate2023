package mainapp;

public class CriteriaMainApp {
  public static void main(String[] args) {
    CriteriaUtil criteriaUtil=new CriteriaUtil();
    criteriaUtil.fetch_all_records_using_criteria();
    criteriaUtil.where_criteria_demo();
    criteriaUtil.fetch_records_using_criteria_with_condition();
    criteriaUtil.fetching_records_in_order_with_condition();
    criteriaUtil.fetching_records_in_order_with_condition();
    criteriaUtil.joining_tables_using_criteria();
  }

}
