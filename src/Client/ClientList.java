package Client;

import java.util.ArrayList;

public class ClientList {

  private ArrayList <Client> clients;

  public ClientList () {
    this.clients = new ArrayList<>();
  }

  public ArrayList<Client> getClients() {
    return clients;
  }

  public void setClients (ArrayList<Client> loadedClients) {
    this.clients = loadedClients;
  }

  public ArrayList<Client> findClients (String searchType, String keyword) {

    ArrayList <Client> result = new ArrayList<>();


    for (int i = 0 ; i < clients.size();i ++){
      Client client = clients.get(i);

      if (searchType.equals("Name") && client.getName().contains(keyword)){
        result.add(client);
      } else if (searchType.equals("Age") && client.getAge().equals(keyword)){
        result.add(client);
      } else if (searchType.equals("Phone number") && client.getPhone_Number().contains(keyword)){
        result.add(client);
      }

    }
    return result;
  }

  public Client findSpecificClient (String id) {

    for (int i = 0 ; i < clients.size();i ++){
      Client client = clients.get(i);

      if (client.getId().equals(id)){
        return client;
      }

    }
    return null;
  }

  }


