package UI;

import Client.Client;

import java.util.ArrayList;

public class Ui {

  public String printClient (ArrayList<Client> clients){
    String result = "";
    for(Client client: clients) {
      result += client.getName() + ", ";
      result += "Age: " + client.getAge() + ", ";
      result += "Industry: " + client.getIndustry() + ", ";
      result += "Phone: " + client.getPhone_Number() + ", ";
      result += "Id: " + client.getId() + "\n";
    }
    return result;
  }

}
