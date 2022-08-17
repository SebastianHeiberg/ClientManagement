package Client;

public class Client {

  private String name;
  private int age;
  private String industry;
  private String phone_Number;
  private String issue;
  private String id;

  public Client (String name, int age, String industry, String phone_Number, String issue) {
    this.name = name;
    this.age = age;
    this.industry = industry;
    this.phone_Number = phone_Number;
    this.issue = issue;
    this.id = name.substring(0,3) + phone_Number.substring(phone_Number.length()-3);
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getIndustry() {
    return industry;
  }

  public String getPhone_Number() {
    return phone_Number;
  }

  public String getIssue() {
    return issue;
  }

//  public int getId() {
//    return id;
//  }
}
